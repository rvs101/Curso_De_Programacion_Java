package cap18.orm.otrasreunionesmas.dao;

import cap18.orm.otrasreunionesmas.dominio.Sala;

/**
 * Clase Concreta
 *
 * @author rad
 *
 */
public class SalaDao extends AbstractDao<Sala> {

	/**
	 * Le indicamos a la clase Abstracta AbstractDao&lt;Sala&gt; con que clase
	 * concreta vamos a trabajar a través del constructor de la clase SalaDao que ya
	 * la clase abstracta AbstractDao es de tipo genérica
	 */
	public SalaDao() {
		setClazz(Sala.class);
	}
}
