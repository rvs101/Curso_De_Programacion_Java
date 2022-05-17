package conceptos.modificadores;

/**
 * 
 * @author RVS
 * @time 4 may 2022 - 11:47:42
 * 
 *       
 *       protected, podemos acceder al miembro desde el mismo paquete (como con
 *       el nivel de acceso privado del paquete) y además desde todas las
 *       subclases de su clase, incluso si se encuentran en otros paquetes
 * 
 */
public class ModificadorProtected {

	/**
	 * Atributo de instancia
	 * 
	 * Modificador protected
	 * 
	 * Accesible desde las clases de su "package/paquete" y de sus subclase "Clases
	 * Hijas" (esten o no en el mismo package/paquete)
	 */
	protected String nombre;

	/**
	 * Constructor por defecto
	 * 
	 * Modificador protected
	 * 
	 * Accesible desde las clases de su "package/paquete" y de sus subclase "Clases
	 * Hijas" (esten o no en el mismo package/paquete)
	 * 
	 */
	protected ModificadorProtected() {
		this.nombre = null;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * Modificador protected
	 * 
	 * Accesible desde las clases de su "package/paquete" y de sus subclase "Clases
	 * Hijas" (esten o no en el mismo package/paquete)
	 * 
	 * @param nombre
	 */
	protected ModificadorProtected(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Modificador protected
	 * 
	 * Accesible desde las clases de su "package/paquete" y de sus subclases "Clases
	 * Hijas" (esten o no en el mismo package/paquete)
	 * 
	 * @return nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * Modificador protected
	 * 
	 * Accesible desde las clases de su "package/paquete" y de sus subclases "Clases
	 * Hijas" (esten o no en el mismo package/paquete)
	 * 
	 * @param nombre
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
