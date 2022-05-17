package huerto.macetas;

// APIS de Java
import java.util.Set;
import java.util.HashSet;

// Interfaces y Enum propios
import huerto.IMaceta;
import huerto.IPlanta;
import huerto.enums.FormaMaceta;

/**
 * Clase Abstracta Maceta
 *
 * Implementará algunos métodos de la interface IMaceta
 *
 * Algunos métodos dependerán de la forma de la maceta
 *
 * Otros métodos dependerán de la implementación de las clases hijas
 *
 * Dimensiones de la maceta : alto , ancho y alto
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
   *
   * Se utiliza para almacenar una colección de objetos implementandos por la
   * interface IPlanta
   */
  private Set<IPlanta> plantas;

  /**
   * Constructor parametrizado
   *
   * @param nombre
   * @param alto
   */
  public Maceta(String nombre, int alto) {
    super(); // Constructor de la propia clase Maceta
    this.nombre = nombre;
    this.alto = alto;
//Inicializo el objeto del tipo Set<IPlanta> como una clase HashSet
    plantas = new HashSet<>();
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
  public int getProfundidad() {
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
   * Huerto intenta plantar una planta en una maceta "Responsabilidad de la
   * clase Maceta"
   *
   * 1º Comprobar si la nueva planta que queremos plantar el atributo planta es
   * compatible con cada una de las plantas 'p' que ya hay entre las plantas de
   * la maceta
   *
   * Si es compatible con todas , comprobamos si la planta tiene espacio en esta
   * maceta con this
   *
   * El objeto del tipo planta decide si es compatible con la maceta
   *
   * Si no es compatible no vale la pena hacer más comprobaciones
   *
   * Si tiene espacio 'si cabe' añadimos la planta a la colección de plantas de
   * la maceta y llamamos al metodo plantar de la planta pasandole por parametro
   * la maceta 'this' de nuevo
   *
   */
  @Override
  public boolean plantar(IPlanta planta) {
//Identificamos el objeto del tipo planta mediante su metodo getNombre()
//  Y luego identificamos el objeto de la propia clase mediante el metodo getNombre()
    System.out.println("--- PLANTANDO " + planta.getNombre() + " EN " + this.getNombre());

//  Variable para almacenar el valor de cada objeto del tipo Planta que es compatible con otra
    boolean compatiblesOk = true;

//  Recorremos todo los objetos del tipo 'plantas'
    for (IPlanta p : plantas) {
//Invocamos el metodo esCompatible del objeto de tipo planta 
//  Almacena el resultado de cara iteración
      boolean compatibleOk = planta.esCompatible(p);
// Si no es compatible
      if (!compatibleOk) {
// Muestra el mensaje del nombre de la planta que no es compatible con la colección de plantas
        System.out.println("--- " + p.getNombre() + " no es compatible con " + planta.getNombre());
      }
// Si lo es se almacena 
      compatiblesOk &= compatibleOk;
    }
// Variable para comprobar   
    boolean cabe = false;
// Si es compatible de la anterior comprobación de objetos de la clase Planta
    if (compatiblesOk) {
// el objeto planta de la colección comprueba si el objeto actual tiene espacio
      cabe = planta.tengoEspacio(this);
    }
// Si 'cabe' 
    if (cabe) {
// Añadimos el objeto planta a la colección de objetos del tipo planta
      plantas.add(planta);
// El objeto planta comprueba si el objeto actual de esta clase Maceta es compatible
      planta.plantar(this);
    }
// Devuelve el objeto si es cabe y las plantas añadidas a la colección de objetos de tipo Planta   
    return cabe;
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
   * Obtenemos el espacio disponible de la maceta
   *
   * @return int - devuelve el espacio disponible
   */
  @Override
  public int volumenDisponible() {
    return getVolumen() - volumenOcupado();
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
