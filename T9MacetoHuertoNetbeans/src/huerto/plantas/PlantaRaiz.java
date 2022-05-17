/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Java Plantilla.java to edit this template
 */
package huerto.plantas;

import huerto.IMaceta;
import huerto.enums.Familia;

/**
 * Clase Abstracta que hereda caracteristicas de la clase Abstracta Planta
 *
 * @time 8 may 2022 17:51:00
 * @author RVS
 */
public abstract class PlantaRaiz extends Planta {

  /**
   * Atributo de instancia de la clase abstract PlantaRaiz
   */
  private int profundidaRequerida;

  /**
   * Construtor parametrizado
   *
   * @param profundida - int : Establece la profundida de la raiz
   * @param nombre - String : Establece el nombre de la planta
   * @param distancia - int : Establece la distancia de la planta
   * @param litros - int : Establece los litros de sustrato que necesita la
   * planta
   */
  public PlantaRaiz(String nombre, int profundida, int distancia, int litros) {
// Hereda las propiedades de la clase abstract Planta
    super(nombre, distancia, litros);
//    Almacenamos la profundidad de la planta
    this.profundidaRequerida = profundida;
    familia = Familia.RAIZ;
  }

  /**
   * Método de Instancia
   *
   * @return int : Devuelve la profundidad de la planta
   */
  public int getProfundidaRequerida() {
    return profundidaRequerida;
  }

  /**
   * Procedimiento de Instancia
   *
   * @param profundidaRequerida - Recibe por argumento la profundida de la
   * planta
   */
  public void setProfundidadRequerida(int profundidaRequerida) {
    this.profundidaRequerida = profundidaRequerida;
  }

  /**
   * Metodo de Instancia - Implementando desde la Inteface IPlanta
   *
   * Plantas con raiz necesita comprobar la profundidad de maceta para añadirlas
   * el objeto planta al objeto maceta
   *
   * @param maceta
   * @return
   */
  @Override
  public boolean tengoEspacio(IMaceta maceta) {
    boolean profundidadOk = maceta.getProfundidad() > getProfundidaRequerida();
    if (profundidadOk) {
      System.out.println("--- Profundidad ok para " + getNombre() + " en " + maceta.getNombre());
    }
// Invocamos al metodo tengoEspacio del padre "PLANTA" mediante el uso de (super) 
    return super.tengoEspacio(maceta) && profundidadOk;
  }

}
