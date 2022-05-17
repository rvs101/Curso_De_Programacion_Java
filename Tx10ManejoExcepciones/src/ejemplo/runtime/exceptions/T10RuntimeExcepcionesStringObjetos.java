package ejemplo.runtime.exceptions;

public class T10RuntimeExcepcionesStringObjetos {

	public static void main(String[] args)  {

//		Object x = new Integer(0); → Obsoleto desde la version 9

		Object x = new Object();
		System.out.println("Valor entero a Objeto x : " + x);
		Object xx = Integer.valueOf(6);
		System.out.println("Valor entero a Objeto xx : " + xx);

// Obtener tipos 1

		System.out.println(x + " is of type " + x.getClass().getSimpleName());
		System.out.println(xx + " is of type " + xx.getClass().getSimpleName());

	}
}
