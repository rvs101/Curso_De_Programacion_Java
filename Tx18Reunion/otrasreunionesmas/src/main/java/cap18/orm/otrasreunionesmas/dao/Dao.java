package cap18.orm.otrasreunionesmas.dao;

import java.util.List;
import java.util.Optional;

/**
 * Interfaz genérica para un Data Access Object (DAO) <br>
 * <br>
 * La interfaz define un conjunto de métodos que deben ser implementados por
 * cualquier clase DAO que la implemente. <br>
 * <br>
 * Los métodos definidos en la interfaz permiten realizar operaciones <b>CRUD</b>
 * <b>(Create, Read, Update y Delete)</b> en objetos de <b>tipo T</b>
 *
 * La interfaz se define como genérica, lo que significa que puede trabajar con
 * cualquier tipo de objeto que se le pase
 *
 * El tipo de objeto se especifica en la definición de la interfaz como un
 * parámetro genérico T.
 *
 * @author rad
 * @param <T>
 *
 */
public interface Dao<T> {

	/**
	 * Busca y devuelve un objeto de tipo T con el id especificado. <br>
	 * El metodo retorna un objeto de tipo 'Optional' que contiene un objeto de tipo
	 * 'T' que corresponde al identificador 'id' especificado <br>
	 * La clase Optional es una clase contenedora que permite manejar valores nulos
	 * de una manera más segura <br>
	 * Si el objeto con el identificador especificado no existe en la BD el metodo
	 * devuelve un Optional vacio 'null'
	 *
	 * @param id
	 *
	 * @return Optional<T> Generico o un valor null
	 */
	Optional<T> get(int id);

	/**
	 * Metodo Generico<br>
	 * <br>
	 * Se utiliza para buscar y obtener un objeto de tipo T (clase genérica) de la
	 * base de datos según un identificador del objeto específico de (tipo Object)
	 *
	 * El método devuelve un objeto de tipo Optional<T> que puede contener o no el
	 * objeto T encontrado en la base de datos
	 *
	 * El uso de Optional permite manejar fácilmente la posibilidad de que no se
	 * encuentre ningún objeto con el identificador especificado sin tener que
	 * manejar excepciones
	 *
	 * @param id
	 * @return
	 */
	Optional<T> get(Object id);

	/**
	 * Método genérico<br>
	 * <br>
	 * Se utiliza para obtener una lista de todos los "objetos" de una <b>Clase
	 * Determinada</b> en una base de datos <br>
	 * <br>
	 * <b>No toma ningún argumento</b> y <b>devuelve una lista de objetos</b> de
	 * <b>tipo T</b> <br>
	 * <br>
	 * Para implementar este método se usa un lenguaje de consulta de objetos
	 * <b>(Object Query Language o JPQL)</b> para realizar una consulta en la base
	 * de datos y recuperar todos los objetos de una determinada clase
	 *
	 * @return El resultado de la consulta se devuelve como una lista de objetos de
	 *         tipo T
	 */
	List<T> getAll();

	/**
	 * Procedimiento de instancia
	 *
	 * Guarda un elemento de tipo T en la BD
	 *
	 * @param t
	 */
	void save(T t);

	/**
	 * Procedimiento que se implementara con la clase Abstracta AbstractDao
	 *
	 * @param t
	 */
	void update(T t);

	/**
	 * Procedimiento que se implementara con la clase Abstracta AbstractDao
	 *
	 * @param t
	 */
	void delete(T t);

}
