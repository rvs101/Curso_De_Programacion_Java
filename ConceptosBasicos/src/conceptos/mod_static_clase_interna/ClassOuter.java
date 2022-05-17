package conceptos.mod_static_clase_interna;

/**
 * Clase Externa - Outer Class
 *
 */
public class ClassOuter {

//	Atributo de clase - Muchas copias distintas de los atributos para toda la clase , metodos y elmentos
	public int x;
	public int y;

//	Atributo de clase - 1 copia de los atributos para toda la clase , metodos y elmentos de la misma
	public static double do1;
	public static double do2;

	/**
	 * Constructor por defecto
	 */
	public ClassOuter() {
//Declaración e Inicialización de los atributos de instancia de una clase
		this.x = 0;
		this.y = 0;
//Declaración e Inicialización de los atributos clase de la propia clase
		ClassOuter.do1 = 0.0;
		ClassOuter.do2 = 0.0;
	}

	/**
	 * Constructor parametrizado
	 */
	public ClassOuter(int x, int y, int do1, int do2) {
//Declaración e Inicialización de los atributos de instancia de una clase
		this.x = x;
		this.y = y;
//Declaración e Inicialización de los atributos clase de la propia clase
		ClassOuter.do1 = do1;
		ClassOuter.do2 = do2;
	}

	/**
	 * Procedimiento de clase
	 * 
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Procedimiento de clase
	 * 
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Procedimiento de clase
	 * 
	 * @param do1
	 */
	public static void setDo1(double do1) {
		ClassOuter.do1 = do1;
	}

	/**
	 * Función de clase
	 * 
	 * @return do1
	 */
	public static double getDo1() {
		return do1;
	}

	/**
	 * Procedimiento de clase
	 * 
	 * @param do2
	 */
	public static void setDo2(double do2) {
		ClassOuter.do2 = do2;
	}

	/**
	 * Función de clase
	 * 
	 * @return do2
	 */
	public static double getDo2() {
		return do2;
	}

	/**
	 * Clase Static - 1 Sola copia de esta clase
	 *
	 */
	public static class InterClass {

//		Atributo de clase
		public static int xx;
//		Atributo de clase
		public static int yy;

		/**
		 * Constructor por defecto
		 */
		public InterClass() {
			InterClass.xx = 0;
			InterClass.yy = 0;
		}

		/**
		 * Constructor parametrizado que mediante atributos de clase
		 * 
		 * @param xx - Atributos de clase
		 * @param yy - Atributos de clase
		 */
		public InterClass(int xx, int yy) {
//			Atributos de clase para almacenar el valor de xx
			InterClass.xx = xx;
//			Atributos de clase para almacenar el valor de yy
			InterClass.yy = yy;
		}

		/**
		 * Procedimiento de clase
		 * 
		 * Establece el valor al atributo de clase xx

		 * @param xx - Atributo de clase
		 */
		public static void setXx(int xx) {
			InterClass.xx = xx;
		}

		/**
		 * Procedimiento de clase 
		 * 
		 * Establece el valor al atributo de clase yy
		 * 
		 * @param yy - Atributo de clase 
		 */
		public static void setYy(int yy) {
			InterClass.yy = yy;
		}

		/**
		 * Función de clase 
		 * 
		 * Devuelve el valor del atributo de clase
		 * 
		 * @return - Devuelve el valor de xx
		 */
		public static int getXx() {
			return xx;
		}

		/**
		 * Función de clase
		 * 
		 * Devuelve el valor del atributo de clase
		 * 
		 * @return - Devuelve el valor de yy
		 */
		public static int getYy() {
			return yy;
		}
	}

	public static void main(String[] args) {

// Instanciar objetos de la clase externa
		ClassOuter co = new ClassOuter();

// Invocación de metodos mediante el objeto instanciado
		co.setX(1);
		co.setY(11);
		System.out.println("1º Valor de x : " + co.getX() + " | Valor de y : " + co.getY() + " | ");

// Instanciamos un objeto que contiene atributos de instancia y de clase
		ClassOuter cos = new ClassOuter(2, 22, 222, 2222);
		System.out.println("2º Valor de x : " + cos.getX() + " | Valor de y : " + cos.getY() + " | ");

// Metodo de clase recibe como parametro el propio atributo de clase
		ClassOuter.setDo1(do1);
// Metodo de clase recibe como parametro el propio atributo de clase
		ClassOuter.setDo2(do2);

		System.out.println("2º Valor de do1 : " + ClassOuter.getDo1() + " | Valor de do2 : " + ClassOuter.getDo2() + " | ");

// Invocar metodos static de la clase externa Outer Class 
		InterClass.setXx(3);
// Invocar metodos static de la clase externa Outer Class 
		InterClass.setYy(13);
		
		System.out.println("3º Valor de x : " + InterClass.getXx() + " | Valor de y : " + InterClass.getYy() + " | ");

// Invocar metodos static de la clase externa Outer Class 
		new InterClass(4, 14);
		System.out.println("4º Valor de xx : " + InterClass.getXx() + " | Valor de yy : " + InterClass.getYy() + " | ");
	}
}
