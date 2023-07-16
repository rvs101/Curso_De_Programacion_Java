package rvs.libro.ejemplo.codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ValorEntre1y10 {

	private String cadena;

	public String getCadena() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("• - Introduce un valor entre 0 y 10 ");
			cadena = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cadena;
	}

	public static double getDouble() {
		Scanner sc = new Scanner(System.in);
		double decimal = (double) sc.nextFloat();
		return decimal;
	}

	public static double entre1y10() {
		System.out.println("Valor decimal");

		double decimal = getDouble();

		if ((decimal < 0) || (decimal > 10)) {
			do {
				System.out.println("♠ Valor entre 0 y 10");
				decimal = getDouble();
			} while ((decimal < 0) || (decimal > 10));
		}
		System.out.println("Final : " + decimal);
		return decimal;
	}

	public static void main(String[] args) {
		entre1y10();
	}
}
