## Clase Concreta Acta - JPA

* Representa un acta para una reunión. 

@Entity: Esta anotación indica que esta clase es una entidad JPA puede ser persistida en una base de datos.

@Id: Esta anotación indica que el campo 'id' es la clave primaria de la entidad. 
El tipo de clave primaria es un valor generado automáticamente
Se asigna un valor único a cada nuevo objeto de esta clase.

@GeneratedValue: Esta anotación especifica cómo se generará el valor de la clave primaria.
Se utiliza ``GenerationType.IDENTITY`` que indica que se utilizará una columna de identidad en la base de datos para generar valores únicos.

private int id: Este campo representa la clave primaria de la entidad.

private String contenido: Este campo representa el contenido del acta.

@OneToOne: Esta anotación indica que la relación entre Acta y Reunion es de uno a uno (1:1) 
Cada acta se relaciona con una sola reunión.

@JoinColumn: Esta anotación especifica que la relación entre Acta y Reunion se mapea a través de una columna de clave foránea en la tabla de Acta. 
El nombre de la columna se deriva del nombre del campo al que se aplica la anotación.

private Reunion reunion: Este campo representa un objeto reunión a la que se refiere el acta.

public Acta(): Este es el constructor sin argumentos de la clase.

public Acta(String contenido, Reunion reunion): Este es el constructor con argumentos de la clase.
Toma como parámetros el contenido del acta y del objeto reunión a la que se refiere el acta.

this.contenido = contenido: Este código asigna el valor del parámetro contenido al campo contenido de la instancia actual de Acta.

this.reunion = reunion: Este código asigna el valor del parámetro reunion al campo reunion de la instancia actual de Acta.

reunion.setActa(this): Este código establece la referencia a la ``instancia actual de Acta`` en el ``campo Acta`` de la ``instancia de Reunion`` correspondiente.

public int getId(): Este método devuelve el valor del campo id de la instancia actual de Acta.

public void setId(int id): Este método establece el valor del campo id de la instancia actual de Acta.

public String getContenido(): Este método devuelve el valor del campo contenido de la instancia actual de Acta.

public void setContenido(String contenido): Este método establece el valor del campo contenido de la instancia actual de Acta.

public Reunion getReunion(): Este método devuelve la ``instancia de Reunion`` correspondiente al ``campo reunion`` de la ``instancia actual`` de Acta.

public void setReunion(Reunion reunion): Este método establece el valor del ``campo reunion`` de la ``instancia actual`` de la clase Acta.

@Override
public String toString(): Este método devuelve una cadena que representa la instancia actual de Acta. 
Devuelve una cadena que contiene los valores de los campos id y contenido.

