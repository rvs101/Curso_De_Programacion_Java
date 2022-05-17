package conceptos.conocer.tipos;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;

/**
 * 
 * @author RVS
 * @time 17 may 2022 - 20:17:53
 *
 */
public class GetTypeExample1 {

	public static void main(String[] args) throws Exception {

// Obtener el "objeto/object" del tipo "Campo/Field" (totalMarks) mediante el método getField()		
//		                     Clase.tipo.metodo()
//		                                 Obtenemos el campo
		Field marksField = Student.class.getField("totalMarks");

// Usar el método getType() del "Campo/Field" para obtener el tipo del "Campo/Field" (totalMarks)
//		                  tipoField.metodo()
//		                            Obtenemos el tipo
		Class<?> value = marksField.getType();

// Imprimir el tipo de valor campo		
		System.out.println("El tipo de campo \"totalMarks\" es " + value);

// Obtener el objeto de "Campo/Field" (totalFees) mediante el método getField()
//		                    Clase.tipo.metodo()
//		                     ↓     ↓      ↓
		Field feesField = Student.class.getField("totalFees");

// Utilizar el método getType() del "Campo/Field" para obtener el tipo de "Campo/Field" nombre
//                   tipo.metodo(); 
		value = feesField.getType();

// imprimir el tipo de "Campo/Field" de (totalFees)		
		System.out.println("El tipo de campo \"totalMarks\" es " + value);

		int ii = 5;
		Method[] methods = Student.class.getMethods();
		for (int i = 0; i < methods.length; i++) {
			if (i < 6) {
				System.out.println(i + " Metodos de la clase : '" + Student.class.getTypeName() + "' y " + methods[i]);
			} else if (i == 6) {
				System.out.println("♦ Metodos de la clase Object ");
			} else {
				System.out.println(
						"• " + (++ii) + " Metodos de la clase : '" + Student.class.getTypeName() + "' y " + methods[i]);

			}
		}

	}
}

/**
 * Clase Basica de Ejemplo
 * 
 * @author RVS
 * @time 17 may 2022 - 20:16:57
 *
 */
class Student {

	// Declarar e incializar Atributos de Instancia
	public static String name = "John";
	public static double totalMarks = 380;
	public static float totalFees = 3413.99f;

	public static String getName() {
		return name;
	}

	public static void setName(String stdName) {
		name = stdName;
	}

	public static double getTotalMarks() {
		return totalMarks;
	}

	public static void setMarks(double marks) {
		totalMarks = marks;
	}

	public static float getTotalFees() {
		return totalFees;
	}

	public static void setFees(float fees) {
		totalFees = fees;
	}
}
