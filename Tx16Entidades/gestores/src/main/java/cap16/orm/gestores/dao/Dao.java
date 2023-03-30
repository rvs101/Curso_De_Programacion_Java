package cap16.orm.gestores.dao;

import java.util.List;
import java.util.Optional;

/**
 * <b>Interface DAO</b>
 * <ol>
 * <li>Trataremos los distintos tipos de datos (entidades) para cada dato</li>
 * <li>Hagamos parametrizable estas interfaces mediante el tipo generico
 * &lt;T&gt;</li>
 * <li>Usamos esta Interface para implementar clases abstractas para acceder a
 * la base de datos de Hibernate</li>
 * </ol>
 * 
 * @author rad
 *
 * @param <T> - Elemento del tipo generico - Puede ser cualquier clase
 */
public interface Dao<T> {

	/**
	 * <br>
	 * Metodo de instancia de la clase Optional&lt;T&gt; <br>
	 * Un objeto contenedor que puede o no contener un valor no completo. <br>
	 * Si un valor está presente devuelve <b>'true' </b> <br>
	 * Si no está presente devuelve <b>empty</b> <br>
	 * 
	 * @param id - long - identificador númerico
	 * @return - Devuelve <b>true</b> si existe el valor long , devuelve 'empty' si
	 *         el valor no lo encuentra
	 */
	Optional<T> get(long id);

	/**
	 * Metodo de instancia<br>
	 * 
	 * Sin implementación<br>
	 * 
	 * Devuelve todos los elementos de tipo generico en un tipo de dato de la
	 * interface List <br>
	 * 
	 * @return - List&lt;T&gt; - Dato de tipo Interface List
	 */
	List<T> getAll();

	/**
	 * Procedimiento de instancia<br>
	 * 
	 * Establece y Almacena el tipo de valor de una clase Generica
	 * 
	 * @param t - Tipo de dato Generico
	 */
	void save(T t);

	/**
	 * Procedimiento de instancia<br>
	 * 
	 * Establece y Modifica el tipo de valor de una clase Generica
	 * 
	 * @param t - Tipo de dato Generico
	 */
	void update(T t);

	/**
	 * Procedimiento de instancia<br>
	 * 
	 * Establece y Elimina el tipo de valor de una clase Generica
	 * 
	 * @param t - Tipo de dato Generico
	 */
	void delete(T t);

}
