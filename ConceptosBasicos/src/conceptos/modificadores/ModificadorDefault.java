package conceptos.modificadores;

/**
 * Modificador Default / Package
 * 
 * Cuando no usamos ninguna palabra clave explícitamente Java establecerá un
 * acceso por defecto a una determinada clase, método o propiedad.
 * 
 * El modificador de acceso por defecto también se llama
 * "package/paquete"-"private/privado", lo que significa que todos los miembros
 * son visibles dentro del mismo "package/paquete" pero no son accesibles desde
 * otros "package/paquete"
 * 
 */
class ModificadorDefault {

	/**
	 * Atributos de instancia
	 * 
	 * Visibles dentro del mismo paquete pero no son accesibles desde otros paquetes
	 * 
	 */
	int x;

	/**
	 * Constructor por defecto
	 * 
	 * Visibles dentro del mismo paquete pero no son accesibles desde otros paquetes
	 */
	ModificadorDefault() {
		this.x = 0;
	}

	/**
	 * Constructor por parametros
	 * 
	 * Visibles dentro del mismo paquete pero no son accesibles desde otros paquetes
	 * 
	 * @param x
	 */
	ModificadorDefault(int x) {
		this.x = x;
	}

	/**
	 * Método de instancia
	 * 
	 * Visibles dentro del mismo paquete pero no son accesibles desde otros paquetes
	 * 
	 * @return x
	 */
	int getX() {
		return x;
	}

	/**
	 * Procedimiento de instancia
	 * 
	 * Visibles dentro del mismo paquete pero no son accesibles desde otros paquetes
	 * 
	 * @param x
	 */
	void setX(int x) {
		this.x = x;
	}

}
