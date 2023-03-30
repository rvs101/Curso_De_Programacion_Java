package cap16.orm.gestores.dao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import cap16.orm.gestores.Pedido;
import net.bytebuddy.asm.Advice.Local;

/**
 * Clase Concreta <b>PedidoDao</b> <br>
 * <br>
 * <b>Resumen</b><br>
 * <br>
 * Es una forma de establecer que tipo de elementos genericos vamos a usar para
 * invocar los metodos implementandos de la <b>interfaz Dao</b> <br>
 * <br>
 * Necesitamos : <b>Interface Dao</b> - para declarar todos los metodos <br>
 * <br>
 * Necesitamos : <b>Clase Abstracta AbstractDao</b> - para implementar todos los
 * metodos de la interface y crear nuevos metodos<br>
 * <br>
 * Necesitamos : <b>Clase Concreta PedidoDao</b> que implementa el metodo de la
 * <b>clase abstracta AbstractDao</b> que implementa el <b>metodo setClazz</b>
 * en este caso la <b>clase Pedido</b> para establecer la clase que usara
 * metodos de la <b>clase Abstracta</b> y de la <b>Interface Dao</b><br>
 * <br>
 * 
 * Esta <b>clase PedidoDao</b> sirve para invocar y extender la <b>clase
 * abstracta AbstractDao</b> y pasarle por parametro generico <b>&lt;T&gt;</b>
 * el nombre de la <b>clase concreta Pedido</b> para que al establecerle el tipo
 * de dato que vamos a usar mediante el <b>metodo setClazz()</b> poder invocar
 * todos los metodos implementados de la <b>clase Abstracta
 * AbstractDao&lt;T&gt;</b> creados en la <b>Interface Dao</b> <br>
 * <hr>
 * Anteriormente la <b>Clase Abstracta AbstractDao&lt;T&gt;</b> solo recibia
 * elementos de <b>tipo Genericos</b> mediante el <b>parametro
 * AbstractDao&lt;T&gt;</b> pero ahora necesitamos que todos los metodos de la
 * <b>Interface Dao</b> se puedan usar en la <b>clase Perdido</b><br>
 * <br>
 * Para poder hacerlo necesitamos que la <b>clase Abstracta AbstractDao&lt;T&gt;
 * </b> pueda implementar la <b>clase Pedido</b> y para eso lo que hacemos es
 * indicarle al <b>parametro &lt;T&gt;</b> que <b>Clase Concreta PedidoDao</b>
 * le vamos a pasar que en este caso será la clase <b>Pedido</b> <br>
 * <br>
 * Ahora tenemos una <b>clase Abstracta AbstractDao&lt;T&gt;</b> que paso a
 * <b>AbstractDao&lt;Pedido&gt;</b> para poder invocar todos los metodos que
 * existe en la <b>Interfaz Dao</b> y que fueron implementados por la <b>clase
 * Abstracta AbstractDao</b> <br>
 * <br>
 * Esta <b>Clase Concreta PedidoDao</b> establece explicitamente la <b>clase
 * Abstracta AbstractDao &lt;PedidoDao&gt;</b> para que la <b>clase Pedido</b>
 * pueda usar los metodos implementados de la <b>interface Dao </b><br>
 * 
 * @author rad
 * 
 * @param PedidoDao - Clase Concreta exclusiva que implementa la clase Abstracta
 *                  Genérica <b>AbstractDao&lt;Pedido&gt;</b> <br>
 * 
 * @apiNote Generica llamada &lt;T&gt; se cambia por &lt;Pedido&gt; pero como
 *          queremos usar los metodos de la <b>Interface Dao</b> para esta clase
 *          la cambiamos &lt;T&gt; por &lt;Pedido&gt; para que todos los metodos
 *          se puedan invocar e implementar en esta <b>clase PedidoDao</b>
 *
 */
public class PedidoDao extends AbstractDao<Pedido> {

	/**
	 * Constructor por defecto <br>
	 * <br>
	 * La <b>clase abstracta 'AbstractDao&lt;T&gt;'</b> que era del <b>tipo
	 * genérico</b> se creo exclusivamente para implementar <b>clase PedidoDao</b>
	 * con la que vamos a trabajar ahora porque era del tipo generico &lt;T&gt; pero
	 * ahora le indicamos explicitamente de que clase se trata
	 * 'AbstractDao&lt;Pedido&gt;'<br>
	 * <br>
	 * Ahora añadimos al constructor de <b>PedidoDao</b> la clase con la que vamos a
	 * trabajar
	 * 
	 */
	public PedidoDao() {
// La clase Abstracta "AbstractDao" tiene un atributo llamado :
//		
//public Class setClazz
//
// El metodo setClazz que se usaba para establecer 
// una Clase Concreta vamos a trabajar y luego poder invocarle 
// todos los metodos de esa misma Clase Concreta que sustituye 
// una Clase Genérica <T>
//		
// Indicamos al metodo de la clase Abstracta AbstractDao que vamos 
// a sustituir la clase genérica por una clase concreta 

// Cada vez que instanciamos un objeto de la clase PedidoDao
// el elemento de tipo generico pasara a ser una clase concreta 'Pedido.class'	
		setClazz(Pedido.class);
	}

