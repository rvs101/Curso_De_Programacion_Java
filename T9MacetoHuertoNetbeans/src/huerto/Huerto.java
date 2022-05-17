package huerto;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase Concreta que implementa todos los metodos de la Interface IHuerto
 *
 * @time 10 may 2022 14:38:45
 * @author RVS
 */
public class Huerto implements IHuerto {

  /**
   * Atributo de instancia
   *
   * Almacena el nombre del huerto
   */
  private String nombre;

  /**
   * Atributo de instancia
   *
   * Almacena una colección de objetos descendientes e implementados por la
   * Interface IMaceta mediante la Interface Set
   */
  private Set<IMaceta> macetas;

  /**
   * Constructor Parametrizado
   *
   * Almacena el nombre del Huerto
   *
   * Instancia el objeto del tipo macetas y hace que apunte a la clase HashSet
   * para crear una colección de objetos
   *
   * @param nombre - String : Asigna un nombre al objeto del tipo huerto
   */
  public Huerto(String nombre) {
    this.nombre = nombre;
// Objeto instanciado como HashSet para almacenar una colección de objetos del tipo maceta
    macetas = new HashSet<>();
  }

  /**
   * Procedimiento de instancia
   *
   * Heredado por la interface IHuerto
   *
   * Añade un objeto del tipo 'maceta' a la colección de macetas de la clase
   * Huerto
   *
   * <b>Huerto</b> almacena <b>objetos</b> del tipo <b>'maceta'</b>
   * descendientes de la <b>interface IMaceta</b>
   *
   * @param maceta - HashSet : Objeto 'maceta' del tipo colección para almacenar
   * elementos del descendiente e implementados de la Interface IMaceta
   */
  @Override
  public void addMaceta(IMaceta maceta) {
//Añade una colección de objetos del tipo macetas para almacenar objetos    
    macetas.add(maceta);
  }

  /**
   * Metodo de instancia
   *
   * Recorre la colección de macetas y por cada una intentar añadir una planta a
   * la colección del macetas
   *
   * Si dentro del objeto planta hay una planta la añade a la colección de
   * objetos del tipo IMaceta y devuelve el objeto maceta con los parametros del
   * tipo 'planta' que se han ido añadiendo
   *
   * Si no lo consigue devuelve <b>null</b>
   *
   * @param planta - coleccion de objetos del tipo planta declarado por la
   * interface IPlantas e implementado por la clase HashSet
   *
   * @return planta - objeto del tipo 'planta' del IPlanta para que se almacenen
   * dentro de la colección de objetos 'maceta' de la Interface IMaceta
   */
  @Override
  public IMaceta plantar(IPlanta planta) {
// Recorre todos los objetos del tipo del tipo IMaceta
    for (IMaceta maceta : macetas) {
// Si la 'maceta' puede plantar una planta recibida por parametro      
      if (maceta.plantar(planta)) {
// Devuelve un objeto del tipo maceta con todas las plantas almacenada que son compatibles
        return maceta;
      }
    }
// Devuelve null - No hay objeto que apunte a alguna referencia
    return null;
  }

  /**
   * Metodo de instancia
   *
   * Almacena en un objeto del tipo StringBuilder el nombre del Huerto que le
   * pasamos por parametro
   *
   * Recorre todos los objetos de la colección 'macetas' para añadirlo al objeto
   * StringBuilder para devolverlos junto con el nombre del Huerto en una sola
   * cadena
   *
   * @return String - objeto con el nombre del huerto y todas las macetas
   * almacenadas en la colección
   */
  @Override
  public String toString() {
// Crea un objeto del tipo StringBuilder para almacenar objetos con cadenas de texto
    StringBuilder sb = new StringBuilder();
// Añade el nombre del huerto como atributo de instancia
    sb.append("Huerto: " + nombre + "\n");
// Obtenemos un objeto del tipo macetas y recorremos los elementos que contiene del mismo tipo
    for (IMaceta maceta : macetas) {
// El objeto 'sb' del tipo StringBuilder apunta a la misma referencia de cada objeto del tipo 'macetas' 
//El objeto 'sb' almacena una cadena de texto con un objeto del tipo 'maceta' 
      sb.append("\t" + maceta + "\n");
    }
// Devolvemos un "objeto sb" del tipo String con los "objetos maceta" 
//del tipo "Maceta" añadidos unos detras de otros dentro de la misma cadena
    return sb.toString();
  }

}
