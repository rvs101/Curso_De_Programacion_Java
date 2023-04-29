package cap18.orm.otrasreunionesmas;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import cap18.orm.otrasreunionesmas.dao.ReunionDao;
import cap18.orm.otrasreunionesmas.dao.SalaDao;
import cap18.orm.otrasreunionesmas.dominio.Reunion;
import cap18.orm.otrasreunionesmas.dominio.Sala;

/**
 * Clase recibira las indicaciones por argumentos<br>
 * <br>
 * 1º argumento es el identificador de la sala<br>
 * <br>
 * 2º argumento la fecha deseada <br>
 * <br>
 * Si no recibe ninguna fecha usamos la de hoy<br>
 * <br>
 *
 * @author rad
 *
 */
public class CartelSala {

	/**
	 * CONSTANTE<br>
	 * <br>
	 * Formatea la fecha usando un patron
	 *
	 */
	private static final DateTimeFormatter FORMATO_HORA = DateTimeFormatter.ofPattern("HH:mm");

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("Faltan parámetros. Indica id de sala, y opcionalmente la fecha deseada (AAAA-MM-DD).");
			return;
		}
		String salaId = args[0];
		LocalDate fecha;
		if (args.length >= 2) {
			fecha = LocalDate.parse(args[1]);
		} else {
			fecha = LocalDate.now();
		}

		SalaDao salaDao = new SalaDao();
		Optional<Sala> optional = salaDao.get(salaId);
		if (optional.isPresent()) {
			Sala sala = optional.get();
			ReunionDao reunionDao = new ReunionDao();
			List<Reunion> reuniones = reunionDao.getBySalaAndFecha(sala, fecha);
			imprimirCabecera(sala, fecha);
			imprimirReuniones(reuniones);
		} else {
			System.err.println(MessageFormat.format("La sala con id {0} no existe", salaId));
		}
	}

	/**
	 * 
	 * @param sala
	 * @param fecha
	 */
	private static void imprimirCabecera(Sala sala, LocalDate fecha) {
		System.out.println(MessageFormat.format("* SALA: {0} ({1})", sala.getDescripcion(), sala.getId()));
		System.out.println(MessageFormat.format("* FECHA: {0}", fecha));
	}

	/**
	 * 
	 * @param reuniones
	 */
	private static void imprimirReuniones(List<Reunion> reuniones) {
		System.out.println("Reuniones previstas:");
		for (Reunion reunion : reuniones) {
			System.out.println(
					MessageFormat.format("{0}:\t{1}", reunion.getFecha().format(FORMATO_HORA), reunion.getAsunto()));
		}
	}

}


//SalaDao - Recuperamos la sala solicitada , controlando si existe
//Le indicamos a la clase Abstracta AbstractDao<Sala> con que clase
//concreta vamos a trabajar a través del constructor de la clase SalaDao que ya
//la clase abstracta AbstractDao es de tipo genérica