	/**
	 * Pagina 410 - Consultas simples <br>
	 * <br>
	 * <b>Metodo de instancia</b> de la <b>clase PedidoDao</b> que hereda de la
	 * clase <b>AbstractDao&lt;Pedido&gt;</b><br>
	 * <br>
	 * El metodo nos devuelve un objeto de tipo <b>Pedido</b> con el pedido más
	 * reciente <br>
	 * 
	 * @return objeto Pedido - con una consulta a la BD con el registro más reciente
	 *         ordenador de forma descendiente
	 */
	public Pedido pedidoMasRecienteCorrecto() {
// Consulta a la BD desde Java
//                                  Nombre de la tabla es el nombre de la clase en Java
//		                                ↓                           Atributo de clase 
//		                                ↓                               ↓   Metodo de SQL
//		                                ↓                               ↓     ↓  Ordenador por el "atributo fecha" descendiente  
//		                                ↓                               ↓     ↓     ↓     Atributo de clase
//		                                ↓                               ↓     ↓     ↓         ↓   Elemento Descendiente 
//		                                ↓                               ↓     ↓     ↓         ↓     ↓
		String qlString = "FROM " + Pedido.class.getName() + " WHERE fecha < now() order by fecha desc";
//                     Metodo propio que implementa la interface EntityManager mediante la clase Persistence y devuelve un objeto tipo Query
//		                  ↓              Metodo de la Interface EntityManager que recibe un String en forma de consulta
//		                  ↓                 ↓                  Metodo Query que devuelve un máximo resultado  
//		                  ↓                 ↓                     ↓
		Query query = getEntityManager().createQuery(qlString).setMaxResults(1);
//                     Objeto de la clase Query invoca el metodo getSingleResult() 
//                        ↓  Ejecute una consulta SELECT que devuelva un único resultado sin tipo.
//                        ↓         ↓
		return (Pedido) query.getSingleResult();
//		NoResultException - if there is no result
	}

	/**
	 * Pagina 410 - Consultas simples <br>
	 * <br>
	 * <b>Metodo de instancia</b> de la <b>clase PedidoDao</b> que hereda de la
	 * clase <b>AbstractDao&lt;Pedido&gt;</b><br>
	 * <br>
	 * El metodo nos devuelve un objeto de tipo <b>Pedido</b> con el pedido más
	 * reciente <br>
	 * 
	 * @return objeto Pedido - con una consulta a la BD con el registro más reciente
	 *         ordenador de forma descendiente
	 */
	public Pedido pedidoMasReciente() {
// Consulta a la BD desde Java
//                                  Nombre de la tabla es el nombre de la clase en Java
//		                                ↓                           Atributo de clase 
//		                                ↓                               ↓   Metodo de SQL
//		                                ↓                               ↓     ↓  Ordenador por el "atributo fecha" descendiente  
//		                                ↓                               ↓     ↓     ↓     Atributo de clase
//		                                ↓                               ↓     ↓     ↓         ↓   Elemento Descendiente 
//		                                ↓                               ↓     ↓     ↓         ↓     ↓
		String qlString = "FROM " + Pedido.class.getName() + " WHERE fecha < now() and id > 100 order by fecha desc";
//                     Metodo propio que implementa la interface EntityManager mediante la clase Persistence y devuelve un objeto tipo Query
//		                  ↓              Metodo de la Interface EntityManager que recibe un String en forma de consulta
//		                  ↓                 ↓                  Metodo Query que devuelve un máximo resultado  
//		                  ↓                 ↓                     ↓
		Query query = getEntityManager().createQuery(qlString).setMaxResults(1);
//                     Objeto de la clase Query invo                                                                                                                                                                                                                                                                                                                                                                                                              ca el metodo getSingleResult() 
//                        ↓  Ejecute una consulta SELECT que devuelva un único resultado sin tipo.
//                        ↓         ↓
		return (Pedido) query.getSingleResult();
// • El metodo 'getSingleResult()' devuelve el error 'javax.persistence.NoResultException' porque no hay resultados disponibles
// Exception in thread "main" javax.persistence.NoResultException: No entity
// found for query
//		at org.hibernate.query.internal.AbstractProducedQuery.getSingleResult(AbstractProducedQuery.java:1583)
//		at cap16.orm.gestores.dao.PedidoDao.pedidoMasReciente(PedidoDao.java:126)
//		at cap16.orm.gestores.App.main(App.java:38)		
	}

