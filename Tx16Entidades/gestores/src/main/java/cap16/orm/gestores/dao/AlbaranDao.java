package cap16.orm.gestores.dao;

import cap16.orm.gestores.Albaran;

/**
 * Pag 418 <br>
 * Clase Concreta <b>Albaran</b><br>
 * Crear el <b>DAO</b> ( el <b>objeto de acceso a datos</b> ) para manipular la
 * <b>clase Albaran</b> <br>
 * Nueva clase bajo el paquete <b>DAO</b> que extenderá <b>Clase
 * AbstractaDao&lt;T&gt;</b> por <b>AbstractDao&lt;Albaran&gt;</b><br>
 * Implementada por la <b>Clase AbstractaDao&lt;T&gt;</b> con el tipo de dato
 * <b>Albaran</b> podra invocar todos los metodos de la <b>Interface Dao</b>
 * <br>
 * <hr>
 * Tipos de relacion entre tablas<br>
 * <hr>
 * <b>Albaran</b> tiene la relacion <b>@ManyToOne</b> <br>
 * <b>Pedido</b> tiene la relacion <b>@OneToMany</b> <br>
 * <br>
 * Ahora podemos ir al main a crear albaranes , modificarlos y borrarlos
 * 
 * 
 * @author rad
 *
 */

public class AlbaranDao extends AbstractDao<Albaran> {

	/**
	 * Constructor por defecto <br>
	 * Metodo <b>setClazz</b> establece el tipo de objeto que se va a instanciar
	 * cada que se cree un objeto de tipo AlbaranDao
	 */
	public AlbaranDao() {
//		Establece el tipo de dato setClazz para poder invocar todos los metodos
		setClazz(Albaran.class);
	}

}
