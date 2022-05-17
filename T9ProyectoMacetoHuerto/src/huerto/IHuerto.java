package huerto;

/**
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
	 * @param maceta
	 */
	void addMaceta(IMaceta maceta);

	/**
	 * Metodo de instancia
	 * 
	 * Devuelve un objeto del tipo planta que pertenezca a la interface IPlanta
	 * 
	 * @param planta
	 * @return - Objeto del tipo planta
	 */
	IMaceta plantar(IPlanta planta);

}
