package conceptos.modificadores;

/**
 * El modificador "private" solo se aplica a atributos y metodos de instancia o
 * clase
 * 
 * Sera el modificador que por regla general se aplicará a los "atributos de la
 * clase"
 * 
 * Se aplicará también a los metodos que no queramos que sean invocados fuera de
 * la clase que los implementa limitando así el acceso a ellos desde otras
 * clases o "package/paquetes"
 * 
 * Este modificador define claramente el paradigma de "Encapsulamiento" evitando
 * que otras clases dentro del mismo "package/paquetes" puedan modificar sus
 * atributos o elementos
 *
 */
public class ModificadorPrivate {

	/**
	 * Atributo de instancia
	 * 
	 * Accesible mediante su clase principal y también utilizando los metodos de la propia clase
	 */
	private boolean f;

	/**
	 * Constructor por defecto
	 * 
	 * Solo accesible desde la propia clase
	 */
	private ModificadorPrivate() {
		this.f = false;
	}

	/**
	 * Constructor parametrizado
	 * 
	 * Solo accesible desde la propia clase
	 */
	private ModificadorPrivate(boolean f) {
		this.f = f;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * Solo accesible desde la propia clase
	 * 
	 * @param f
	 */
	private void setF(boolean f) {
		this.f = f;
	}

	/**
	 * Metodo de instancia
	 * 
	 * Solo accesible desde la propia clase

	 * @return f
	 */
	private boolean getF() {
		return f;
	}

	public static void main(String[] args) {

//		Instanciamos un objeto de clase principal
		ModificadorPrivate mp = new ModificadorPrivate(false);
//		Invocamos los metodos para modificar el atributo
		mp.setF(true);
		mp.getF();
//		A traves de un objeto podemos invocar el atributo privado de la instancia de la clase
//		para modificar su contenido
		mp.f = false;
	}

}
