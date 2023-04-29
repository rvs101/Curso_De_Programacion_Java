package cap18.orm.otrasreunionesmas.utiles;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Clase de utilidad del JPA <br>
 * <br>
 * Se utiliza para crear y devolver una instancia de EntityManager<br>
 * <br>
 * EntityManager → Interfaz del JPA para interactuar con la BD y
 * (crear,leer,actualizar,eliminar entidades)<br>
 * <br>
 * Clase EntityManagerUtil<br>
 * <br>
 * Puede ser util en una aplicación que utiliza JPA para proporcionar una forma
 * facil y centralizada de obtener instancias de EntityManager para interactuar
 * con la BD
 *
 * @author rad
 *
 */
public class EntityManagerUtil {

	/**
	 * EntityManagerFactory <br>
	 * <br>
	 * Interfaz en JPA (Java Persistence API) que se utiliza para crear instancias
	 * de EntityManager responsable de leer la configuración de persistencia y crear
	 * instancias de EntityManager que se pueden utilizar para interactuar con la
	 * base de datos<br>
	 * <hr>
	 * Para crear una instancia de EntityManagerFactory puedes utilizar la clase
	 * Persistence y su método estático createEntityManagerFactory() que toma como
	 * parámetro el nombre de la unidad de persistencia definida en el archivo
	 * persistence.xml <hr>
	 * <br>
	 * Una vez que tienes una instancia de EntityManagerFactory puedes llamar a su
	 * método createEntityManager() para crear una instancia de EntityManager <br>
	 * <br>
	 * <b>EntityManagerFactory</b> es un recurso costoso en términos de tiempo y
	 * recurso que por lo generalmente se crea solo una vez al inicio de la
	 * aplicación y se reutiliza para crear múltiples instancias de EntityManager
	 * <br><br>
	 * @return objeto - tipo EntityManager para realizar tareas CRUD ( create, read
	 *         , update , delete )
	 */
	public static EntityManager getEntityManager() {
//		Crea el objeto 'Persistence'
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("OtraReunionMas");
		EntityManager manager = factory.createEntityManager();
		return manager;
	}

	public static void main(String[] args) {
		EntityManager manager = EntityManagerUtil.getEntityManager();
		System.out.println("EntityManager class --> " + manager.getClass().getCanonicalName());
	}

}
