package t17.ejemplos.externos.chat.bing.ejemplos.externos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EjemploPredicate {

    public static void main(String[] args) {

        List<Personas> personas = Arrays.asList(
                new Personas("Juan", 24),
                new Personas("Pedro", 35),
                new Personas("Jesus", 32),
                new Personas("Tomas", 15));

        // Condición a ejecutar utilizando el Predicate<Personas>
        Predicate<Personas> edadMayor20 = (p -> p.getEdad() > 20);

        // Creamos una List<Personas> y le añadimos un stream() para convertir los datos
        // en flujo
        List<Personas> personasFiltradas = personas.stream()
                // Filtramos los elementos
                .filter(edadMayor20)
                // Convertimos los elementos en una lista
                .collect(Collectors.toList());
        // Recorremos todos los elementos de la List<Personas> mediante forEach()
        // Mostramos los datos que pase el filtro usando el metodo getName() de cada objeto
        // Para obtener el nombre
        personasFiltradas.forEach(p -> System.out.println(p.getName()));

    }
}