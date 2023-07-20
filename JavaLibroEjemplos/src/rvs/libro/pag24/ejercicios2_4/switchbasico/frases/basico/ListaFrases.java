package rvs.libro.pag24.ejercicios2_4.switchbasico.frases.basico;

/**
 * Clase Concreta : Lista de Frases
 * 
 * 16 jul 2023 - 1:25:12
 *
 * @author RVS
 *
 */
public class ListaFrases {

	/**
	 * Metodo de instancia <br>
	 * <br>
	 * Recibe un numero y muestra un mensaje
	 * 
	 * @param numero - int - valor entero
	 */
	public void listPhrase(int numero) {
		switch (numero) {
		case 1:
			System.out.println("• Solo sé que no sé nada");
			break;
		case 2:
			System.out.println("• El sabio no dice todo lo que piensa, pero siempre piensa todo lo que dice");
			break;
		case 3:
			System.out.println("• Lo único constante es el cambio");
			break;
		case 4:
			System.out.println("• El hombre es la medida de todas las cosas");
			break;
		case 5:
			System.out.println(
					"• Consejo es que te cases: si encuentras una buena esposa serás feliz, si no, te harás filósofo");
			break;
		case 6:
			System.out.println("• No dejes crecer la hierba en el camino de la amistad");
			break;
		case 7:
			System.out.println("• Reyes o gobernantes no son los que llevan cetro, sino los que saben mandar");
			break;
		case 8:
			System.out.println(
					"• Es peor cometer una injusticia que padecerla porque quien la comete se convierte en injusto y quien la padece no");
			break;
		case 9:
			System.out.println("• El infortunio pone a prueba a los amigos y descubre a los enemigos");
			break;
		case 10:
			System.out.println(
					"• Recordar que el secreto de la felicidad está en la libertad, yo secreto de la libertad, coraje");
			break;
		default:
			System.out.println("• Fin del programa - sin mensaje");
			break;
		}
	}
}
