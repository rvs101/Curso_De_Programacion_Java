package elementos.tipo.genericos.ejemplo;

import java.util.ArrayList;

/**
 * Clase Genericas
 * 
 * Almacena Objetos del Clases Concretas
 * 
 * @author RVS
 *
 * @date 15 jul 2022 - 20:44:56
 *
 */
public class ElementosTipoGenericos2 {

	public static void main(String[] args) {

		Coche coche1 = new Coche();
		Coche coche2 = new Coche(5, 16.40, "Ford", true);
		Coche coche3 = new Coche(3, 32.20, "Porche", true);
		Coche coche4 = new Coche(5, 53.50, "Opel", true);
		Coche coche5 = new Coche(3, 20.50, "Fiat", true);

		ArrayList<Coche> cars = new ArrayList<Coche>();
		cars.add(coche1);
		cars.add(coche2);
		cars.add(coche3);
		cars.add(coche4);
		cars.add(coche5);

		int i = 1;

		for (Coche coche : cars) {
			System.out.println(" Coche : " + (i++) + " - " + coche);
		}

	}
}

/**
 * 
 *
 * @author RVS
 *
 * @date 15 jul 2022 - 21:00:55
 *
 */
class Coche {

	private int puertas;
	private double cilindrada;
	private String nombre;
	private boolean apagado;

	/**
	 * 
	 */
	public Coche() {
		this.puertas = 0;
		this.cilindrada = 0.0;
		this.nombre = "ninguno";
		this.apagado = true;
	}

	/**
	 * 
	 * @param ruedas
	 * @param cilindrada
	 * @param nombre
	 * @param apagado
	 */
	public Coche(int ruedas, double cilindrada, String nombre, boolean apagado) {
		this.puertas = ruedas;
		this.cilindrada = cilindrada;
		this.nombre = nombre;
		this.apagado = apagado;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setApagado(boolean apagado) {
		this.apagado = apagado;
	}

	public boolean getApagado() {
		return apagado;
	}

	@Override
	public String toString() {
		return "• Nombre: " + getNombre() + " ♦ Cilindros: " + getCilindrada() + " ♣ Puertas : " + getPuertas()
				+ " ♠ Apagado: " + getApagado();
	}

}

/**
 * 
 *
 * @author RVS
 *
 * @date 15 jul 2022 - 20:57:28
 *
 */
interface List<Coche> {

}

/**
 * 
 *
 * @author RVS
 *
 * @date 15 jul 2022 - 20:57:32
 *
 */
interface Map<String, Coche> {

}
