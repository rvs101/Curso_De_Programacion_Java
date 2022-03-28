package ejercicios;

public class Pag84Ej3_4CalcularDíasCadaMes {

	public static void main(String[] args) {

		int dias = 0;

		int num = Integer.valueOf(args[0]);

		switch (num) {
		case 1:
			System.out.println("⛄❄ Enero 31 dias");
			dias = 31;
			break;
		case 2:
			System.out.println("☔ Febrero 28 dias");
			dias = 28;
			break;
		case 3:
			System.out.println("☔☀ Marzo 31 dias");
			dias = 31;
			break;
		case 4:
			System.out.println("☔☀ Abril 30 dias");
			dias = 30;
			break;
		case 5:
			System.out.println("☀ Mayo 31");
			dias = 31;
			break;
		case 6:
			System.out.println("☀⛱ Junio 30");
			dias = 30;
			break;
		case 7:
			System.out.println("☀⛱ Julio 31");
			dias = 31;
			break;
		case 8:
			System.out.println("☀⛱ Agosto 31");
			dias = 31;
			break;
		case 9:
			System.out.println("☀⛱ Septiembre 30");
			dias = 30;
			break;
		case 10:
			System.out.println("☀🍁 Octubre 31");
			dias = 31;
			break;
		case 11:
			System.out.println("❄🍁 Noviembre 30");
			dias = 30;
			break;
		case 12:
			System.out.println("⛄❄ Diciembre 31");
			dias = 31;
			break;
		default:
//			throw new IllegalArgumentException("Unexpected value: " + num);
			if (num > 12 || num < 1) {
				System.out.println("❌ - El mes " + num + " no existe ");
			}
			break;
		}
		System.out.println("🏡 Son : " + dias + " dias ");
	}
}
