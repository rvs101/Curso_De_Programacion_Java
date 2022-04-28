package conceptos.basicos.uso_this;

/**
 * 
 * @author RVS
 *
 */
public class This_Ejemplo {

	/**
	 * Solo quiero un contador
	 */
	private static int x = 1;

	/**
	 * 
	 */
	public This_Ejemplo() {
		x = 0;
	}

	/**
	 * 
	 * @param x
	 */
	public This_Ejemplo(int x) {
// Este "this" hace referencia al constructor anterior
		this();
	}

	/**
	 * 
	 * @return
	 */
	public static int getX() {
		return x++;
	}

	public static void main(String[] args) {

		A a = new A();
		a.metodo_m();
		a.metodo_n();

	}
}

/**
 * 
 * @author RVS
 *
 */
class A {

	public A() {

	}

	/**
	 * Metodo de instancia
	 */
	public void metodo_m() {
		System.out.println("hello metodo_m " + This_Ejemplo.getX());
	}

	/**
	 * 
	 */
	public void metodo_n() {
		System.out.println("hello metodo_n " + This_Ejemplo.getX());
// 'this' representando a un supuesto objeto actual que invocará el metodo 
		this.metodo_m();
	}
}