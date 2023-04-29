package t17.ejemplos.externos.chat.bing.ejemplos.externos;

/**
 * 
 */
public class Personas {

    /**
     * Atributo de instancia - Objeto name - almacena una cadena de texto
     */
    private String name;
    
    /**
     * Atributo de instancia - elemento - almacena un valor entero 
     */
    private int edad;

    /**
     * Constructor por defecto
     */
    public Personas() {
        this.edad = 0;
        this.name = null;
    }

    /**
     * Constructor parametrizado
     * 
     * @param name - String - Recibe una cadena de texto
     * @param edad - int - Recibe un valor entero
     */ 
    public Personas(String name, int edad) {
        this.name = name;
        this.edad = edad;
    }

    /**
     * Obtener nombre
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Establecer edad
     * 
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtener edad
     * 
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establecer nombre
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
