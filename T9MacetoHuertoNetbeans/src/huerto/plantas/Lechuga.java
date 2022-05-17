/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Java Plantilla.java to edit this template
 */
package huerto.plantas;

import huerto.enums.Especie;

/**
 * Clase concreta hereda y extiende atributos y metodos de la clase PlantaHoja
 *
 * @time 8 may 2022 20:51:04
 * @author RVS
 */
public class Lechuga extends PlantaHoja {

  /**
   * Construtor parametrizado
   *
   * @param nombre - String : Asigna un nombre al objeto que instanciemos
   * utilizando la clase Lechuga
   */
  public Lechuga(String nombre) {
//  Invoca el constructor de la clase PlantaHoja para definir las caracteristicas estandar de los objetos lechuga que vamos instanciando
    super(nombre, 12, 22);
//  Establecemos cada objeto LECHUGA con un tipo enum Especie.LECHUGA
    especie = Especie.LECHUGA;
//  Objeto "compatibles" del tipo colección para almacenar un tipo enum que defina las plantas compatibles con Lechuga
    compatibles.add(Especie.TOMATE);
    compatibles.add(Especie.ZANAHORIAS);
  }

}
