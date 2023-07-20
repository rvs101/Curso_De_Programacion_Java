package rvs.libro.pag33.ejemplos.pc.e9;

/**
 * Clase Concreta : Producto <br>
 * <br>
 * Contiene la información del producto
 * 
 * 19 jul 2023 - 12:43:07
 *
 * @author RVS
 *
 */
public class Producto {

	private static final int PRECIOPRODUCTO1 = 5;

	private static final int PRECIOPRODUCTO2 = 10;

	private static final int PRECIOPRODUCTO3 = 12;

	private static final int PRECIOPRODUCTO4 = 15;

	private static int cantidadProducto1 = (int) (Math.random() * (5 + 19) + 1);

	private static int cantidadProducto2 = (int) (Math.random() * (5 + 19) + 1);

	private static int cantidadProducto3 = (int) (Math.random() * (5 + 19) + 1);

	private static int cantidadProducto4 = (int) (Math.random() * (5 + 19) + 1);;

	public Producto() {
	}

	public double getPrecioProducto1() {
		return PRECIOPRODUCTO1;
	}

	public double getPrecioProducto2() {
		return PRECIOPRODUCTO2;
	}

	public double getPrecioProducto3() {
		return PRECIOPRODUCTO3;
	}

	public double getPrecioProducto4() {
		return PRECIOPRODUCTO4;
	}

	public int getCantidadProducto1() {
		return cantidadProducto1;
	}

	public int getCantidadProducto2() {
		return cantidadProducto2;
	}

	public int getCantidadProducto3() {
		return cantidadProducto3;
	}

	public int getCantidadProducto4() {
		return cantidadProducto4;
	}

}
