package com.ejemplo;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author RVS
 * 
 * @date 1 jul 2022 19:56:51
 *
 */
public class ResourceBundleEjemplo {

	public static void main(String[] args) {

//		Obtenemos la localidad actual
		System.out.println("Current Locale: " + Locale.getDefault());

		System.out.println("-- Establecemos un nuevo idioma --");
// Establecemos nueva localización
		Locale.setDefault(new Locale("en", "US"));
// 	
		System.out.println("• Current Locale: " + Locale.getDefault());
// getBundle("MyLabels") → Obtiene un paquete de recursos utilizando el nombre base especificado, 
// la configuración regional predeterminada y el módulo de llamada. 
		ResourceBundle mybundle = ResourceBundle.getBundle("MyLabels");
//mybundle.getString("how_are_you") → Obtiene una cadena para la key "how_are_you" dada de este paquete de recursos o uno de sus padres. 
		System.out.println("○ Say : How are you in US English: " + mybundle.getString("how_are_you"));

// Establecemos nueva localización
		Locale.setDefault(new Locale("zh", "ZH"));
		System.out.println("•• Current Locale: " + Locale.getDefault());
		mybundle = ResourceBundle.getBundle("MyLabels");
		System.out.println("○○ Say : How are you in Chine : " + mybundle.getString("how_are_you"));

// Establecemos nueva localización
		Locale.setDefault(new Locale("es", "ES"));
		System.out.println("••• Current Locale: " + Locale.getDefault());
		mybundle = ResourceBundle.getBundle("MyLabels");
		System.out.println("○○○ Say : How are you in ES Español : " + mybundle.getString("how_are_you"));

	}
}
