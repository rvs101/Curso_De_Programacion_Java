package cap16.orm.gestores;

import java.time.LocalDateTime;

import cap16.orm.gestores.dao.PedidoDao;

/**
 * Pag 422 <br>
 * Clase Concreta para hacer pruebas <br>
 * 
 * @author rad
 *
 */
public class GestorPedidos {

	public static void main(String[] args) {

		PedidoDao pedidoDao = new PedidoDao();

		Producto libro = new Producto("libJava", "Manual Imprescindible Java");
		Producto cuaderno = new Producto("cuaRojo", "Cuaderno Rojo");
		Producto lapiz = new Producto("lapHB", "Lápiz HB");

		Pedido vueltaAlCole = new Pedido("153947", LocalDateTime.now());
		
		vueltaAlCole.addProducto(libro);
		vueltaAlCole.addProducto(cuaderno);
		vueltaAlCole.addProducto(lapiz);

//		pedidoDao.save(vueltaAlCole);
//		pedidoDao.update(vueltaAlCole);

		Albaran albaran = vueltaAlCole.generaAlbaran();
		Factura factura = vueltaAlCole.generaFactura();

		System.out.println("Pedido actualizado: \n" + vueltaAlCole);

	}

}
