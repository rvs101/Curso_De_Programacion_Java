package cap18.orm.otrasreunionesmas.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import cap18.orm.otrasreunionesmas.dominio.Reunion;
import cap18.orm.otrasreunionesmas.dominio.Sala;

/**
 * Clase Concreta que implementa o extienda la clase
 * AbstractDao&lt;Reunion&gt;<br>
 * <br>
 * Contiene un contructor llamado ReunionDao que le indica a la clase AbstracDao
 * que vamos a trabajar a traves del constructor de la clase ReunionDAo ya que
 * la clase abstracta AbstractDao es del tipo generica
 *
 * @author rad
 *
 */
public class ReunionDao extends AbstractDao<Reunion> {

	/**
	 * Le indicamos a la clase Abstracta AbstractDao&lt;Reunion&gt; con que clase
	 * concreta vamos a trabajar a través del constructor de la clase ReunionDao ya
	 * que la clase abstracta AbstractDao es del tipo genérica
	 *
	 */
	public ReunionDao() {
		setClazz(Reunion.class);
	}

	/**
	 * Metodo de Instancia <br>
	 * <br>
	 * Creamos una query utilizando Criteria que filtra 2 criterios : <br>
	 * <br>
	 * Por sala y por Fecha entre el inicio y el final del dia recibido como
	 * parametro , ordenando por fecha ascendete y para las primeras reuniones del
	 * día que queden al principio del cartel<br>
	 * <br>
	 * Se usa para buscar reuniones en una sala especifica en una fecha determinada
	 * <br>
	 * Toma como parámetros un objeto 'Sala' y una instancia de 'LocalDate' <br>
	 * <br>
	 *
	 * @param sala
	 * @param fecha
	 * @return
	 */
	public List<Reunion> getBySalaAndFechaCP(Sala sala, LocalDate fecha) {
// Se obtiene una instancia de CriteriaBuilder que se utiliza para construir
// consultas dinamicas de manera programatica
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
// Se crea una instancia de CriteriaQuery que se utiliza para
// especificar la consulta que se va a realizar en este caso se busca la entidad Reunion
		CriteriaQuery<Reunion> criteriaQuery = cb.createQuery(Reunion.class);
// Se obtiene el objeto 'root' de la entidad Reunion que se
// utiliza como punto de partida para construir la consulta
		Root<Reunion> root = criteriaQuery.from(Reunion.class);
// Se define una restricción que especifica que la "reunión" debe tener lugar en la "sala" especificada.
		Predicate predSala = cb.equal(root.get("sala"), sala);
// Este error indica que los argumentos que se están pasando al método between no son del tipo esperado. El método between espera tres argumentos del tipo Expression<? extends Y>, pero en su lugar se están pasando argumentos de tipo Path<Y>, LocalDateTime y LocalDate.
// Una posible solución a este problema es utilizar un AttributeConverter ya que JPA 2.1 no soporta directamente el tipo LocalDate. Un AttributeConverter permite convertir entre el tipo de atributo de una entidad y el tipo de columna de la base de datos 1. ¿Te gustaría más información sobre cómo implementar un AttributeConverter?
		Predicate predFecha = cb.between(root.get("fecha"), fecha.atStartOfDay(), fecha.plusDays(1).atStartOfDay());
// Creamos una consulta select sobre 'root' y ejecutamos 'where' y aplicamos el 'and'
		criteriaQuery.select(root).where(cb.and(predSala, predFecha));
// Sobre la misma consulta hacemos un 'orderBy' , ejecutamos un 'asc'
		criteriaQuery.orderBy(cb.asc(root.get("fecha")));
// Ejecutamos la consulta a la BD
		Query query = getEntityManager().createQuery(criteriaQuery);
// Devuelve una List de objetos
		return query.getResultList();
	}
	
	
	public List<Reunion> getBySalaAndFecha(Sala sala, LocalDate fecha) {
		CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
		CriteriaQuery<Reunion> criteriaQuery = cb.createQuery(Reunion.class);
		Root<Reunion> root = criteriaQuery.from(Reunion.class);

		Predicate predSala = cb.equal(root.get("sala"), sala);
		Predicate predFecha = cb.between(root.get("fecha"), fecha.atStartOfDay(), fecha.plusDays(1).atStartOfDay());

		criteriaQuery.select(root).where(cb.and(predSala, predFecha));
		criteriaQuery.orderBy(cb.asc(root.get("fecha")));
		Query query = getEntityManager().createQuery(criteriaQuery);
		return query.getResultList();
	}
}
