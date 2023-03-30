package cap16.orm.gestor.dao;

import cap16.orm.gestor.Producto;

public class ProductoDao extends AbstractDao<Producto> {

	public ProductoDao() {
		setClazz(Producto.class);
	}
}
