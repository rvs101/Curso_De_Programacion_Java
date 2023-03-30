package cap16.orm.gestores;

import cap16.orm.gestores.dao.PedidoDao;

/**
 * Pag 427 <br>
 * Realizar consultas "<b>queries</b>" sin usar Hibernate o parecido para
 * recuperar datos de la BD
 * 
 * @author rad
 *
 */
public class SinQueries {

	public static void main(String[] args) {

		PedidoDao pedidoDao = new PedidoDao();
		Pedido pedido = pedidoDao.pedidoMasRecienteCriteria();
		
		System.out.println("*** Facturas: " + pedido.getFactura());
		System.out.println("*** Albaranes: " + pedido.generaAlbaran());
		System.out.println("*** Productos: " + pedido.getProductos());
	}
}
		