package cap18.orm.otrasreunionesmas;

import java.text.MessageFormat;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cap18.orm.otrasreunionesmas.dao.ActaDao;
import cap18.orm.otrasreunionesmas.dominio.Acta;
import cap18.orm.otrasreunionesmas.dominio.Persona;
import cap18.orm.otrasreunionesmas.dominio.Reunion;

/**
 * Clase Concreta
 * 
 * 
 * 
 * @author rad
 *
 */
public class InformeReuniones {

	/**
	 * CONSTANTE de Clase
	 */
	private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("'el' EEEE, dd 'de' MMMM 'de' yyyy 'a las' HH:mm");

	/**
	 *  CONSTANTE de Clase
	 */
	private static final String ID_FORMAT = ",number,#";

	/**
	 * CONSTANTE de Clase
	 */
	private static final int MIN_PART = 5;

	
	public static void main(String[] args) {
		
		ActaDao actaDao = new ActaDao();
		
		List<Acta> actas = actaDao.getAll();
		
		Map<Reunion, String> informes = new HashMap<>(actas.size());
		
		actas.stream().filter(
						acta -> acta.getReunion().getParticipantes().size() >= MIN_PART).forEach(
						acta -> informes.put(acta.getReunion(), informeReunion(acta.getReunion())));
		imprimirInformes(informes);
	};

	/**
	 * 
	 * @param informes
	 */
	public static void imprimirInformes(Map<Reunion, String> informes) {
		
		informes.entrySet()
				.stream()
				.sorted(Comparator.comparing(informe -> informe.getKey().getFecha()))
				.forEach(
				  informe -> {
					System.out.println("== Reunión:\n" + informe.getKey().getAsunto());
					System.out.println("== Informe:\n" + informe.getValue());
				});
	}

	/**
	 * 
	 * @param r
	 * @return
	 */
	public static String informeReunion(Reunion r) {
		
		StringBuilder sb = new StringBuilder(MessageFormat.format(
				"Informe de la reunión con asunto \"{0}\" (id {1" + ID_FORMAT + "})\n", r.getAsunto(), r.getId()));

		sb.append(MessageFormat.format("\tcelebrada {0}\n\ten la sala {1} (id {2})\n",
				r.getFecha().format(FORMATO_FECHA), 
				r.getSala().getDescripcion(), 
				r.getSala().getId()));
		
		sb.append(informeParticipantes(r));
		sb.append(informeActa(r));
		return sb.toString();
	}

	/**
	 * 
	 * @param r
	 * @return
	 */
	private static String informeParticipantes(Reunion r) {
		
		StringBuilder sb = new StringBuilder("Participantes:\n");
		
		Set<Persona> participantes = r.getParticipantes();

		if (participantes.isEmpty()) {
			sb.append("No hay participantes:\n");
		}
		
		participantes.stream().sorted(Comparator.comparing(Persona::getNumeroEmpleado)).forEach(
			persona -> 
				sb.append(MessageFormat.format("\t{2}\t{1}, {0}\n", 
					persona.getNombre(),
					persona.getApellidos().toUpperCase(), 
					persona.getNumeroEmpleado()))
			);
		return sb.toString();
	}

	/**
	 * 
	 * @param r
	 * @return
	 */
	private static String informeActa(Reunion r) {
		
		Acta a = r.getActa();
		
		StringBuilder sb = new StringBuilder("Acta:\n");
		
		if (a == null) {
			sb.append("No hay acta\n");
		} else {
			sb.append("\t" + a.getContenido() + "\n");
		}
		return sb.toString();
	}
}
