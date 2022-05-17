package huerto.plantas;

import huerto.IMaceta;
import huerto.IPlanta;

import huerto.enums.Especie;
import huerto.enums.Familia;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase Abstracta que implementa los metodos de la Interface IPlanta
 *
 * Necesita declarar Atributos de Instancia para almacenar todos los valores que
 * vayan invocando o devolviendo los metodos que implementamos desde la
 * interface IPlanta
 *
 * @author RVS
 * @time 8 may 2022 - 12:18:59
 *
 */
public abstract class Planta implements IPlanta {

  /**
   * Atributo de instancia del <b>tipo enum</b> identificado como <b>Especie</b>
   *
   * Modificador <b>protected</b> -> Accesible desde esta clase , todas las
   * clases descendientes y paquete
   *
   * Almacena un tipo de enum <b>especie</b>
   */
  protected Especie especie;

  /**
   * Atributo de instancia del <b>tipo enum</b> identificado como <b>Familia</b>
   *
   * Modificador <b>protected</b> -> Accesible desde esta clase , todas las
   * clases descendientes y paquete
   *
   * Asigna un tipo de enum <b>familia</b>
   */
  protected Familia familia;

  /**
   * <b>Atributo de instancia</b> de la <b>clase abstract Planta</b>
   * <br>
   * Modificador <b>protected</b>
   * <br>
   * Tipo <b>Interface Set</b> el cual almacena una <b>colección de objetos</b>
   * del <b>tipo enum <code>&lt;Especie&gt;</code></b>
   * <br>
   * <br>
   * Accesible desde esta <b>clase</b> , <b>todas las clases hijas descendientes
   * </b> y desde el propio <b>paquete/package</b>
   * <br>
   * Almacena una <b>colección de objetos</b> del tipo <b>enum Especie</b>
   * dentro de una clase que sea instancia mediante la <b>clase HashSet</b>
   *
   */
  protected Set<Especie> incompatibles;

  /**
   * <b>Atributo de instancia</b> de la <b>clase abstract Planta</b>
   * <br>
   * Modificador <b>protected</b>
   * <br>
   * Tipo <b>Interface Set</b> el cual almacena una <b>colección de objetos</b>
   * del <b>tipo enum <code>&lt;Especie&gt;</code></b>
   * <br>
   * <br>
   * Accesible desde esta <b>clase</b> , <b>todas las clases hijas descendientes
   * </b> y desde el propio <b>paquete/package</b>
   * <br>
   * Almacena una <b>colección de objetos</b> del tipo <b>enum Especie</b>
   * dentro de una clase que sea instancia mediante la <b>clase HashSet</b>
   */
  protected Set<Especie> compatibles;

  /**
   * Atributo de instancia
   *
   * Modificador private : Solo se pueden acceder desde la propia clase
   *
   */
  private String nombre;

  /**
   * Atributo de instancia
   *
   * Modificador private : Solo se pueden acceder desde la propia clase
   *
   * Almacena un entero con la superficie requerida
   *
   */
  private int superficieRequerida;

  /**
   * Atributo de instancia
   *
   * Modificador private : Solo se pueden acceder desde la propia clase
   *
   * Almacena un entero con el volumen requerido
   *
   */
  private int volumenRequerido;

  /**
   * Atributo de instancia
   *
   * Modificador private : Solo se pueden acceder desde la propia clase
   *
   * Objeto fechaSiembra del tipo Date para almacenar una fecha
   */
  private Date fechaSiembra;

  /**
   * Atributo de instancia
   *
   * Modificador private : Solo se pueden acceder desde la propia clase
   *
   * Objeto maceta del tipo interface IMaceta para almacenar objetos
   * implementandos por esta interface
   */
  private IMaceta maceta;

  /**
   * Construtor parametrizado
   *
   * @param nombre - String - Almacena el nombre de la planta
   * @param distancia - int - Almacena la distancia entre plantas
   * @param litros - int - Almacena litros de sustrato de la planta
   */
  protected Planta(String nombre, int distancia, int litros) {
    this.nombre = nombre;
    superficieRequerida = distancia ^ 2;
    volumenRequerido = litros * 1000;
// Objeto del tipo Interface Set incompatibles instancia se instancia con la 
// clase HashSet para almacenar una colección de objetos de este tipo
    incompatibles = new HashSet<>();
// Objeto del tipo Interface Set incompatibles instancia se instancia con la 
// clase HashSet para almacenar una colección de objetos de este tipo
    compatibles = new HashSet<>();
  }

