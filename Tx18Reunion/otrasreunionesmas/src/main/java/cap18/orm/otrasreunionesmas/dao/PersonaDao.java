package cap18.orm.otrasreunionesmas.dao;

import cap18.orm.otrasreunionesmas.dominio.Persona;

/**
 *
 * @author rad
 *
 */
public class PersonaDao extends AbstractDao<Persona> {

	/**
	 * 
	 */
	public PersonaDao() {
		setClazz(Persona.class);
	}
}
