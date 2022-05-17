package huerto;

import huerto.enums.Especie;
import huerto.enums.Familia;

/**
 * Interface IPlanta para generar clases del tipo Planta que implemente los
 * metodos dependiendo de sus necesidades
 * 
 * @author RVS
 * @time 6 may 2022 - 13:52:33
 *
 */
public interface IPlanta {

	/**
	 * Obtener el nombre de la Planta
	 * 
	 * @return String - nombre de la planta
	 */
	String getNombre();

	/**
	 * Obtener la superficie requerida de la planta para que crezca
	 * 
	 * @return int - superficie requerida
	 */
	int getSuperficieRequerida();

	/**
	 * Obtener el volumen requerido para la planta dentro de la maceta
	 * 
	 * @return int - volumen requerido de la planta
	 */
	int getVolumenRequerido();

	/**
	 * Obtener objeto del tipo Familia que identifique a que familia pertenece la
	 * Planta
	 * 
	 * @return Objeto - tipo Familia
	 */
	Familia getFamilia();

	/**
	 * Obtener objeto del tipo Especie que identifique a que especie pertenece la
	 * Planta
	 * 
	 * @return Objeto - tipo Especie
	 */
	Especie getEspecie();

	/**
	 * Obtener 'true' o 'false' si el objeto del tipo 'planta' pasado por parametro
	 * es compatible con el objeto planta que invoca este metodo de la interface
	 * IPlanta
	 * 
	 * @param planta - Objeto del tipo Planta
	 * @return boolean - 'true' o 'false' dependiendo de si son compatibles o no
	 */
	boolean esCompatible(IPlanta planta);

	/**
	 * Obtener 'true' o 'false' si el objeto del tipo 'maceta' pasado por parametro
	 * es compatible con el objeto planta que invoca este metodo de la inferface
	 * IMaceta
	 * 
	 * @param maceta - Objeto del tipo maceta
	 * @return boolean - 'true' o 'false' dependiendo de si el objeto planta tiene
	 *         espacio dentro del objeto del tipo maceta
	 */
	boolean tengoEspacio(IMaceta maceta);

	/**
	 * Establece que objeto de tipo maceta puede almacenar el objeto del tipo planta
	 * 
	 * @param maceta - Objeto del tipo maceta
	 */
	void plantar(IMaceta maceta);

}
