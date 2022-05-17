/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Java Plantilla.java to edit this template
 */
package huerto.plantas;

/**
 * Clase Concreta 'TomateCherry' que hereda de la clase 'Tomate' todos los
 * atributos , Constructores , metodos de la clase Padre Tomate
 *
 * @time 9 may 2022 12:12:26
 * @author RVS
 */
public class TomateCherry extends Tomate {

  /**
   * Constructor parametrizado
   *
   * Invoca a través de la palabra super al constructor de la clase Tomate para
   * asignarle uno valor pasado por parametro y otros predefinidos por nosotros
   *
   * Cada objeto que instanciemos tendrá un nombre pasasdo por parametro y una
   * serie de valores definidos por nosotros
   *
   * @param nombre - Recibe un nombre que se almacenará en el objeto a través
   * del constructor de la clase Tomate
   */
  public TomateCherry(String nombre) {
    super(nombre, 25, 15);
  }

}
