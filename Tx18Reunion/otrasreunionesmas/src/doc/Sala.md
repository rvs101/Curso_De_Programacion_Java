## Clase Sala

Define una clase Sala que representa una sala de reuniones en una aplicación de gestión de reuniones. 

Esta clase tiene cuatro atributos privados:

id: es una cadena de texto que representa el identificador único de la sala.

descripcion: es una cadena de texto que describe la sala.

capacidad: es un número entero que indica la capacidad de la sala.

reuniones: es una lista de objetos Reunion que se han llevado a cabo en esta sala.

La clase Sala tiene tres constructores, uno sin argumentos y otros dos que aceptan tres argumentos para inicializar los atributos de la clase. 

Los métodos getId, getDescripcion y getCapacidad son getters para obtener los valores de los atributos correspondientes, mientras que los métodos setId, setDescripcion y setCapacidad son setters para establecer los valores de los atributos.

El método getReuniones devuelve la lista de reuniones que se han llevado a cabo en esta sala, mientras que el método setReuniones establece la lista de reuniones de la sala.

El método toString devuelve una cadena de texto que representa la sala y sus atributos en un formato legible para los humanos.

Este código define la clase Sala como una entidad persistente en una base de datos utilizando JPA (Java Persistence API). 

La anotación @Entity indica que la clase es una entidad, y la anotación @Id indica que el campo id es la clave primaria de la entidad.

La clase Sala tiene tres atributos: id, descripcion, y capacidad, que representan el identificador único de la sala, la descripción de la sala, y la capacidad máxima de personas que pueden estar en la sala, respectivamente.

El atributo reuniones representa una lista de las reuniones que se han llevado a cabo en la sala. 

La anotación @OneToMany(mappedBy = "sala") indica que hay una relación uno-a-muchos entre la entidad Sala y la entidad Reunion, donde una sala puede tener muchas reuniones. 

La propiedad mappedBy especifica que el atributo sala en la clase Reunion es el propietario de la relación.

La clase Sala también tiene un constructor sin argumentos y un constructor que toma tres argumentos para inicializar los atributos. 

Tiene los métodos getter y setter para los atributos y el método toString para devolver una representación en formato de cadena de la entidad Sala.

