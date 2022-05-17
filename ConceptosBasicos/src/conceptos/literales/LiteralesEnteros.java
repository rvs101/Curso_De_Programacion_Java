package conceptos.literales;

/**
 * Literales : Valores que almacenan las variables : "elementos a la izquierda del igual"
 * 
 * @author RVS
 * @time 17 may 2022 - 18:04:07
 *
 */
public class LiteralesEnteros {

	public static void main(String[] args) {
		
		System.out.println(" --- • LITERALES ENTEROS • : int --- ");

//		          LITERALES ENTERAS
//		                   ↓
		int literalint1 = 34;
		int literalint2 = 0;
		int literalint3 = -50;
		int literalint4 = 12;

		System.out.println("literal 1 : " + literalint1);
		System.out.println("literal 2 : " + literalint2);
		System.out.println("literal 3 : " + literalint3);
		System.out.println("literal 4 : " + literalint4);

//		VALORES OCTALES
		int variable_Octal1 = 011010;
		int variable_Octal2 = 0101;
		int variableHexadecimal1 = 0x1a;
		int variableHexadecimal2 = 0x5d;

		System.out.println("Variable Octal a Decimal : " + variable_Octal1);
		System.out.println("Variable Binarias : " + variable_Octal2);
		System.out.println("Decimal 26 - Binario 11010 - Octal 32 - Hexadecimal 0x1a : " + variableHexadecimal1);
		System.out.println("Decimal 93 - Binario 1011101 - Octal 135 - Hexadecimal 0x5d : " + variableHexadecimal2);

		System.out.println(" --- ○ LITERALES ENTEROS ○ : long --- ");

		long literallong1 = 9223372036L;
		long literallong2 = 25L;
		long literallong3 = -1L;

		System.out.println("Literal 9223372036L : " + literallong1);
		System.out.println("Literal 25L : " + literallong2);
		System.out.println("Literal -1L : " + literallong3);

	}
}
