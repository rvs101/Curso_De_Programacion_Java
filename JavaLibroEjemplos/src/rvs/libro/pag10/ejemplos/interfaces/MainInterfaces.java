package rvs.libro.pag10.ejemplos.interfaces;

/**
 * Clase Concreta - Principal <br>
 * <br>
 * 20 jun 2023 8:39:47 <br>
 * <br>
 * 
 * @author Robot
 */
public class MainInterfaces {

	public static void main(String[] args) {

		CircleClass cPorDefecto = new CircleClass();
		System.out.println("Valor : " + cPorDefecto.toString());

		CircleClass c1 = new CircleClass(2.5, "Rojo");
		System.out.println("Valor : " + c1.toString());

		CircleClass c2 = new CircleClass(5.0, "Verde");
		System.out.println("Valor : " + c2.toString());

		CircleClass c3 = new CircleClass((Math.random() * (1 + 10 + 1)), "Rojo");
		System.out.println("Valor : " + c3.toString());

	}
}
