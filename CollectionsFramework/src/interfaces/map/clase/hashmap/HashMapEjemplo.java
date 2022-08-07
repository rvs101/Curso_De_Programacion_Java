package interfaces.map.clase.hashmap;

import java.util.HashMap;

public class HashMapEjemplo {

	/**
	 * 
	 */
	private static HashMap<String, String> capitalCities;

	/**
	 * 
	 * @return Devolver claves y valores (País, Ciudad)
	 */
	public static HashMap<String, String> getCapitalCities() {
		capitalCities = new HashMap<String, String>();
		// Añadir claves y valores (País, Ciudad)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		return capitalCities;
	}

	/**
	 * Añadir claves y valores (País, Ciudad)
	 */
	
	public static void getValues() {
		System.out.println("------------------");
		System.out.println("Total de Elementos : " + getCapitalCities().size());
		System.out.println("------------------");
		for (String llaves : getCapitalCities().keySet()) {
			System.out.println(llaves);
		}

		System.out.println("----------");

		for (String valores : getCapitalCities().values()) {
			System.out.println(valores);
		}

	}

	public static void main(String[] args) {
		getValues();
	}
}
