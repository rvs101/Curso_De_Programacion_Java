package huerto.macetas;

// APIS de Java
import java.util.Set;
import java.util.HashSet;

// Interfaces y Enum propios
import huerto.IMaceta;
import huerto.IPlanta;
import huerto.enums.FormaMaceta;

/**
 * Clase Abstracta Maceta que implementará algunos métodos de la interface
 * IMaceta
 * 
 * Algunos métodos dependerán de la forma de la maceta
 * 
 * Otros métodos dependerán de la implementación de las clases hijas
 * 
 * Dimensiones de la maceta : alto , ancho y alto
 * 
 * 
 * @author RVS
 * @time 6 may 2022 - 14:21:16
 *
 */
public abstract class Maceta implements IMaceta {

	/**
	 * Atributo de Instancia de la clase abstracta Maceta
	 */
	private String nombre;

	/**
	 * Atributo de Instancia de la clase abstracta Maceta
	 */
	private int alto;

	/**
	 * Atributo de Instancia de la clase abstracta Maceta
	 */
	private Set<IPlanta> plantas;

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre
	 * @param alto
	 */
	public Maceta(String nombre, int alto) {
		super(); // Constructor de la interface IMaceta
		this.nombre = nombre;
		this.alto = alto;
//		Inicializo el objeto del tipo Set<IPlanta> como una clase HashSet
		plantas = new HashSet<IPlanta>();
	}

	/**
	 * Obtener el nombre de la maceta
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtener el volumen de la maceta
	 * 
	 * @return int - calcula del alto por la superficie
	 */
	@Override
	public int getVolumen() {
		return alto * getSuperficie();
	}

	/**
	 * Obtener el ancho
	 * 
	 * @return int - devuelve el ancho/profundida
	 */
	@Override
	public int getProfunidad() {
		return alto;
	}

	/**
	 * Devuelve la colección de objetos del tipo IPlantas
	 * 
	 * @return objeto - Descendientes del tipo IPlantas
	 */
	@Override
	public Set<IPlanta> getPlantas() {
		return plantas;
	}

	/**
	 * Obtener la superficie después de calcular
	 * 
	 * @return int - Superficie calculada de la maceta
	 */
	@Override
	public int superficieDisponible() {
		return getSuperficie() - superficieOcupada();
	}

	/**
	 * Método de la clase abstracta Maceta
	 * 
	 * @return int - Devuelve la suma total de los espacios ocupados
	 */
	private int superficieOcupada() {
// Inicializo la variable
		int res = 0;
// Recorro la colección de objetos del tipo IPlanta		
		for (IPlanta p : plantas) {
// A cada objeto de la colección almaceno la superficie de la planta		
			res += p.getSuperficieRequerida();
		}
		return res;
	}

	/**
	 * 
	 */
	@Override
	public boolean plantar(IPlanta planta) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 */
	@Override
	public FormaMaceta getForma() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Obtenemos todos los espacios de los objetos de las macetas
	 * 
	 * @return int - devuelve el espacio total ocupado por las macetas
	 */
	private int volumenOcupado() {
		int res = 0;
		for (IPlanta p : plantas) {
			res += p.getVolumenRequerido();
		}
		return res;
	}

	/**
	 * Obtenemos el espacio disponible de la maceta
	 * 
	 * @return int - devuelve el espacio disponible
	 */
	@Override
	public int volumenDisponible() {
		return getVolumen() - volumenOcupado();
	}

	/**
	 * Obtenemos todos los datos de las macetas
	 * 
	 * @return String - objeto que almacena información de las macetas
	 */
	@Override
	public String toString() {
//		Almacena mensajes dentro de la clase StringBuilder la cual no sincroniza hilos
		StringBuilder sb = new StringBuilder("Maceta " + nombre + " [" + getForma() + "] (sup " + getSuperficie()
				+ "cm2 - vol " + getVolumen() + "cm3).\n");
// 		Si no hay objetos en la colección plantas
		if (plantas.isEmpty()) {
//			Añado al objeto de la colección plantas el mensaje "vacio"
			sb.append("\t\tvacía\n");
		}
//		Para todos los objetos de la colección plantas 
		for (IPlanta p : plantas) {
//			Añado al objeto del tipo StringBuilder un objeto del tipo planta
			sb.append("\t\t" + p + "\n");
		}
//		Añado al objeto del tipo StringBuilder la superficie disponible y el volumen disponible
		sb.append("\t\t>> Disponible sup " + superficieDisponible() + "cm2 - vol" + volumenDisponible() + " cm3");
//		Devuelve todos los objetos con los datos de las macetas
		return sb.toString();
	}

}
