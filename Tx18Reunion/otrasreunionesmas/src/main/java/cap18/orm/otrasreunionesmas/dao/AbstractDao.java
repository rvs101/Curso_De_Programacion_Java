package cap18.orm.otrasreunionesmas.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import cap18.orm.otrasreunionesmas.utiles.EntityManagerUtil;

/**
 * Clase Abstracta y Genérica que implementa la interfaz Dao<T><br>
 * <br>
 * Esta clase es una implementación abstracta de la interfaz Dao (Data Access
 * Object) <br>
 * <br>
 * Proporciona un conjunto de métodos genéricos para acceder a la base de datos
 * y realizar operaciones CRUD (Create, Read, Update, Delete) en cualquier tipo
 * de entidad.<br>
 * <br>
 * Es una clase genérica y utiliza el tipo de entidad T para especificar el tipo
 * de objeto que se está accediendo a través de la interfaz Dao <br>
 * <br>
 * La clase utiliza el EntityManager de JPA (Java Persistence API) para
 * interactuar con la base de datos y ejecutar consultas. <br>
 * <br>
 *
 * @author rad
 *
 * @param <T>
 */
public abstract class AbstractDao<T> implements Dao<T> {

	/**
	 * EntityManager - Interface <br>
	 * <br>
	 * EntityManagerUtil → Clase Concreta que contiene el metodo
	 * "getEntityManager()" la cual devuelve un objeto "entityManager" para ejecutar
	 * metodos los cuales consultan los datos en la BD <br>
	 * <br>
	 * Crea una instancia 'EntityManager' utilizando el metodo
	 */
	private EntityManager entityManager = EntityManagerUtil.getEntityManager();

	/**
	 * Declara una variable de instancia llamada `clazz` de tipo
	 * `Class&lt;T&gt;`<br>
	 * <br>
	 * `Class&lt;T&gt;` es una clase genérica que representa un tipo de clase en
	 * tiempo de ejecución. <br>
	 * <br>
	 * `T` es un parámetro de tipo que se reemplaza con un tipo real cuando se
	 * utiliza la clase
	 * <hr>
	 * Se usa para indicarle a la Clase concreta que implemente los metodos de
	 * AbstractDao&lt;T&gt; con que clase esta trabajando
	 * <hr>
	 * La utilidad de esta variable es almacenar el tipo de clase de la entidad que
	 * se está accediendo, permitiendo que la clase AbstractDao sea genérica y pueda
	 * manejar cualquier tipo de entidad. <br>
	 * <br>
	 * La variable clazz se utiliza en el método setClazz() de la clase AbstractDao,
	 * que permite establecer el tipo de entidad T que se está accediendo. <br>
	 * <br>
	 * Esto se hace mediante la asignación de la clase de la entidad a la variable
	 * clazz.<br>
	 * <br>
	 * Una vez establecido, el tipo de entidad se utiliza en los métodos de la clase
	 * AbstractDao para realizar operaciones en la base de datos.
	 */
	private Class<T> clazz;

	/**
	 * Metodo de Instancia<br>
	 * <br>
	 * Devuelve un objeto del tipo 'entityManager' que se utiliza para interactuar
	 * con el contexto de persistencia y administrar el ciclo de vida de las
	 * instancias de entidades, como crear y eliminar instancias de entidades
	 * persistentes, encontrar entidades por su clave primaria y realizar consultas
	 * sobre entidades <br>
	 * <br>
	 *
	 * @return objeto - entityManager - Para poder ejecutar metodos a la BD
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Método en instancia <br>
	 * <br>
	 * Pertenece a una clase que utiliza el patrón de diseño de repositorio se
	 * utiliza para proporcionar una capa de abstracción entre la capa de acceso a
	 * datos y la capa de negocio<br>
	 * <br>
	 * Metodo busca una entidad por su identificador y devuelve un objeto Optional
	 * que puede contener la entidad o no devolver nada
	 *
	 */
	public Optional<T> getCP(int id) {
		return Optional.ofNullable(entityManager.find(clazz, id));
	}
	
	/**
	 * 
	 */
	public Optional<T> get(int id) {
		return Optional.ofNullable(entityManager.find(clazz, id));
	}
	
	/**
	 * Método en instancia <br>
	 * <br>
	 * Pertenece a una clase que utiliza el patrón de diseño de repositorio se
	 * utiliza para proporcionar una capa de abstracción entre la capa de acceso a
	 * datos y la capa de negocio<br>
	 * <br>
	 * Metodo busca una entidad por su identificador y devuelve un objeto Optional
	 * que puede contener la entidad o no devolver nada
	 *
	 */
	@Override
	public Optional<T> get(Object id) {
		return Optional.ofNullable(entityManager.find(clazz, id));
	}

