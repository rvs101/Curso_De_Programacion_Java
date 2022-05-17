package huerto;

/**
 * Interface Principal
 *
 * Dentro de huerto añadir macetas , plantar plantas , añadir macetas
 *
 * @author RVS
 * @time 6 may 2022 - 12:39:44
 *
 */
public interface IHuerto {

  /**
   * Procedimiento de instancia
   *
   * Establece un objeto del tipo maceta que pertenezca a la interface IMaceta
   *
   * @param maceta - Todo objeto del tipo IMaceta que implemente esta interface
   * y herede sus metodos desde las clases descendientes
   */
  void addMaceta(IMaceta maceta);

  /**
   * Metodo de instancia
   *
   * Devuelve un objeto del tipo planta que pertenezca a la interface IPlanta
   *
   * @param planta - Todo objeto del tipo IPlanta que implemente esta interface
   * y herede sus metodos desde de las clases descendientes
   * @return - Objeto del tipo planta
   */
  IMaceta plantar(IPlanta planta);

}
