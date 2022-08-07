package doc.tutorial.creacion.objetos;

/**
 * @see https://docs.oracle.com/javase/tutorial/java/javaOO/examples/CreateObjectDemo.java
 *
 * @author RVS
 *
 * @date 5 ago 2022 - 11:50:13
 *
 */
public class DocOracleCreacionObjetos {

	public static void main(String[] args) {
//		Declarar y crear un objeto 'point' y 2 objetos 'rectangle'

//		Coordenada en el plano
		Point originOne = new Point(23, 94);

//		Dimensiones del rectangulo
		Rectangule rectOne = new Rectangule(originOne, 100, 200);
		Rectangule rectTwo = new Rectangule(50, 100);

// Muestra el ancho, la altura y el área de rectOne
		System.out.println("Width of rectOne: " + rectOne.width);
		System.out.println("Height of rectOne: " + rectOne.height);
		System.out.println("Area of rectOne: " + rectOne.getArea());

// Establecer la posición de rectTwo en el plano de coordenadas x e y
		rectTwo.origin = originOne;

// Muestra la posición del rectTwo
		System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
		System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

// Mueve rectTwo y muestra su nueva posición
		rectTwo.setMove(40, 72);

		System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
		System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

	}
}

/**
 * Clase concreta para instanciar objetos y ejecutar el program
 *
 */
class CreateObjectDemo {

}

/**
 * Clase Interna Concreta
 * 
 * @see https://docs.oracle.com/javase/tutorial/java/javaOO/examples/Point.java
 * 
 */
class Point {

	/**
	 * Atributo de instancia
	 */
	public double x;

	/**
	 * Atributo de instancia
	 */
	public double y;

	/**
	 * Constructor por defecto : inicializa los objetos
	 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Constructor parametrizado : inicializa los objetos
	 * 
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

}

/**
 * Clase Interna Concreta
 * 
 * @see https://docs.oracle.com/javase/tutorial/java/javaOO/examples/Rectangle.java
 */
class Rectangule {

	/**
	 * Dentro de este objeto estarán todos los atributos y metodos de la clase Point
	 * que vaya instanciando
	 */
	public Point origin;

	/**
	 * Atributo de instancia
	 */
	public double width;

	/**
	 * Atributo de instancia
	 */
	public double height;

	/**
	 * 
	 */
	public Rectangule() {
		origin = new Point(0, 0);
	}

	/**
	 * 
	 * @param p
	 */
	public Rectangule(Point p) {
		origin = p;
	}

	/**
	 * Constructor que almacenara los valores que le pasemos por parametro
	 * 
	 * @param width
	 * @param height
	 */
	public Rectangule(int width, int height) {
		origin = new Point(0, 0);
		this.width = width;
		this.height = height;
	}

	/**
	 * ⚠ Constructor que almacenara los valores que le pasemos por parametro
	 * 
	 * @param point
	 * @param x
	 * @param y
	 */
	public Rectangule(Point point, double width, double height) {
		this.origin = point;
		this.width = width;
		this.height = height;
	}

	/**
	 * Procedimiento de instancia - Mueve los puntos dentro del eje de coordenadas
	 * 
	 * @param x
	 * @param y
	 */
	public void setMove(double x, double y) {
		origin.x = x;
		origin.y = y;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return : Devuelve el area del rectangulo
	 */
	public double getArea() {
		return (width * height);
	}

}
