package t15.pag383.ejercicio5.estadisticas.principal;

import t15.pag383.ejercicio5.estadisticas.chinas.T15EstadisticasLetrasChinas;

import java.util.Scanner;

import t15.pag383.ejercicio5.estadisticas.chinas.T15EstadisticasChinasVocalesConsonantes;
import t15.pag383.ejercicio5.estadisticas.latinas.T15EstadisticasLatinasVocalesConsonantes;
import t15.pag383.ejercicio5.estadisticas.latinas.T15EstadisticasLetrasLatinas;
import t15.pag383.ejercicio5.estadisticas.taiwanes.T15EstadisticasLetrasTaiwan;
import t15.pag383.ejercicio5.estadisticas.taiwanes.T15EstadisticasTaiwanVocalesConsonantes;

/**
 * Internacionaliza el programa del ejercicio 15.4 de forma que funcione por
 * defecto en ingles
 * 
 * Pero que tengas versiones distintas para China y Taiwan
 * 
 * @author RVS
 *
 * @date 31 ago 2022 - 20:27:01
 */
public class T15EstadisticaMain {

	/**
	 * 
	 */
	public static void showEnglish() {
		T15EstadisticasLetrasLatinas.getPalabrasLatinas();
		T15EstadisticasLatinasVocalesConsonantes.showSilabasLatinas();
		T15EstadisticasLetrasLatinas.showLetrasLatinas();
	}

	/**
	 * 
	 */
	public static void showChinese() {
		T15EstadisticasLetrasChinas.getPalabrasChinas();
		T15EstadisticasChinasVocalesConsonantes.showSilabasChinas();
		T15EstadisticasLetrasChinas.showLetrasChinas();
	}

	/**
	 * 
	 */
	public static void showTaiwanese() {
		T15EstadisticasLetrasTaiwan.getPalabrasTaiwan();
		T15EstadisticasTaiwanVocalesConsonantes.showSilabasTaiwan();
		T15EstadisticasLetrasTaiwan.showLetrasTaiwan();
	}

	/**
	 * 
	 * @return
	 */
	public static int getCountry() {
		int res = 0;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("Elige el pais : ");
				System.out.println("1. England : ");
				System.out.println("2. Chine : ");
				System.out.println("3. Taiwan : ");
				res = sc.nextInt();
			} while (res > 3 && res < 1);
			System.out.println("Eleccion elegida : " + res);
			return res;
		}
	}

	/**
	 * 
	 */
	public static void setCountry() {
		int x = getCountry();
		switch (x) {
		case 1:
			showEnglish();
			break;
		case 2:
			showChinese();
			break;
		case 3:
			showTaiwanese();
			break;
		default:
			System.out.println("Country no choose");
			break;
		}
	}

	public static void main(String[] args) {
		setCountry();
	}
}
