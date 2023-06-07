package rvs.libro.java.ejemplos.buffer;

import java.nio.ByteBuffer;

/**
 * 
 * @author Robot
 *
 */
public class EjemploByteBuffer {

	public static void main(String[] args) {
//	  • allocate() → Asigna un nuevo búfer de bytes
//	  - La posición del nuevo búfer será cero, 
//		su límite será la capacidad (8) en este caso 
//	  - Su marca será indefinida :
//		(La marca de un ByteBuffer es un índice que se puede establecer 
//		y luego restablecer en una posición específica en el búfer.
//	  	♦ Cuando se llama al método allocate() de la clase ByteBuffer, 
//		la marca se establece en un "valor indefinido"
//	  - Esto significa que no se puede confiar en el valor de la marca 
//		hasta que se establezca explícitamente)
//	  - Cada uno de sus elementos se inicializará a cero y su orden de bytes será BIG_ENDIAN.
//		Tendrá un array de respaldo y su offset de array será 0
//		                                    ↓
		ByteBuffer buffer = ByteBuffer.allocate(8);
//	  • Método put() relativo (operación opcional)
//		Escribe el byte dado en este búfer en la posición actual, y luego incrementa la posición
//              ↓
		buffer.put((byte) 1);
		buffer.put((byte) 2);
		buffer.put((byte) 3);
		buffer.put((byte) 4);
		
//	  •	flip() ←→ (Cambiar entre los modos de escritura y lectura).
//		El límite se fija en la posición actual y luego la posición se pone a 0 
//		Si la marca está definida, se descarta
//		Después de una secuencia de operaciones "channel-read" o put() 
//		invoca este método para preparar una secuencia de operaciones channel-write o relative get
//		         ↓
		buffer.flip();

//		Indica si hay elementos entre la posición actual y el límite
//		                    ↓
		while (buffer.hasRemaining()) { // Has Remaining = Le queda / restante
//			Método de obtención relativa 
//			Lee el byte en la posición actual de este búfer 
//			y luego incrementa la posición
//			                           ↓ 
			System.out.println(buffer.get() + " ");
		}
	}
}
