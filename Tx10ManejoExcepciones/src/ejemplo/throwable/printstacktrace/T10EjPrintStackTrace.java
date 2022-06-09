package ejemplo.throwable.printstacktrace;

import java.util.Scanner;

public class T10EjPrintStackTrace {

	public static void main(String[] args) {

		int num1 = 0;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Intro num: ");
			num1 = sc.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("• Mensaje : '" + e.getMessage() + "' | • Traza en la pila : '" + e.getStackTrace() + "' ");
		}
		System.out.println("Valor : " + num1);
	}
}
