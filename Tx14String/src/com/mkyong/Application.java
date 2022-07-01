package com.mkyong;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 
 * @author RVS
 * 
 * @date 1 jul 2022 19:56:51
 *
 */
public class Application {

	public static void main(String[] args) {

		System.out.println("Current Locale: " + Locale.getDefault());
		ResourceBundle mybundle = ResourceBundle.getBundle("MyLabels");

		System.out.println("Say how are you in US English: " + mybundle.getString("how_are_you"));

		Locale.setDefault(new Locale("ms", "MY"));

		System.out.println("Current Locale: " + Locale.getDefault());
		mybundle = ResourceBundle.getBundle("MyLabels");
		System.out.println("Say how are you in Malaysian Malaya language: " + mybundle.getString("how_are_you"));

	}
}
