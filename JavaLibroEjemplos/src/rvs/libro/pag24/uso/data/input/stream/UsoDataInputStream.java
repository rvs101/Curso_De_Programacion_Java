package rvs.libro.pag24.uso.data.input.stream;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Clase DataInputStream <br>
 * <br>
 * Permite a una aplicación leer tipos de datos primitivos de Java desde un
 * flujo de entrada subyacente de manera independiente de la máquina<br>
 * <br>
 * Una aplicación utiliza un flujo de salida de datos para escribir datos que
 * luego pueden ser leídos por un flujo de entrada de datos <br>
 * <br>
 * DataInputStream no es necesariamente seguro para el acceso multihilo
 * 
 * 1 jul 2023 - 19:31:03
 *
 * @author RVS
 *
 */
public class UsoDataInputStream {

	public static final String RUTA = "..\\JavaLibroEjemplos\\src\\rvs\\libro\\pag24\\uso\\data\\input\\stream\\";

	public static void main(String[] args) {

		int num = 0;
		String str = null;
		double doub = 0.0;

		try {
//			Crear una instancia de la clase DataInputStream y pasarle como parámetro un objeto FileInputStream
			FileInputStream fis = new FileInputStream(RUTA + "archivo.bin");
//			Métodos de lectura de DataInputStream para leer datos del archivo
			DataInputStream dis = new DataInputStream(fis);
// 			Leer datos del archivo en el mismo orden en que fueron escritos
			num = dis.readInt();
			str = dis.readUTF();
			doub = dis.readDouble();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
			System.exit(-1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Numero entero : " + num);
		System.out.println("Cadena : " + str);
		System.out.println("Numero de coma flotante : " + doub);
		
	}
}