  /**
   * Procedimiento de instancia - Para comprobar la compatibidad entre 'plantas'
   *
   * Si las 'plantas' son de la misma especie son compatibles (plantar 2
   * zanahorias en la misma maceta)
   *
   * Si no la especie 'planta' no está dentro de la colección de especies
   * compatibles de esta planta :
   *
   * Solo será compatibles si no son de la misma familia
   *
   * La especie de planta no está en la lista de incompatibles
   *
   * @param planta - Recibe un objeto del tipo planta de la Interface IPlanta
   * @return
   */
  @Override
  public boolean esCompatible(IPlanta planta) {
// Los objetos que reciba del tipo 'this' siempre serán del tipo Planta 
// comparandolo con las plantas que reciba como argumento
    boolean compatible = true;
// Comprobamos las propiedades de ambas plantas
//Si(Hace referencia al atributo especie de la planta 'this' que es un atributo privado
//usamos para acceder a la especie de la planta el metodo getEspecie()
    if (!especie.equals(planta.getEspecie())) {
      if (!compatibles.contains(planta.getEspecie())) {
        compatible &= !familia.equals(planta.getFamilia());
        compatible &= !incompatibles.contains(planta.getEspecie());
      }
    }
    return compatible;
  }

  /**
   * Metodo de Instancia - Determina si la planta tiene espacio en la maceta
   *
   * 1º Comprobar la superficie distancia en la maceta (calculada por la maceta)
   * es mayor que la superficie que requiere la planta
   *
   * 2º Comprobamos el volumen disponible calculado por la maceta que es mayor
   * que el requerido por la planta
   *
   * @param maceta
   * @return boolean - La unión de varios valores
   */
  @Override
  public boolean tengoEspacio(IMaceta maceta) {
//1º Comprobar la (superficie distancia) en la "maceta" (calculada por la maceta)
// es mayor que la (superficie que requiere) la "planta"
    boolean superficieOk = maceta.superficieDisponible() > getSuperficieRequerida();
    if (!superficieOk) {
      System.out.println("--- Superficie ok para " + getNombre() + " en " + maceta.getNombre());
    }
//2º Comprobamos el (volumen disponible) calculado por la "maceta" que es mayor
// que el (requerido por la planta)
    boolean volumenOk = maceta.volumenDisponible() > getVolumenRequerido();
    if (!volumenOk) {
      System.out.println("--- Volumen ok para " + getNombre() + " en " + maceta.getNombre());
    }
//La unión de varios valores
    return superficieOk && volumenOk;
  }

  /**
   * Procedimiento de instancia
   *
   * @param maceta
   */
  @Override
  public void plantar(IMaceta maceta) {
// Instanciamos un objeto del tipo Date() para almacenar la fecha actual
    fechaSiembra = new Date();
// Este objeto del tipo 'planta' tendra instanciado otro objeto del tipo 'maceta' para invocar sus metodos
    this.maceta = maceta;
  }

  /**
   * Metodo de instancia de la clase Planta
   *
   * @return String - Devuelve un objeto con el nombre de la planta
   */
  @Override
  public String getNombre() {
    return nombre;
  }

  /**
   * Procedimiento de instancia de la clase Planta
   *
   * @param nombre - String que establece el nombre del objeto que instanciemos
   * y le establezcamos su nombre a través de este procedimientos
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Metodo de instancia de la clase Planta
   *
   * @return int - Devuelve un entero con la superficie requerida para la planta
   */
  @Override
  public int getSuperficieRequerida() {
    return superficieRequerida;
  }

  /**
   * Metodo de la clase abstract Planta
   *
   * @param superficieRequerida
   */
  public void setSuperficieRequerida(int superficieRequerida) {
    this.superficieRequerida = superficieRequerida;
  }

  /**
   * Metodo de instancia de la clase Planta
   *
   * @return int - Devuelve un entero con el volumen requerido para la planta
   */
  @Override
  public int getVolumenRequerido() {
    return volumenRequerido;
  }

  /**
   *
   * @param volumenRequerido
   */
  public void setVolumenRequerido(int volumenRequerido) {
    this.volumenRequerido = volumenRequerido;
  }

  /**
   * Metodo de instancia de la clase Planta
   *
   * @return enum - Devuelve un tipo enum de Especie
   */
  @Override
  public Especie getEspecie() {
    return especie;
  }

  /**
   * Procedimiento de instancia
   *
   * Establece el tipo de enum dentro del Enumerado
   *
   * @param especie - tipo enum
   */
  public void setEspecie(Especie especie) {
    this.especie = especie;
  }

  /**
   * Metodo de instancia de la clase Planta
   *
   * @return enum - Devuelve un tipo enum de Familia
   */
  @Override
  public Familia getFamilia() {
    return familia;
  }

  /**
   * Procedimiento de instancia
   *
   * Establece el tipo de enum dentro del Enumerado
   *
   * @param familia - tipo enum
   */
  public void setFamilia(Familia familia) {
    this.familia = familia;
  }

}
