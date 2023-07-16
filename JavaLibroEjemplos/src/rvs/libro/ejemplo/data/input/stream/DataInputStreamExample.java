package rvs.libro.ejemplo.data.input.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Permite a una aplicación "leer tipos de datos primitivos" de Java desde un
 * "flujo de entrada" subyacente de manera "independiente" de la máquina <br>
 * <br>
 * Una aplicación usa un "flujo de salida de datos" para "escribir datos" que
 * luego pueden ser leídos por un "flujo de entrada" de datos <br>
 * <br>
 * DataInputStream no es necesariamente seguro para el acceso multihilo
 * 
 * jun 2023 - 23:05:30
 * 
 * @author RVS
 *
 */
public class DataInputStreamExample {

	private static final String RUTA = "..\\JavaLibroEjemplos\\src\\rvs\\libro\\java\\ejemplo\\data\\input\\stream\\";
	private static final String ARCHIVO = "data.bin";

	/**
	 * Ejecutar ejemplo
	 * 
	 * @throws IOException
	 */
	public static void showRead() throws IOException {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream(RUTA + ARCHIVO));
			int i = dis.readInt();
			boolean b = dis.readBoolean();
			long l = dis.readLong();
			double d = dis.readDouble();
			float f = dis.readFloat();
//			String s = dis.readUTF();

			System.out.println("int : " + i);
			System.out.println("boolean : " + b);
			System.out.println("l: " + l);
			System.out.println("d: " + d);
			System.out.println("f: " + f);
//			System.out.println("s: " + s);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dis.close();
	}

	/**
	 * @throws IOException
	 * 
	 */
	public static void showWrite() throws IOException {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(RUTA + ARCHIVO));
			dos.write(65);
			dos.writeChar(92);
//			dos.writeUTF("cadenacadenacadenacadenacadena");
			dos.writeBoolean(false);
			dos.writeInt(123);
			dos.writeLong(456);
			dos.writeFloat(1.23f);
			dos.writeDouble(Math.PI);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dos.close();
	}

	public static void main(String[] args) throws IOException {
		showWrite();
		showRead();
	}

}
