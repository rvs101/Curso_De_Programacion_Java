/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Java Plantilla.java to edit this template
 */
package huerto.plantas;

import huerto.enums.Familia;

/**
 * @see @since @version @time 8 may 2022 - 17:15:48
 * @author RVS
 */
public abstract class PlantaAromatica extends Planta {

  /**
   * Construtor parametrizado
   *
   * @param nombre - String - Establece el nombre de la planta AROMATICA dentro
   * del objeto del tipo PlantaAromatica
   * @param distancia - int - Establece la distancia de la planta AROMATICA
   * dentro del objeto del tipo PlantaAromatica
   * @param litros - int - Establece los litros de sustrato de espacio que la
   * planta AROMATICA tiene dentro del objeto del tipo PlantaAromatica
   */
  protected PlantaAromatica(String nombre, int distancia, int litros) {
    super(nombre, distancia, litros);
//    Establecemos de forma especifica un tipo enum a la planta Aromática
    familia = Familia.AROMATICA;
  }

}
