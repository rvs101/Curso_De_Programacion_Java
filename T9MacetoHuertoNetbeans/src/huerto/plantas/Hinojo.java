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
 * @time 8 may 2022 19:57:49
 * @author RVS
 */
public class Hinojo extends PlantaAromatica {

  /**
   * Construtor parametrizado
   *
   * @param nombre - String : Nombre de la planta Hinojo
   */
  public Hinojo(String nombre) {
// Utiliza el constructor de la clase Padre PlantaAromatica para definir los valores del objeto de separación y nitrato
    super(nombre, 10, 8);
// Define el objeto que se instancie de Hinojo como del tipo enum    
    especie = Especie.HINOJO;
//  Objeto "incompatibles" del tipo colección para almacenar un tipo enum que defina las plantas incompatibles con Hinojo
    incompatibles.add(Especie.TOMATE);
    incompatibles.add(Especie.ZANAHORIAS);
//  Objeto "compatibles" del tipo colección para almacenar un tipo enum que defina las plantas compatibles con Hinojo
    compatibles.add(Especie.LECHUGA);
  }

}
