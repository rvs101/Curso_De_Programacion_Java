package conceptos.super_ejemplo.constructores;

public class PadreHijo {

	public static void main(String[] args) {

		System.out.println("👨 Clase Padre - ");

		Padre padreAnonimo = new Padre();
		Padre primerPadre = new Padre(30, "David", "Perez Martin", 96);

		System.out.println("Padre Anonimo → " + padreAnonimo.toString());
		System.out.println("Primer Padre → " + primerPadre.toString());

		System.out.println("👦 Clase Hijo - ");

		Hijos hijoAnonimo = new Hijos();
		Hijos primerHijo = new Hijos("Pelirrojo", "Verdes", 154, true, 12, "Juan", "Perez Garcia", 45);

		System.out.println("Hijo Anonimo → " + hijoAnonimo.toString());
		System.out.println("Primer Hijo → " + primerHijo.toString());

	}
}