	/**
	 * Metodo generico de instancia
	 *
	 * Utiliza la clase EntityManager de Java Persistence API (JPA) para crear una
	 * consulta dinámica en SQL utilizando la clase Query <br>
	 * <br>
	 * La consulta se construye utilizando el nombre de la entidad de la clase
	 * (clazz.getName()), que se utiliza para recuperar el nombre de la tabla en la
	 * base de datos <br>
	 * <br>
	 * La consulta SQL se construye como "FROM " + clazz.getName() lo que significa
	 * que se seleccionan todos los registros de la tabla que corresponde a la
	 * entidad T. <br>
	 * <br>
	 * La consulta SQL se ejecuta llamando al método getResultList() de la clase
	 * Query <br>
	 * <br>
	 * Este método devuelve una lista de objetos T que se han recuperado de la base
	 * de datos.
	 *
	 * @resumen Método se utiliza para recuperar todos los registros de una tabla de
	 *          la bd y devolverlos como una lista genérica de objetos T utilizando
	 *          el EntityManager de JPA y la clase Query de Java.
	 *
	 * @return List<T> - Devuelve un objeto del tipo List<T> que contiene una
	 *         colección de entidades de tipo T donde T es un tipo de objeto
	 *         genérico que se define en el encabezado de la clase
	 *
	 */
	public List<T> getAll() {
		String sqlString = "FROM " + clazz.getName();
		Query query = entityManager.createQuery(sqlString);
		return query.getResultList();
	}

	/**
	 * Este método guarda una entidad en la base de datos.
	 */
	@Override
	public void save(T t) {
		executeInsideTransaction(entityManager -> entityManager.persist(t));
	}

	/**
	 * Este método actualiza una entidad en la base de datos.
	 */
	@Override
	public void update(T t) {
		executeInsideTransaction(entityManager -> entityManager.merge(t));
	}

	/**
	 * Este método elimina una entidad en la base de datos.
	 */
	@Override
	public void delete(T t) {
		executeInsideTransaction(entityManager -> entityManager.merge(t));
	}

	/**
	 * Establece la clase con la que se usará con la clase Abstracta de tipo
	 * generica
	 *
	 * @param clazz
	 */
	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

	/**
	 * Este método ejecuta una acción dentro de una transacción de base de datos<br>
	 * <br>
	 * Si la acción se completa correctamente, se confirma la transacción<br>
	 * <br>
	 * Si ocurre una excepción, se revierte la transacción y se lanza la
	 * excepción<br>
	 * <br>
	 *
	 * @param action
	 */
	private void executeInsideTransaction(Consumer<EntityManager> action) {
		EntityTransaction tx = entityManager.getTransaction();
		try {
			tx.begin();
// Metodo accept() de la Interfaz Consumer<T>
			action.accept(entityManager);
			tx.commit();
		} catch (RuntimeException re) {
			tx.rollback();
			throw re;
		}
	}
}

/**
 *
 * El método getTransaction() del objeto entityManager se utiliza para obtener
 * una instancia de la interfaz EntityTransaction. <br>
 * <br>
 * La interfaz proporciona métodos para "administrar transacciones" en el
 * contexto de persistencia. <br>
 * Puedes utilizar la instancia de EntityTransaction para iniciar, confirmar y
 * revertir transacciones en la base de datos <br>
 * EntityTransaction transaction = entityManager.getTransaction();
 * transaction.begin(); // Realizar operaciones en la base de datos
 * transaction.commit(); <br>
 * En este ejemplo, se inicia una transacción utilizando el método begin() se
 * utiliza para realizar operaciones en la base de datos y luego se confirma la
 * transacción utilizando el método commit().
 *
 */

/**
 * Consumer<T><br>
 * Es una interfaz funcional en Java que representa una operación que acepta un
 * solo argumento de entrada y no devuelve ningún resultado. <br>
 * <br>
 * Su método abstracto es accept (T t), que define una operación que se realiza
 * en el argumento dado. <br>
 * <br>
 * Se utiliza a menudo en operaciones de cadena como forEach en colecciones <br>
 * <br>
 * Un Consumer se puede utilizar de varias maneras. <br>
 * <br>
 * Una forma común es pasar una instancia de Consumer como argumento a un método
 * que realiza una operación en cada elemento de una colección. Por ejemplo:
 * <br>
 * List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
 * Consumer<String> printName = name -> System.out.println(name);
 * names.forEach(printName); <br>
 * <br>
 * En este ejemplo, creamos una lista de nombres y definimos un Consumer llamado
 * printName que toma un nombre como argumento y lo imprime en la consola. Luego
 * usamos el método forEach en la lista para aplicar el Consumer a cada elemento
 * de la lista.
 */