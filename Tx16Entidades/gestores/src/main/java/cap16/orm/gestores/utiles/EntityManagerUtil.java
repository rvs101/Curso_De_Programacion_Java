package cap16.orm.gestores.utiles;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * <b>Clase Concreta de Utilidad</b>
 * <br>
 * Sólo tiene un metodo llamado <b>getEntityManager();</b>
 * <ol>
 * <li>Ayuda a establecer y manejar las conexiones a las bases de datos mediante
 * la creación de un objeto que abre la conexión a la base de datos</li>
 * 
 * <li>Esta clase se usa para la creación de un objeto que almacena la conexión
 * a la base de datos y crea una transacción</li>
 * </ol>
 * 
 * @author rad
 *
 */
public class EntityManagerUtil {

	/**
	 * <b>Pag 403</b>
	 * <ul>
	 * <li><b>Metodo estático</b></li>
	 * <li>Este método se usa para crear un objeto del tipo <b>EntityManager</b>
	 * después de implementarlo usando la <b>clase Persistence</b> y el <b>metodo
	 * createEntityManagerFactory</b> la <b>interface EntityManagerFactory</b> y la
	 * <b>interface EntityManager</b></li>
	 * </ul>
	 * 
	 * @return <b>EntityManager</b> - Devuelve un <b>OBJETO</b> del tipo
	 *         <b>EntityManager</b> que contiene todos los métodos implementados por
	 *         medio de la <b>clase Persistence</b> los cuales gestiona una base de
	 *         datos mediantes sus métodos internos que se pueden invocar usando el
	 *         objeto 'manager' que vuelve este metodo
	 */
	public static EntityManager getEntityManager() {
// → Para abrir la conexión a la base de datos poder usar los distintos EntityManager que usemos
// Creamos un objeto de la "factory" con la unidad de Persistencia en el fichero de configuración 'persistence.xml'
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("gestores");
// Creamos un objeto 'manager' para almacenar la creación de la 'entityManager'	
// → EntityManager ligado a una transacción
		EntityManager manager = factory.createEntityManager();
// Devuelve el objeto de la EntityManagerFactory (abre una conexión)
//		y de la EntityManager (crea una transaccion)
		return manager;
	}

	public static void main(String[] args) {
// • Se crea una Transacción
//  Tipo de Dato
//	  Interface implementando por la clase Persistence
//		    ↓
//		    ↓         Objeto de tipo Interface
//		    ↓            ↓
//		    ↓            ↓      Clase Concreta que implementa las interface EntityManager y EntityManagerFactory
//		    ↓            ↓            ↓
//		EntityManager manager = EntityManagerUtil.getEntityManager();
//		                                                Objeto del tipo Interface implementando por la Interface 'EntityManager'
//		                                                   ↓
//		System.out.println("EntityManager class ==> " + manager.getClass().getCanonicalName());

// Salida por consola : 		
//• Hibernate: create table pedido (id integer not null auto_increment, fecha datetime(6), referencia varchar(255), primary key (id)) engine=InnoDB
//• dic 02, 2022 6:41:22 P. M. org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
//		------------------------------------------------------------------
//		dic 05, 2022 5:22:25 P. M. org.hibernate.jpa.internal.util.LogHelper logPersistenceUnitInformation
//		INFO: HHH000204: Processing PersistenceUnitInfo [name: gestores]

//		dic 05, 2022 5:22:25 P. M. org.hibernate.Version logVersion
//		INFO: HHH000412: Hibernate ORM core version 5.4.16.Final

//		dic 05, 2022 5:22:26 P. M. org.hibernate.annotations.common.reflection.java.JavaReflectionManager <clinit>
//		INFO: HCANN000001: Hibernate Commons Annotations {5.1.0.Final}

//		dic 05, 2022 5:22:26 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl configure
//		WARN: HHH10001002: Using Hibernate built-in connection pool (not for production use!)

//		dic 05, 2022 5:22:26 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//		INFO: HHH10001005: using driver [com.mysql.cj.jdbc.Driver] at URL [jdbc:mysql://localhost:3306/gestores]

//		dic 05, 2022 5:22:26 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//		INFO: HHH10001001: Connection properties: {password=****, user=root}

//		dic 05, 2022 5:22:26 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl buildCreator
//		INFO: HHH10001003: Autocommit mode: false

//		dic 05, 2022 5:22:26 P. M. org.hibernate.engine.jdbc.connections.internal.DriverManagerConnectionProviderImpl$PooledConnections <init>
//		INFO: HHH000115: Hibernate connection pool size: 20 (min=1)

//		dic 05, 2022 5:22:27 P. M. org.hibernate.dialect.Dialect <init>
//		INFO: HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect

//		dic 05, 2022 5:22:29 P. M. org.hibernate.resource.transaction.backend.jdbc.internal.DdlTransactionIsolatorNonJtaImpl getIsolatedConnection
//		INFO: HHH10001501: Connection obtained from JdbcConnectionAccess [org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess@542f6803] for (non-JTA) DDL execution was not in auto-commit mode; the Connection 'local transaction' will be committed and the Connection will be set into auto-commit mode.

//		Salida del metodo
//		dic 05, 2022 5:22:30 P. M. org.hibernate.engine.transaction.jta.platform.internal.JtaPlatformInitiator initiateService
//		INFO: HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
//                              manager.getClass().getCanonicalName();
//		EntityManager class ==> org.hibernate.internal.SessionImpl

	}

}
