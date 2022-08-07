package conceptos.objetos.referencias;

/**
 * 
 *
 * @author RVS
 *
 * @date 7 ago 2022 - 20:17:11
 *
 */
public class ObjetosReferencias {

	public static void main(String[] args) {
		// Método para ejecutar el código
		// Creamos la "variable objeto" llamada 'b1'
		Box b1 = new Box();
		// Referenciamos la misma posición de memoria a la "variable objeto" b2 a traves
		
		// de b1
		Box b2 = b1;

		// Invocamos el atributo 'alto' mediante las "variables objeto" b1 y b2
		System.out.println(b1.height); // Ambas variables objeto 'b1' y 'b2'
		// almacenan el valor 0 del atributo 'alto'
		// Ambas apuntan a la misma posición de la
		// memoria donde se almacena el valor que es 0
		System.out.println(b2.height);

		// Cambiamos el valor de 'alto' a traves de la "variable objeto" b2
		b2.height = 20;

		// Ahora tanto la 'variable objeto' b1 y b2
		// tiene el mismo valor asignado al atributo alto
		System.out.println(b1.height);
		System.out.println(b2.height);
	}
}

//Clase para mostrar la asignación de 
//una referencia a una variable objeto
class Box {
//Atributos de la Clase Caja 
	double width;
	double height;
	double deep;
}
