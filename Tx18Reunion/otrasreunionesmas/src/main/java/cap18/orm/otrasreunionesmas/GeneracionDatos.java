package cap18.orm.otrasreunionesmas;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import cap18.orm.otrasreunionesmas.dao.ActaDao;
import cap18.orm.otrasreunionesmas.dao.ReunionDao;
import cap18.orm.otrasreunionesmas.dao.SalaDao;
import cap18.orm.otrasreunionesmas.dominio.Acta;
import cap18.orm.otrasreunionesmas.dominio.Persona;
import cap18.orm.otrasreunionesmas.dominio.Reunion;
import cap18.orm.otrasreunionesmas.dominio.Sala;

/**
 *
 * @author rad
 *
 */
public class GeneracionDatos {

	private static final int HORA_INI = 10;

	public static void main(String[] args) {

		System.out.println("Otra reunión más - Generación de datos");
//		DAOs
		ReunionDao reunionDao = new ReunionDao();
		ActaDao actaDao = new ActaDao();
		SalaDao salaDao = new SalaDao();

//		Creacion de objetos
		Sala s099 = new Sala("S099", "Trastero", 1);
		Sala s101 = new Sala("S101", "Reunión primera planta", 10);
		Sala s109 = new Sala("S109", "Entrevistas primera planta", 3);
		Sala s203 = new Sala("S203", "Sala grande", 25);

		salaDao.save(s099);
		salaDao.save(s101);
		salaDao.save(s109);
		salaDao.save(s203);

		Persona marta = new Persona("E001", "Marta", "García López");
		Persona pedro = new Persona("E002", "Pedro", "Gómez Fernández");
		Persona santi = new Persona("E003", "Santi", "Pérez Pérez");
		Persona luisa = new Persona("E004", "Luisa", "Gutiérrez González");

		Reunion r0 = new Reunion(LocalDateTime.now(), "Reunión de Test");
		Reunion r1 = new Reunion(LocalDateTime.now().plus(2, ChronoUnit.HOURS), "Otra Reunión de Test");
		Reunion r2 = new Reunion(LocalDateTime.now().plus(2, ChronoUnit.DAYS), "Reunión de pasado mañana");
		Reunion r3 = new Reunion(LocalDateTime.now().plus(1, ChronoUnit.DAYS), "Reunión de mañana");
		Reunion r4 = new Reunion(LocalDateTime.now().minus(1, ChronoUnit.DAYS), "Reunión de ayer");

		// reuniones de hoy en sala 101
		LocalDateTime hoy = LocalDateTime.now().withHour(10);

		for (int i = 0; i < 5; i++) {
			Reunion r = new Reunion(hoy.plusHours(i), "Reunión de las " + (HORA_INI + i));
			r.setSala(s101);
			reunionDao.save(r);
		}

		r0.addParticipantes(marta);
		r0.setSala(s099);
		reunionDao.save(r0);
		Acta a0 = new Acta("Marta se reune sola , solo para descansar un rato", r0);
		actaDao.save(a0);
		reunionDao.update(r0);

		r1.addParticipantes(marta);
		r1.addParticipantes(pedro);
		r1.addParticipantes(santi);
		r1.addParticipantes(luisa);
		r1.setSala(s101);
		reunionDao.save(r1);

		r2.addParticipantes(pedro);
		r2.addParticipantes(santi);
		r2.setSala(s109);
		reunionDao.save(r2);

		r3.addParticipantes(marta);
		r3.addParticipantes(luisa);
		r3.setSala(s109);
		reunionDao.save(r3);

		r4.addParticipantes(marta);
		r4.addParticipantes(pedro);
		r4.addParticipantes(santi);
		r4.addParticipantes(luisa);
		r4.setSala(s203);
		reunionDao.save(r4);

		Acta a4 = new Acta("Preparacion del lanzamiento de la aplicación \"Otra Reunión Mas\".", r4);
		actaDao.save(a4);
		reunionDao.update(r4);

	}

}
