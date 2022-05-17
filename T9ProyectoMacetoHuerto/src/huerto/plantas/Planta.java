package huerto.plantas;

import huerto.IMaceta;
import huerto.IPlanta;
import huerto.enums.Especie;
import huerto.enums.Familia;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * →
 * 
 * @author RVS
 * @time 8 may 2022 - 12:18:59
 *
 */
public abstract class Planta implements IPlanta {

	protected Especie especie;
	protected Familia familia;
	protected Set<Especie> incompatibles;
	protected Set<Especie> compatibles;

	private String nombre;
	private int superficieRequerida;
	private int volumenRequerido;
	private Date fechaSiembra;
	private IMaceta maceta;

	protected Planta(String nombre, int distancia, int litros) {
		this.nombre = nombre;
		superficieRequerida = distancia ^ 2;
		volumenRequerido = litros * 1000;
		incompatibles = new HashSet<Especie>();
		compatibles = new HashSet<Especie>();
	}
	
	
}
