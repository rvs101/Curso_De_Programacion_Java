package cap16.orm.gestores;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

import javax.persistence.NoResultException;

import cap16.orm.gestores.dao.AlbaranDao;
import cap16.orm.gestores.dao.PedidoDao;

/**
 * Clase Concreta para ejecutar la entrada del programa
 *
 */
public class App {

	public static void main(String[] args) {

// Clase Concreta "PedidoDao" implementada por la Clase Abstracta "AbstractDao"
// • Al instanciar el objeto 'pedidoDao' dentro implicitamente se ha establecido
//   la clase Pedido como clase Generica para invocar todos los metodos de la interface Dao 
//   implementada por la clase Abstracta 		
		PedidoDao pedidoDao = new PedidoDao();
// Creamos la 1º insercción de datos con el objeto 'pedido' de la clase Concreta Pedido
//		Pedido pedido = new Pedido();
// Invocamos todos los metodos propios de la clase Pedidos
// e implementados la propia clase Concreta Pedido		
//		pedido.setFecha(new Date());
//		pedido.setReferencia("001");
		Pedido pedido = new Pedido("001", LocalDateTime.now());
//		pedidoDao.save(pedido);
// Pag 411 - Fechas manejables
// Creamos un objeto con la referencia 'pedFut' y le añadimos a la fecha actual +2 dias mas para que se registren 		 
		Pedido pedido2 = new Pedido("pedFut", LocalDateTime.now().plus(2, ChronoUnit.DAYS));
// Guardar registro
//		pedidoDao.save(pedido2);

// Utilizamos la clase PedidoDao para invocar el metodo que muestra el registro más reciente en la BD
		try {
			Pedido masReciente = pedidoDao.pedidoMasRecienteCorrecto();
			System.out.println("*** Pedido más reciente: " + masReciente);
		} catch (NoResultException nre) {
			System.out.println("No tienes ningun pedido reciente");
		}

		Pedido pedido3 = new Pedido("pedPas", LocalDateTime.now().minus(1, ChronoUnit.WEEKS));
//		pedidoDao.save(pedido3);

// Ejecutamos el metodo 'save()' de la Interface Dao
// implementado por la clase abstracta AbstractDao
// mediante el metodo executeInsideTransaction()
// para registrar los datos en la BD
//		pedidoDao.save(pedido);
// Creamos una lista de objetos del tipo <Pedido> e invocamos el método getAll();
// • Metodo	getAll(); pertenece a la Interface Dao 
//	y ha sido implementado por la clase Abstracta AbstractDao
		List<Pedido> pedidos = pedidoDao.getAll();
		System.out.println("***Pedidos: " + pedidos);

// Pag 418 Crear Albaranes

		AlbaranDao albaranDAO = new AlbaranDao();
		Albaran a1 = new Albaran("345");
//		albaranDAO.save(a1);
		List<Albaran> albaranes = albaranDAO.getAll();
		System.out.println("***Albaranes: " + albaranes);
	}
}
