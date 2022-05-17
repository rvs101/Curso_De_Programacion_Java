/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Java Plantilla.java to edit this template
 */
package huerto.plantas;

import huerto.enums.Especie;

/**
 * Clase concreta hereda y extiende atributos y metodos de la clase
 * PlantaAromatica
 *
 *
 * @time 8 may 2022 20:58:10
 * @author RVS
 */
public class Perejil extends PlantaAromatica {

  /**
   * Construtor parametrizado
   *
   * @param nombre
   */
  public Perejil(String nombre) {
    super(nombre, 8, 5);
    especie = Especie.PEREJIL;
    incompatibles.add(Especie.LECHUGA);
    incompatibles.add(Especie.ZANAHORIAS);
    compatibles.add(Especie.TOMATE);
  }

}