	/**
	 * Pagina 425 <br>
	 * 
	 * <ul>
	 * <li>Interface 'CriteriaBuilder'<br>
	 * Crear consultas de manera programática y más dinámica que las consultas
	 * escritas en SQL
	 * 
	 * <br>
	 * Más Complejas mediante objetos en lugar de SQL</li>
	 * 
	 * <li>Clase 'Root' especifica la entidad y nos permite asignarle criterios</li>
	 * </ul>
	 * <hr>
	 * 
	 * Le pedimos al EntityManager una interface del tipo CriteriaBuilder al que le
	 * indicamos que nos cree un objeto del tipo CriteriaQuery del tipo Pedido<br>
	 * Pedimos un objeto de la clase Root que es una representación de nuestra
	 * entidad y nos servirá para ir construyendo los criterios <br>
	 * La fecha sea anterior a <code>now()</code> y el criterio de ordenación<br>
	 * Terminamos pidiendo una query 'normal' al 'EntityManager a partir de la
	 * CriteriaQuery que hemos construido y limitamos el máximo de resultados a uno
	 * <br>
	 * Pedimos a esa 'query' un unico resultado
	 * 
	 * 
	 * 
	 * @return
	 */
	public Pedido pedidoMasRecienteCriteria() {
// Interface 'CriteriaBuilder' necesita el metodo getEntityManager() implementando por la Interface 'EntityManager' para invocar el metodo 'getCriteriaBuilder()' y así poder realizar la consultas
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
// Interface 'CriteriaQuery' establece la entidad <Pedido> a la que vamos a hacerle la consulta y define la funcionalidad especifica de las consultas de nivel superior  
		CriteriaQuery<Pedido> criteriaQuery = cb.createQuery(Pedido.class);
// Objeto 'root' para definir la entidad en la que se van a hacer las consultas y le indicamos mediante el metodo 'from()' la entidad de la tabla Pedido
		Root<Pedido> root = criteriaQuery.from(Pedido.class);
// • Confeccionamos la consulta
// 1- Creamos el SELECT	y el WHERE sobre la tabla y le añadimos los parametros de la consulta
		// Metodo 'lessThan → menos que'
		criteriaQuery.select(root).where(cb.lessThan(root.get("fecha"), LocalDateTime.now()));
// 2- Le indicamos la ordenación y desde donde mostrar los resultados sobre la columna 'fecha'
		criteriaQuery.orderBy(cb.desc(root.get("fecha")));
// 3- Creamos el objeto 'Query' para obtener los resultados y le indicamos que la consulta solo muestre un resultado
		Query query = getEntityManager().createQuery(criteriaQuery).setMaxResults(1);
// 4- Devolvemos el objeto Pedido con la consulta
		return (Pedido) query.getSingleResult();
	}

	/**
	 * Pagina 413 <br>
	 * <br>
	 * Pedidos de la semana pasada<br>
	 * 
	 * @return <b>List&lt;Pedido&gt;</b> - Devuelve una lista de objetos del tipo
	 *         Pedidos de la semana pasada
	 */
	public List<Pedido> pedidosSemanaPasada() {
//		Consulta SQL - Obtenemos 2 intervalos de tiempos diferentes para calcular las fechas
		String qlString = "FROM " + Pedido.class.getName() + " WHERE fecha between ?1 and ?2";
//		Creamos la consulta a la BD mediante el metodo 'getEntityManager' que vuelve un objeto de tipo Query
		Query query = getEntityManager().createQuery(qlString);
//		Creamos los intervalos de las fechas mediante el metodo getEsteLunes() 
//		para establecer el primer día de la semana
		LocalDate esteLunes = getEsteLunes();
//		Pagina 414 - Lunes de hace 10 semanas
//		LocalDate esteLunes = getEsteLunes().minusWeeks(10);
//		Devuelve una semana anterior
		LocalDate lunesAnterior = esteLunes.minusWeeks(1);
//		Establece 2 parametros básicos para hacer la consulta
//		                                    Primera hora del Lunes
		query.setParameter(1, lunesAnterior.atStartOfDay());
//		                                    Primera hora del Lunes
		query.setParameter(2, esteLunes.atStartOfDay());
//      Devuelve el objeto List<Pedido> con todos los resultados de la consulta
		return query.getResultList();
	}

	/**
	 * Pagina 413 <br>
	 * <br>
	 * Devuelve un objeto estático 'una sola copia' del tipo LocalDate
	 * 
	 * @return objeto LocalDate - Devuelve un objeto que tiene como valor el lunes
	 *         de la semana
	 */
	public static LocalDate getEsteLunes() {
//		Creamos un objeto 'now' LocalDate y le asignamos la fecha actual
		LocalDate now = LocalDate.now();
//		Creamos un objeto 'diaSemana' y le pasamos la fecha actual para obtener el día
		DayOfWeek diaSemana = now.getDayOfWeek();
//		Devolvemos el día de la semana y le indicamos que sea 
		return now.minusDays(diaSemana.getValue() - 1);
	}

}
