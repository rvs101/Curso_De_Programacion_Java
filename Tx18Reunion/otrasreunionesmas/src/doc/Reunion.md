## Clase Reunion 

``@Entity`` indica que esta clase es una entidad JPA y debe ser mapeada a una tabla en la base de datos.

La ``anotación @Id`` indica que la propiedad id es la ``clave primaria`` (PK) de la entidad.

La ``anotación @GeneratedValue`` se utiliza para generar automáticamente un valor para la ``clave primaria`` (FK). 

Se está utilizando el tipo ``GenerationType.IDENTITY``  que significa que la base de datos generará automáticamente un valor para la ``clave primaria`` (FK).

Las ``anotaciones @Column`` se utilizan para indicar el nombre de la columna en la tabla correspondiente a cada propiedad. 

En este caso, las ``anotaciones @Column`` están comentadas, lo que significa que JPA utilizará los nombres de las propiedades por defecto como nombres de las columnas.

La propiedad fecha de tipo ``LocalDateTime`` indica la fecha y hora de la reunión.

La propiedad asunto indica el tema de la reunión.

La propiedad sala es una asociación ``@ManyToOne`` con la ``entidad Sala``, lo que significa que una ``reunión`` se realiza en una ``sala`` y una ``sala`` puede tener muchas reuniones.

La propiedad acta es una asociación ``@OneToOne`` con la ``entidad Acta`` , lo que significa que una ``reunión`` tiene una ``acta`` y una ``acta`` está asociada a una reunión.

La propiedad participantes es una asociación ``@ManyToMany`` con la ``entidad Persona``, lo que significa que muchas ``personas`` pueden participar en ``muchas reuniones`` y una ``reunión`` puede tener muchas personas ``participantes``.

Siguientes métodos:

El ``constructor`` sin argumentos inicializa la propiedad participantes como un conjunto vacío.

El segundo constructor ``inicializa`` la fecha y el asunto de la ``reunión`` y llama al ``constructor sin argumentos`` para inicializar la ``propiedad participantes``.

El tercer constructor toma una ``instancia`` de ``Reunion`` y crea una ``nueva instancia`` con los mismos valores de fecha y asunto.

El ``método addParticipante`` agrega una persona a la ``"Conjunto"`` de ``participantes`` en la ``reunión`` y también agrega la ``reunión`` a la ``"Conjunto"`` de ``reuniones`` de la persona si no está allí.

El método toString simplemente devuelve una cadena que representa la reunión y muestra su id, fecha y asunto.

