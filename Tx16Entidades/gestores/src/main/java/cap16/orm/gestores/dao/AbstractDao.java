package cap16.orm.gestores.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import cap16.orm.gestores.utiles.EntityManagerUtil;

/**
 * <h4>Clase Abstracta</h4>
 * 
 * Se usa para implementar la <code>interface genérica Dao &lt;T&gt; </code>
 * 
 * @author rad
 *
 * @param <T> - Clase Generica <T> - Cualquier clase
 */
public abstract class AbstractDao<T> implements Dao<T> {

	/**
	 * Pag 405 <br>
	 * <b>ATRIBUTO DE INSTANCIA</b><br>
	 * <em>Solo se ejecuta en esta clase</em>
	 * <ol>
	 * <li><b>Clase Concreta</b> <b>EntityManagerUtil</b> - Clase de utilidad <br>
	 * Implementa la <b><code>interface EntityManager</code></b> para usar todos los
	 * metodos de la <b>API de Persistencia</b> <br>
	 * </li>
	 * <li>Atributo de Instancia de la clase {@link AbstractDao} llamado
	 * <b>entityManager</b> <br>
	 * Es un <b>OBJETO</b> del tipo <b>interface EntityManager</b> implementado por
	 * el método <b>getEntityManager()</b> de la <b>clase Persistence</b> para poder
	 * invocar todos los métodos de la <b>API Persistence</b></li>
	 * 
	 * <li>Para crear la conexión a la base de datos
	 * <b><code>entityManager</code></b> se ha ido implementando a traves del metodo
	 * de la clase <b>Persistence.getEntityManagerFactory</b> y se ha creado un
	 * elemento u objeto de tipo <b>EntityManagerFactory</b> llamado <b>factory</b>
	 * <br>
	 * </li>
	 * <li>El objeto <b>factory</b> ha invocado el metodo
	 * <b>createEntityManager();</b> que ha devuelto un elemento de tipo
	 * <b>manager</b> de la <b>interface EntityManager</b> que sera el que se
	 * devuelva el método <br>
	 * </li>
	 * <li>Se puede decir que en cada capa / transición / paso se le ha ido
	 * añadiendo un elemento para que el <b>método</b> pueda realizar una tarea
	 * especifica cargando o teniendo una serie de elementos de configuración en su
	 * interior</li>
	 * <li>El <b>objeto</b> que se ha ido transformando o implementando a cada paso
	 * dentro del metodo</li>
	 * </ol>
	 */
	private EntityManager entityManager = EntityManagerUtil.getEntityManager();

	/**
	 * Pag 405 <br>
	 * <em>Solo se ejecuta en esta clase</em><br>
	 * • Atributo de Instancia <br>
	 * • <b>No podemos inicializar la variable porque no sabemos aún que valor
	 * tomara en la clase abstracta</b> <br>
	 * • Creamos un "metodo set" especifico para este atributo para establecerle el
	 * valor que necesite cuando se invoce en una clase concreta
	 * <hr>
	 * • Lleva un objeto de la clase con la que vamos a trabajar <br>
	 * &lt;T&gt; - el tipo de la clase modelada por este objeto Class. <br>
	 * • Class&lt;T&gt; es una clase genérica en Java que se utiliza para
	 * representar la clase de un tipo de objeto <br>
	 * • Esta clase contiene información sobre el tipo de objeto que representa,
	 * como su nombre, su estructura y sus métodos. <br>
	 * • La clase Class&lt;T&gt; se utiliza a menudo en Java para obtener
	 * información sobre un tipo de objeto en tiempo de ejecución, lo que permite a
	 * los desarrolladores crear código que se comporte de manera diferente
	 * dependiendo del tipo de objeto con el que esté trabajando. <br>
	 * • Por ejemplo, la clase Class&lt;T&gt; se puede utilizar para crear métodos
	 * genéricos que puedan trabajar con diferentes tipos de objetos de manera
	 * transparente. <br>
	 * • En resumen, la clase Class&lt;T&gt; es una herramienta muy útil en Java que
	 * permite a los desarrolladores obtener información sobre los tipos de objetos
	 * en tiempo de ejecución y crear código más flexible y reutilizable. <br>
	 */
	private Class<T> clazz;

