package sooper;

import sooper.contenedores.Bolsa;
import sooper.contenedores.Caja;

/**
 * Clase Principal
 * 
 * @author RVS
 *
 */
public class Supermercado {

	public static void main(String[] args) {

		// Interface implementa la clase Pedido
//    Interface   obj          Clase
		IPedido miPedido = new Pedido("pedido001");

		// Interface implementa la clase Bolsa
//    Interface      obj         Clase
		IContenedor bolsa1 = new Bolsa("B111", 40, 25);

		// Interface implementa la clase Caja
//    Interface      obj        Clase
		IContenedor caja1 = new Caja("C222", 30, 50, 75);

		// Añadir elementos
		miPedido.addContenedor(bolsa1);
		// Añadir elementos
		miPedido.addContenedor(caja1);

	}
}
                                                            