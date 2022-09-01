package t15.pag383.ejercicio5.estadisticas.chinas;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Internacionaliza el programa del ejercicio 15.4 de forma que funcione por
 * defecto en ingles
 * 
 * pero que tengas versiones distintas para China y Taiwan
 * 
 *
 * @author RVS
 *
 * @date 31 ago 2022 - 20:27:01
 *
 */
public class T15EstadisticasChinas {

	public static void main(String[] args) {

		Mensajes.setFormat();

	}

}

/**
 * 
 *
 * @author RVS
 *
 * @date 31 ago 2022 - 20:46:29
 *
 */
class LetrasChinas {

//	                                        A     E     I    O     U
	public final static String[] VOCAL = { "阿", "饿", "伊", "哦", "玉" };

//	                                              B     C     D     F      G      H       J     K      L       M        N       P     Q      R        S       T       V        W          X           Y         Z
	public final static String[] CONSONANTES = { "贝", "色", "德", "艾弗", "日", "阿什", "鸡", "卡", "艾勒", "艾马", "艾娜", "佩", "苦",
			"艾和", "艾丝", "特", "维", "独布勒维", "伊克斯", "伊格黑克", "贼德" };

}

class Mensajes {

	public static void setFormat() {
		ResourceBundle bundle = ResourceBundle.getBundle("estructuras", Locale.UK);
//		
		String mensaje = bundle.getString("mensaje");
		String objeto = bundle.getString("objeto");
		String color = bundle.getString("color");

		System.out.println(MessageFormat.format(mensaje, objeto, color));
	}

}