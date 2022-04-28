package conceptos.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Ejecutamos los metodos de creación de un archivo serialziado y la lectura del
 * mismo
 * 
 * @author RVS
 *
 */
public class SerializableMain {

	/**
	 * Ruta del la creación del archivo serializado y la lectura del mismo
	 */
	private static final String RUTA = "texto.txt";

	/**
	 * 	
	 */
	private static DatosSerializacion s1;

	/**
	 * Los bytes que escribe en el archivo son del tipo :
	 * 
	 * Java serialization data version 5
	 * 
	 * Asi que nunca se podrán leer si no se convierte la serialización en bytes
	 */
	public static void setEscribirArchivoSerializable() {
		s1 = new DatosSerializacion(211, "rad", 'x');
		try {
// Tranformar los datos
			FileOutputStream fout = new FileOutputStream(RUTA);
//			Escribir datos en el archivo
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush(); // Descargar todos los bytes
			out.close(); // Cierra el flujo
		} catch (IOException e) {
			System.out.println("• Error : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("success");
	}

	/**
	 * Leer los datos del archivo "Serializado"
	 */
	public static void getLeerArchivoSerializable() {
//		Leer datos del archivo
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(RUTA));
			DatosSerializacion ds = (DatosSerializacion) in.readObject();
			System.out.println("Datos almacenados : " + ds.getA() + " - " + ds.getB() + " - " + ds.getC());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("success");
	}

	public static void main(String[] args) {

		setEscribirArchivoSerializable();

		getLeerArchivoSerializable();
	}
}
