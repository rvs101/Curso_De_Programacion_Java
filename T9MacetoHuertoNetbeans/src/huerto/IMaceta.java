package huerto;

import java.util.Set;

import huerto.enums.FormaMaceta;

/**
 * Interface IMaceta
 *
 * Operaciones sobre macetas
 *
 * Plantar Plantas
 *
 * Saber qué conjunto de Plantas
 *
 * @author RVS
 * @time 6 may 2022 - 13:32:10
 *
 */
public interface IMaceta {

  /**
   * Obtener nombre de planta
   *
   * @return String - planta
   */
  String getNombre();

  /**
   * Obtener volumen de la maceta
   *
   * @return int - volumen maceta
   */
  int getVolumen();

  /**
   * Obtener volumen disponible de la maceta
   *
   * @return int - volumen maceta
   */
  int volumenDisponible();

  /**
   * Obtener superfice total de la maceta
   *
   * @return int - superficie maceta
   */
  int getSuperficie();

  /**
   * Obtener superficie disponible de la maceta
   *
   * @return int - superficie disponible maceta
   */
  int superficieDisponible();

  /**
   * Obtener la profundidad total de la maceta
   *
   * @return int - profundidad total
   */
  int getProfundidad();

  /**
   * Obtener objeto del tipo FormaMaceta
   *
   * @return Objeto - del tipo maceta
   */
  FormaMaceta getForma();

  /**
   * Obtener si se puede plantar la maceta o no
   *
   * @param planta - Todo objeto descendiente de la clase Planta
   * @return boolean - 'true' o 'false' dependiendo del objeto Planta que reciba
   * como argumento
   */
  boolean plantar(IPlanta planta);

  /**
   * Obtener una colección de objetos del tipo Planta
   *
   * @return - objeto - del tipo planta descendiente de la interface IPlanta
   */
  Set<IPlanta> getPlantas();

}