	/**
	 * Pag 405 <br>
	 * <hr>
	 * <b>Procedimiento de Instancia</b> <br>
	 * En esta <b>Clase Abstracta</b> no sabemos aun que valor tomara este tipo de
	 * dato que contiene o utiliza la <b>Clase Generica</b> asi que le haremos un
	 * metodo especifico para establecerle mas adelante un valor definido mediante
	 * una clase <br>
	 * 
	 * @param clazz - Tipo de dato <code>Class &lt;T&gt;</code> genérico "PUEDE SER
	 *              UN OBJETO DE CUALQUIER CLASE> que le asigna un valor para poder
	 *              invocar los atributos y metodos de la clase en cuestión
	 */
	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

	/**
	 * <b>Privado Procedimiento de instancia</b><br>
	 * <em>Solo se ejecuta en esta clase</em> <br>
	 * <b>Consumer<code>&lt;T&gt;</code> - Interface Funcional</b>
	 * <ol>
	 * <li><b>Consumer<code>&lt;T&gt;</b></code> un objeto pero no devuelve nada
	 * <br>
	 * El metodo se utiliza en el interior de los metodos para <b>guardar ,
	 * actualizar , borrar</b></li>
	 * <li>Como modifican los registros de la BD debe de ser capaz de deshacer la
	 * ejecución si hay algun problema y también debe de indicar cuando empezamos y
	 * terminamos una transacción <br>
	 * </li>
	 * <li>Indica cuando empieza y cuando termina la transacción para todas las
	 * acciones con la base de datos <br>
	 * </li>
	 * <ol>
	 * 
	 * @param action - Consumer&lt;EntityManager&gt;
	 */
	private void executeInsideTransaction(Consumer<EntityManager> action) {
// Le pedimos una transaccion al EntityManager que tenemos definido como ATRIBUTO de INSTANCIA en esta clase 
		EntityTransaction tx = entityManager.getTransaction();
// Intentamos iniciarla 		
		try {
//			Comienza la transacción
			tx.begin();
//			Ejecutamos la acción de turno
//			Realiza esta operación en el argumento dado pero no devuelve nada
			action.accept(entityManager);
//			Ejecutamos el commit para confirma la orden
			tx.commit();
//	[RuntimeException es la superclase de aquellas excepciones que se pueden lanzar
//	durante el funcionamiento normal de la máquina virtual de Java.]
//  RuntimeException y sus subclases son excepciones no verificadas
		} catch (RuntimeException e) {
//			Deshacemos la acción en caso de error
			tx.rollback();
//			Lanzamos la excepción
			throw e;
		}
	}

	/**
	 * Pag 405
	 * 
	 * Optional<T>
	 * 
	 * Solo puede contener un valor o no pero nunca devuelve un valor null en todo
	 * caso 'empty'
	 * 
	 * Le pedimos al atributo de la clase EntityManager que invoque su metodo (find)
	 * 
	 * Le pasamos la clase de la entidad (clazz para que sepa que tabla buscar) y el
	 * id (para que sepa darnos el registro que estabamos buscando)
	 * 
	 * Metodo find() → <T> T find(Class<T> entityClass, Object primaryKey)
	 * 
	 * [Busque una entidad de la clase definida como 'clazz' y la clave principal
	 * especificadas 'id' .]
	 * 
	 * [Si la instancia de la entidad está contenida en el contexto de persistencia,
	 * se devuelve desde allí.]
	 * 
	 * [La instancia de entidad encontrada o nulo si la entidad no existe]
	 * 
	 */
	public Optional<T> get(long id) {
// Optional - Solo puede contener o no un valor no nulo 
// Le pedimos a EntityManager que busque (find) 
// Le pasamos la clase de la entidad(clazz "Qué no tenemos definida todavia" para que sepa que tabla buscar) 
// y el id(para que sepa darnos el registro que estabamos buscando)
// Utilizamos el metodo 'ofNullable()' para asegurarnos de que maneja la salida en caso de no encontrar resultados		
		return Optional.ofNullable(entityManager.find(clazz, id));
	}

