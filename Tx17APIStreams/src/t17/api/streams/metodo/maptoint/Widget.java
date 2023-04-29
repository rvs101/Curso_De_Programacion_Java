package t17.api.streams.metodo.maptoint;

import java.util.Arrays;
import java.util.List;

/**
 * SubClase Concreta
 * 
 * Definimos una clase Widget que tiene propiedades color y weight
 * 
 * Creamos una lista de objetos Widget y usamos el método stream para crear un
 * Stream de objetos Widget.
 * 
 * Usamos el método filter para filtrar solo los widgets rojos y el método
 * mapToInt para transformar el Stream de widgets en un IntStream de pesos.
 * 
 * Usamos el método sum del IntStream para calcular la suma de los weight.
 *
 */
public class Widget {

	public static void main(String[] args) {

		List<Widget> widgets = Arrays.asList(
				new Widget("red", 3), 
				new Widget("blue", 4),                              
				new Widget("red", 2),
				new Widget("green", 5));
		
		int sumOfWeights = widgets.stream()
								  .filter(w -> w.getColor().equals("red"))
								  .mapToInt(Widget::getWeight).sum();

		System.out.println("Resultado : " + sumOfWeights);
	}

//	Atributos de instancia
	private String color;

//	Atributos de instancia
	private int weight;

	/**
	 * Constructor por defecto
	 */
	public Widget() {
	}

	/**
	 * Constructor parametrizado
	 * 
	 * @param color
	 * @param weight
	 */
	public Widget(String color, int weight) {
		this.color = color;
		this.weight = weight;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - String - una cadena de texto de tipo color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Metodo de instancia
	 * 
	 * @return - int - un entero con el weight
	 */
	public int getWeight() {
		return weight;
	}

}