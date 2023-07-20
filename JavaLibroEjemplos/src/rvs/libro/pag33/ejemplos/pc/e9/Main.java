package rvs.libro.pag33.ejemplos.pc.e9;

/**
* <p>Título: Aprendiendo Java</p>
* <p>Descripción: Ejemplos del Libro Aprendiendo Java de Compunauta</p>
* <p>Copyright: Copyright (c) 2006 www.compunauta.com</p>
* <p>Empresa: julioduarte@gmail.com</p>
* 
* @author Julio César Duarte
* @version 2006.01.01
*/

/**
 * Clase Main
 * 
 * 19 jul 2023 - 12:38:47
 *
 * @author RVS
 *
 */
public class Main {

	/**
	 * Ejercicio9: <br>
	 * <br>
	 * Un comerciante tiene la venta de 4 tipos de productos principales <br>
	 * <br>
	 * Conociendo la cantidad vendida de cada artículo, y el precio unitario de cada
	 * artículo, hacer un programa que determine cuál fue el producto que realizó el
	 * mayor aporte en los ingresos. <br>
	 * <br>
	 * Calcular además, el porcentaje que dicho aporte significa en el ingreso
	 * absoluto por los cuatro artículos sumados.
	 */

	public static void main(String[] args) {

		Producto p1 = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();
		Producto p4 = new Producto();

		CantidadProducto cp1 = new CantidadProducto();
		CantidadProducto cp2 = new CantidadProducto();
		CantidadProducto cp3 = new CantidadProducto();
		CantidadProducto cp4 = new CantidadProducto();

		System.out.println("-------- Productos -------");
		System.out.println("--------------------------");
		int cantidadProducto1 = p1.getCantidadProducto1();
		double precioProducto1 = p1.getPrecioProducto1();
		double precioProductoCantidad1 = cp1.getPrecioCantidadTotal1();
		System.out.println("Cantidad 1º Producto : " + cantidadProducto1 + " - Precio : " + precioProducto1);
		System.out.println("Precio Total : 1º Producto : " + precioProductoCantidad1);

		int cantidadProducto2 = p2.getCantidadProducto2();
		double precioProducto2 = p2.getPrecioProducto2();
		double precioProductoCantidad2 = cp2.getPrecioCantidadTotal2();
		System.out.println("Cantidad 2º Producto : " + cantidadProducto2 + " - Precio : " + precioProducto2);
		System.out.println("Precio Total : 2º Producto : " + precioProductoCantidad2);

		int cantidadProducto3 = p3.getCantidadProducto3();
		double precioProducto3 = p3.getPrecioProducto3();
		double precioProductoCantidad3 = cp3.getPrecioCantidadTotal3();
		System.out.println("Cantidad 3º Producto : " + cantidadProducto3 + " - Precio : " + precioProducto3);
		System.out.println("Precio Total : 3º Producto : " + precioProductoCantidad3);

		int cantidadProducto4 = p4.getCantidadProducto4();
		double precioProducto4 = p4.getPrecioProducto4();
		double precioProductoCantidad4 = cp4.getPrecioCantidadTotal4();
		System.out.println("Cantidad 4º Producto : " + cantidadProducto4 + " - Precio : " + precioProducto4);
		System.out.println("Precio Total : 4º Producto : " + precioProductoCantidad4);

		System.out.println("--------------------------");
		System.out.println("Producto Totales ");
		System.out.println("--------------------------");
		System.out.println("Cantidad de producto : " + new CantidadProducto().getTotalProducto());

		System.out.println("--------------------------");
		System.out.println("Producto con mayor ingresos ");
		System.out.println("--------------------------");

		new CantidadProducto().showPrecioCantidadMayor();
		System.out.println("Ganancias Totales : " + new CantidadProducto().getGananciaCantidadTotal());
		new CantidadProducto().getTotalProductoPorcentaje();

	}
}
