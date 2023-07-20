package rvs.libro.pag33.ejemplos.pc.e9;

/**
 * 
 * 19 jul 2023 - 13:32:06
 *
 * @author RVS
 *
 */
public class CantidadProducto {

	private Producto p1 = new Producto();

	private Producto p2 = new Producto();

	private Producto p3 = new Producto();

	private Producto p4 = new Producto();

	private double cantidadPrecio1;

	private double cantidadPrecio2;

	private double cantidadPrecio3;

	private double cantidadPrecio4;

	private double cantidadPrecioTotal;

	private boolean maxProducto1;

	private boolean maxProducto2;

	private boolean maxProducto3;

	private boolean maxProducto4;

	private static int valor = 0;

	private String nombreCantidadProducto;

	public double getCantidadPrecio1() {
		return cantidadPrecio1;
	}

	public void setCantidadPrecio1(double cantidadPrecio1) {
		this.cantidadPrecio1 = cantidadPrecio1;
	}

	public double getCantidadPrecio2() {
		return cantidadPrecio2;
	}

	public void setCantidadPrecio2(double cantidadPrecio2) {
		this.cantidadPrecio2 = cantidadPrecio2;
	}

	public double getCantidadPrecio3() {
		return cantidadPrecio3;
	}

	public void setCantidadPrecio3(double cantidadPrecio3) {
		this.cantidadPrecio3 = cantidadPrecio3;
	}

	public double getCantidadPrecio4() {
		return cantidadPrecio4;
	}

	public void setCantidadPrecio4(double cantidadPrecio4) {
		this.cantidadPrecio4 = cantidadPrecio4;
	}

	public int getCantidad1() {
		return p1.getCantidadProducto1();
	}

	public int getCantidad2() {
		return p2.getCantidadProducto2();
	}

	public int getCantidad3() {
		return p3.getCantidadProducto3();
	}

	public int getCantidad4() {
		return p4.getCantidadProducto4();
	}

	public double getPrecioCantidadTotal1() {
		return (p1.getCantidadProducto1() * p1.getPrecioProducto1());
	}

	public double getPrecioCantidadTotal2() {
		return (p2.getCantidadProducto2() * p2.getPrecioProducto2());
	}

	public double getPrecioCantidadTotal3() {
		return (p3.getCantidadProducto3() * p3.getPrecioProducto3());
	}

	public double getPrecioCantidadTotal4() {
		return (p4.getCantidadProducto4() * p4.getPrecioProducto4());
	}

	public double getCantidadPrecioTotal() {
		return cantidadPrecioTotal;
	}

	public void setCantidadPrecioTotal(double cantidadPrecioTotal) {
		this.cantidadPrecioTotal = cantidadPrecioTotal;
	}

	public String getNombreCantidadProducto() {
		return nombreCantidadProducto;
	}

	public void setNombreCantidadProducto(String nombreCantidadProducto) {
		this.nombreCantidadProducto = nombreCantidadProducto;
	}

	public void showPrecioCantidadMayor() {

		double total1 = getPrecioCantidadTotal1();

		double total2 = getPrecioCantidadTotal2();

		double total3 = getPrecioCantidadTotal3();

		double total4 = getPrecioCantidadTotal4();

		if ((total1 > total2) && (total1 > total3) && (total1 > total4)) {
			System.out.println("Producto 1 : " + total1);
		}

		if ((total2 > total1) && (total2 > total3) && (total2 > total4)) {
			System.out.println("Producto 2 : " + total2);
		}

		if ((total3 > total1) && (total3 > total2) && (total3 > total4)) {
			System.out.println("Producto 3 : " + total3);
		}

		if ((total4 > total1) && (total4 > total2) && (total4 > total3)) {
			System.out.println("Producto 4 : " + total4);
		}
	}

	public void getMayorCantidadProducto() {
		int total1 = getCantidad1();
		int total2 = getCantidad2();
		int total3 = getCantidad3();
		int total4 = getCantidad4();

		if ((total1 > total2) && (total1 > total3) && (total1 > total4)) {
			System.out.println("Producto 1 con " + total1 + " - Tiene la mayor cantidad");
			maxProducto1 = true;
			maxProducto2 = maxProducto3 = maxProducto4 = false;
		}
		if ((total2 > total1) && (total2 > total3) && (total2 > total4)) {
			System.out.println("Producto 2 con " + total2 + " - Tiene la mayor cantidad");
			maxProducto2 = true;
			maxProducto1 = maxProducto3 = maxProducto4 = false;
		}
		if ((total3 > total1) && (total3 > total2) && (total3 > total4)) {
			System.out.println("Producto 3 con " + total3 + " - Tiene la mayor cantidad");
			maxProducto3 = true;
			maxProducto2 = maxProducto1 = maxProducto4 = false;
		}
		if ((total4 > total1) && (total4 > total2) && (total4 > total3)) {
			System.out.println("Producto 4 con " + total4 + " - Tiene la mayor cantidad");
			maxProducto4 = true;
			maxProducto2 = maxProducto1 = maxProducto3 = false;
		}
	}

	public static void setValor(int valor) {
		CantidadProducto.valor = valor;
	}

	public static int getValor() {
		return valor;
	}

	public void getMaxCantidad() {
		getMayorCantidadProducto();
		if (maxProducto1 == true) {
			setValor(getCantidad1());
			setNombreCantidadProducto("Producto 1");
		}
		if (maxProducto2 == true) {
			setValor(getCantidad2());
			setNombreCantidadProducto("Producto 2");
		}
		if (maxProducto3 == true) {
			setValor(getCantidad3());
			setNombreCantidadProducto("Producto 3");
		}
		if (maxProducto4 == true) {
			setValor(getCantidad4());
			setNombreCantidadProducto("Producto 4");
		}
	}

	public double getGananciaCantidadTotal() {
		return (getPrecioCantidadTotal1() + getPrecioCantidadTotal2() + getPrecioCantidadTotal3()
				+ getPrecioCantidadTotal4());
	}

	public int getTotalProducto() {
		return (getCantidad1() + getCantidad2() + getCantidad3() + getCantidad4());
	}

	public int getTotalProductoPorcentaje() {
		int porcentaje = 0;
		System.out.println("----------------");
		getMaxCantidad();
		System.out.println("El producto : " + getValor() + " fue el que mas aporto con " + getNombreCantidadProducto());
		System.out.println("----------------");
		porcentaje = ((getTotalProducto() / getValor()) * 100);
		System.out.println("Porcentaje de aporte sobre el total es de : " + porcentaje);
		return porcentaje;
	}

}
