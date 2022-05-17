/**
 *
 */
package huerto.plantas;

/**
 *
 */
import huerto.enums.Especie;

/**
 * Clase Concreta Zanahoria hereda de la clase abstract PlantaRaiz
 *
 * • Constructor para instanciar objetos con una serie de elementos
 *
 * Clase Concreta Zanahoria hereda de la clase abstract Planta a través de la
 * clase abstract PlantaRaiz
 *
 * • Atributo del tipo enum para definir el enumerado Especie.ZANAHORIAS
 *
 * • Atributo <b>protected</b> de la <i>Interface Set</i> del tipo
 * <b>Especie</b> de la
 * <b>clase HashSet</b> incompatibles para almacenar colecciones de objetos del
 * tipo enumerado
 *
 * @time 10 may 2022 14:10:18
 * @author RVS
 */
public class Zanahoria extends PlantaRaiz {

  /**
   * Constructor parametrizado
   *
   * @param nombre - String : Asignamos un nombre a la zanahoria para
   * identificarla
   */
  public Zanahoria(String nombre) {
//  Invoca el constructor de la clase PlantaRaiz para definir las caracteristicas de los objetos que vayamos instanciando
    super(nombre, 10, 3, 25);
//  Tipo enumerado que define una Especie.ZANAHORIAS 
    especie = Especie.ZANAHORIAS;
//  Colección de objetos del tipo incompatibles declarados mediante la interface Set y la clase HashSet
    incompatibles.add(Especie.PEREJIL);
    incompatibles.add(Especie.HINOJO);
//  Colección de objetos del tipo compatibles declarados mediante la interface Set y la clase HashSet
    compatibles.add(Especie.TOMATE);
    compatibles.add(Especie.LECHUGA);
  }

}
