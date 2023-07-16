package rvs.libro.pag11.ejemplos.operadores;

/**
 * El símbolo de tilde `~` se utiliza como un operador de complemento a nivel de
 * bits (bitwise complement operator)
 * 
 * Este operador invierte todos los bits de un valor numérico,
 * 
 * Cambia todos los 0s a 1s y viceversa
 * 
 * Por ejemplo
 * 
 * Si aplicamos el operador `~` al número 5 (que se representa en binario como
 * `00000101`)
 * 
 * Obtendremos el resultado `-6` (que se representa en binario como `11111010`).
 * 
 * @author Robot
 *
 */
public class JavaOperadorVirgulilla {

	public static void main(String[] args) {
// RECUERDA : QUE SOLO COGEMOS LOS 8 BYTES DE LA DERECHA
//		                                                      Parte Seleccionada
//		                                                         ↓         
//		                                                      ___↓_____
		// Representación binaria: 00000000 00000000 00000000 00001010
		int num = 10; // ________
		// Representación binaria: 11111111 11111111 11111111 11110101
		int complemento = ~num;

		System.out.println("~10 → " + complemento); // Salida: -11
//		                                                      Parte Seleccionada
//		                                                      	 ↓
//		                                                      ___↓_____
		// Representación binaria: 00000000 00000000 00000000 00000101
		int num1 = 5; // ________
		// Representación binaria: 11111111 11111111 11111111 11111010
		int complemento1 = ~num1;

		System.out.println("~5 → " + complemento1); // Salida: -6

	}
}