	/**
	 * Pag 405 <br>
	 * Metodo de Instancia
	 * <ol>
	 * <li>Creamos una consulta a la base de datos con una cadena de texto de
	 * <b>tipo String</b> que esta compuesta por el objeto de tipo generico
	 * <b>'clazz'</b> + el metodo <b>getName()</b> haciendo posible que cualquier
	 * clase pueda ser consultada después de invocar el metodo
	 * <b>setClazz<T></b></li>
	 * 
	 * <li>Le pasamos al objeto <b>entityManager</b> una cadena de texto con la
	 * consulta a la base de datos el cual mediante el metodo <b>createQuery()</b>
	 * de la interface <b>EntityManager</b> e implementando por la <b>clase
	 * Persistente</b> genera un objeto del tipo <b>query</b> con los datos de la BD
	 * y devuelve un objeto de tipo <b>List<T></b> con todos los datos la base de
	 * datos</li>
	 * 
	 * <li>Almacenamos la consulta y mostramos todos los resultados</li>
	 * </ol>
	 * 
	 * @return <b>query.getResultList()</b> → Devuelve todos los resultados de la
	 *         tabla
	 * 
	 */
	public List<T> getAll() {
//1- Creamos una cadena de texto con la consulta a la BD con el valor asignado a 'clazz'	
//	→ clazz : objeto de la clase genérica Class <T>
		String qlString = "FROM " + clazz.getName();
//2- El metodo createQuery("Consulta") de la interface "EntityManager" 
//	 que fue implementado por la clase Persistence 
//	 para realizar consultas a la base de datos y el cual devuelve un objeto de tipo Query
//		
//   • El metodo createQuery("Consulta") devuelve un objeto de tipo Query 
//	   que para poderlo almacenar y utilizar debemos de crear un objeto de tipo de dato "Query" 
		Query query = entityManager.createQuery(qlString);
//3- Con el objeto 'query' invocamos el metodo getResultList() 
//	 que realiza una consulta y devuelve todos los resultados de la BD en una Lista no tipificada	
		return query.getResultList();
	}

	/**
	 * Procedimiento de Instancia <br>
	 * Se esta ejecutando una interface funcional <br>
	 * Mediante 'entityManager' le pedimos que haga la persistencia del objeto
	 * recibido y la acción se la pasamos al metodo 'executeInsideTransaction' para
	 * gestionar la transacción
	 */
	public void save(T t) {
//		                         Utilizamos una expresión lambda para no tener que usar una clase anonima
		executeInsideTransaction(entityManager -> entityManager.persist(t));
	}

	/**
	 * Procedimiento de Instancia
	 *
	 * Fusión de los datos mediante la transacción
	 */
	public void update(T t) {
//		                         Lanza metodo lambda
		executeInsideTransaction(entityManager -> entityManager.merge(t));
	}

	/**
	 * Procedimiento de Instancia
	 * 
	 * Elimina los datos mediante la transacción
	 */
	public void delete(T t) {
//		                         Lanza metodo lambda
		executeInsideTransaction(entityManager -> entityManager.remove(t));
	}

	/**
	 * Pagina 410 <br>
	 * <br>
	 * Metodo de apoyo para usarse en el método <b>pedidoMasReciente()</b>
	 * 
	 * @return - <b>EntityManager</b> : Tipo de dato <b>Interface EntityManager</b> para gestionar
	 *         acciones sobre la BD
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}
}
