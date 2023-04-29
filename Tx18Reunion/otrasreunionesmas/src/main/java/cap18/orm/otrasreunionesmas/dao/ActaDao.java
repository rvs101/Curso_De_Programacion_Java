package cap18.orm.otrasreunionesmas.dao;

import cap18.orm.otrasreunionesmas.dominio.Acta;

/**
 * Este fragmento de código es una clase Java que extiende una clase abstracta
 * llamada AbstractDao y se utiliza para acceder a los datos de una tabla de
 * base de datos utilizando Java Persistence API (JPA).
 *
 * @author rad
 *
 *         Clase llamada ActaDao que extiende la clase abstracta AbstractDao y
 *         está parametrizada con la clase Acta.
 *
 */
public class ActaDao extends AbstractDao<Acta> {

	/**
	 * Este es el constructor de la clase ActaDao.
	 */
	public ActaDao() {
// El método setClazz() se utiliza para Establecer la clase que se
//		utiliza en la instancia de EntityManager.
// La clase Acta es la que se va a utilizar para acceder
//		a los datos de la tabla de base de datos.
		setClazz(Acta.class);
	}
}
