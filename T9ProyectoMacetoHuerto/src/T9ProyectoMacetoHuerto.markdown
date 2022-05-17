## T9 - Proyecto MacetoHuerto

En este capítulo aprenderás a:

1. Desarrollar un programa orientado a objetos
2. Aplicar lo aprendido en los capítulos anteriores
3. Perderles el miedo al código , a las clases , a tener varios ficheros

#### PACKAGE - Estructura de paquetes

1. **huerto** 
    * Paquete raiz de todo el proyecto
2. **enums**
    * En este paquete pondremos subpaquete la implementación de las macetas y de sus subclases
    * 

#### CLASES - Proyecto MacetoHuerto

1. Crear una **Clase** por cada **Planta**
2. Crear **objetos** del tipo **Tomates** → Varios **objetos** de tipos de **tomates**
    * Distintas **semillas**
    * Distintas **macetas**
    * Distintas **fechas**
3. **Tomate Cherry**
    * Heredará caracteristicas de **Tomate**
    * Tendrás Caracteristicas Propias
    
##### CLASES PRINCIPALES

*Clase Abstracta*

1. **Maceta**
    * Volumen total
    * Volumen disponible
    * Superficie total
    * Superficie disponible
    * Profundidad
    * Forma Maceta ( importar desde otro paquete )
    
*Clase Hija*

1. **Maceta**

```java
// APIS de Java
import java.util.Set;
import java.util.HashSet;

// Interfaces y Enum propios
import huerto.IMaceta;
import huerto.IPlanta;
import huerto.enums.FormaMaceta;

/**
 * Clase Abstracta Maceta que implementará algunos métodos de la interface
 * IMaceta
 * 
 * Algunos métodos dependerán de la forma de la maceta
 * 
 * Otros métodos dependerán de la implementación de las clases hijas
 * 
 * Dimensiones de la maceta : alto , ancho y alto
 * 
 * 
 * @author RVS
 * @time 6 may 2022 - 14:21:16
 *
 */
public abstract class Maceta implements IMaceta {

	/**
	 * Atributo de Instancia de la clase abstracta Maceta
	 */
	private String nombre;

	/**
	 * Atributo de Instancia de la clase abstracta Maceta
	 */
	private int alto;

	/**
	 * Atributo de Instancia de la clase abstracta Maceta
	 */
	private Set<IPlanta> plantas;

	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre
	 * @param alto
	 */
	public Maceta(String nombre, int alto) {
		super(); // Constructor de la interface IMaceta
		this.nombre = nombre;
		this.alto = alto;
//		Inicializo el objeto del tipo Set<IPlanta> como una clase HashSet
		plantas = new HashSet<IPlanta>();
	}

	/**
	 * Obtener el nombre de la maceta
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtener el volumen de la maceta
	 * 
	 * @return int - calcula del alto por la superficie
	 */
	@Override
	public int getVolumen() {
		return alto * getSuperficie();
	}

	/**
	 * Obtener el ancho
	 * 
	 * @return int - devuelve el ancho/profundida
	 */
	@Override
	public int getProfunidad() {
		return alto;
	}

	/**
	 * Devuelve la colección de objetos del tipo IPlantas
	 * 
	 * @return objeto - Descendientes del tipo IPlantas
	 */
	@Override
	public Set<IPlanta> getPlantas() {
		return plantas;
	}

	/**
	 * Obtener la superficie después de calcular
	 * 
	 * @return int - Superficie calculada de la maceta
	 */
	@Override
	public int superficieDisponible() {
		return getSuperficie() - superficieOcupada();
	}

	/**
	 * Método de la clase abstracta Maceta
	 * 
	 * @return int - Devuelve la suma total de los espacios ocupados
	 */
	private int superficieOcupada() {
// Inicializo la variable
		int res = 0;
// Recorro la colección de objetos del tipo IPlanta		
		for (IPlanta p : plantas) {
// A cada objeto de la colección almaceno la superficie de la planta		
			res += p.getSuperficieRequerida();
		}
		return res;
	}

	/**
	 * 
	 */
	@Override
	public boolean plantar(IPlanta planta) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 
	 */
	@Override
	public FormaMaceta getForma() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Obtenemos todos los espacios de los objetos de las macetas
	 * 
	 * @return int - devuelve el espacio total ocupado por las macetas
	 */
	private int volumenOcupado() {
		int res = 0;
		for (IPlanta p : plantas) {
			res += p.getVolumenRequerido();
		}
		return res;
	}

	/**
	 * Obtenemos el espacio disponible de la maceta
	 * 
	 * @return int - devuelve el espacio disponible
	 */
	@Override
	public int volumenDisponible() {
		return getVolumen() - volumenOcupado();
	}

	/**
	 * Obtenemos todos los datos de las macetas
	 * 
	 * @return String - objeto que almacena información de las macetas
	 */
	@Override
	public String toString() {
//		Almacena mensajes dentro de la clase StringBuilder la cual no sincroniza hilos
		StringBuilder sb = new StringBuilder("Maceta " + nombre + " [" + getForma() + "] (sup " + getSuperficie()
				+ "cm2 - vol " + getVolumen() + "cm3).\n");
// 		Si no hay objetos en la colección plantas
		if (plantas.isEmpty()) {
//			Añado al objeto de la colección plantas el mensaje "vacio"
			sb.append("\t\tvacía\n");
		}
//		Para todos los objetos de la colección plantas 
		for (IPlanta p : plantas) {
//			Añado al objeto del tipo StringBuilder un objeto del tipo planta
			sb.append("\t\t" + p + "\n");
		}
//		Añado al objeto del tipo StringBuilder la superficie disponible y el volumen disponible
		sb.append("\t\t>> Disponible sup " + superficieDisponible() + "cm2 - vol" + volumenDisponible() + " cm3");
//		Devuelve todos los objetos con los datos de las macetas
		return sb.toString();
	}

}

```

2. **MacetaRectangular**
	* Atributos de Instancia : 
	    * ancho 
	    * alto (alto heredado)
	* Constructor
        * MacetaRectangular
            * nombre (heredados de la clase padre mediante super)
            * alto (heredados de la clase padre mediante super)
            * ancho
            * largo
	* Métodos
		 * getSuperficie() 
		    * Calcula el ancho por el largo
		 * getForma();
		    * Devuelve uno de los valores enumerados del tipo FormaMaceta
        
```java
import huerto.enums.FormaMaceta;

/**
 * 
 * @author RVS
 * @time 7 may 2022 - 14:41:01
 *
 */
public class MacetaRectangular extends Maceta {

	/**
	 * Atributos de Instancia
	 * 
	 * Almacena un entero como ancho
	 */
	private int ancho;
	
	/**
	 * Atributos de Instancia
	 * 
	 * Almacena un entero como largo
	 */
	private int largo;

	/**
	 * 
	 * @param nombre
	 * @param alto
	 * @param ancho
	 * @param largo
	 */
	public MacetaRectangular(String nombre, int alto, int ancho, int largo) {
		super(nombre, alto);
		this.ancho = ancho;
		this.largo = largo;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Obtenemos la superficie
	 * 
	 * @return itn - calculo del alto por el ancho
	 */
	@Override
	public int getSuperficie() {
		return ancho * largo;
	}

	/**
	 * Metodo del tipo enum
	 * 
	 * @return enum - devuelve un enum.Rectangular
	 * 
	 */

	public FormaMaceta getForma() {
		return FormaMaceta.RECTANGULAR;

	}
}
```

3. **MacetaTubular**
    * Clase Hija de **Maceta**
    * Clase hermana de **MacetaRectangular** la cual almacena casi los mismo atributos
         * Define el método getSuperficie();     


```java
/**
 * Clase hija de la clase Padre Maceta
 * 
 * @author RVS
 * @time 7 may 2022 - 14:49:32
 *
 */
public class MacetaTubular extends Maceta {

	/**
	 * Atributo de instancia
	 * 
	 * Almacena el valor del diametro
	 */
	private int diametro;

	/**
	 * Constructor parametrizado para definir una maceta tubular
	 * 
	 * @param nombre   - String - Nombre de la maceta
	 * @param alto     - int - Altura de la maceta
	 * @param diametro - int - Diametro total de la maceta
	 */
	public MacetaTubular(String nombre, int alto, int diametro) {
// Metodo heredados de la clase Padre
		super(nombre, alto);
//		Definimos el diametro
		this.diametro = diametro;
	}

	/**
	 * Obtenemos la superficie de una maceta tubular
	 * 
	 * @return int - Devuelve el calculo de la superficie de una maceta tubular
	 */
	@Override
	public int getSuperficie() {
//		PI : 3.1415926535
		return (int) Math.PI * (diametro / 2) * (diametro / 2);
	}

	/**
	 * Obtenemos un enum del tipo Tubular
	 * 
	 * @return enum - tipo enum tubular
	 */
	public FormaMaceta getForma() {
		return FormaMaceta.TUBULAR;
	}
}

```

	    
    
#### INTERFACES 

* *IHuerto*

```java

package huerto;

/**
 * Dentro de huerto añadir macetas , plantar plantas , añadir macetas
 * 
 * @author RVS
 * @time 6 may 2022 - 12:39:44
 *
 */
public interface IHuerto {

	/**
	 * Procedimiento de instancia
	 * 
	 * Establece un objeto del tipo maceta que pertenezca a la interface IMaceta
	 * 
	 * @param maceta
	 */
	void addMaceta(IMaceta maceta);

	/**
	 * Metodo de instancia
	 * 
	 * Devuelve un objeto del tipo planta que pertenezca a la interface IPlanta
	 * 
	 * @param planta
	 * @return - Objeto del tipo planta
	 */
	IMaceta plantar(IPlanta planta);

}
```

* *IMaceta*

```java
public interface IMacetas {

	/**
	 * Obtener nombre de planta
	 * 
	 * @return String - planta
	 */
	String getNombre();

	/**
	 * Obtener volumen de la maceta
	 * 
	 * @return int - volumen maceta
	 */
	int getVolumen();

	/**
	 * Obtener volumen disponible de la maceta
	 * 
	 * @return int - volumen maceta
	 */
	int volumenDisponible();

	/**
	 * Obtener superfice total de la maceta
	 * 
	 * @return int - superficie maceta
	 */
	int getSuperficie();

	/**
	 * Obtener superficie disponible de la maceta
	 * 
	 * @return int - superficie disponible maceta
	 */
	int superficieDisponible();

	/**
	 * Obtener la profundidad total de la maceta
	 * 
	 * @return int - profundidad total
	 */
	int getProfunidad();

	/**
	 * Obtener objeto del tipo FormaMaceta
	 * 
	 * @return Objeto - del tipo maceta
	 */
	FormaMaceta getForma();

	/**
	 * Obtener si se puede plantar la maceta o no
	 * 
	 * @param planta - Todo objeto descendiente de la clase Planta
	 * @return boolean - 'true' o 'false' dependiendo del objeto Planta que reciba
	 *         como argumento
	 */
	boolean plantar(IPlanta planta);

	/**
	 * Obtener una colección de objetos del tipo Planta
	 * 
	 * @return - objeto - del tipo planta descendiente de la interface IPlanta
	 */
	Set<IPlanta> getPlantas();
}
```

* *IPlanta*

    * Define los **metodos** que tendrán que implementar tanto las **clases abstractas** de **Plantas** como sus **clases hijas** concretas

```java
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
```

* **Planta**

    * Clase Abstracta que implementa algunos métodos de la *interface IPlantas* y otros **métodos propios**
        * Atributos
           * nombre : String - nos ayudará a personalizar cada planta
           * superficieRequerida : int - para saber los cm2 de la maceta que debemos reservar para cada planta
               * Se inicializa en el **constructor**
           * volumenRequerido : int - el volumen de sustrato que necesita la planta en cm3
               * Se inicializa en el **constructor**
           * fechaSiembra : Date - registra cuando se planto esa planta
           * maceta : Objeto del tipo IMaceta - registra en que maceta ha sido plantada esa planta
           * especie : enum - indica que especie es la planta 
           * familia : enum - especifica de qué familia es cada planta
           * incompatible : colección de objetos descendientes de la interface Set para almacenar un enum del tipo Especie
                * Se inicializa como colecciones vacias en el **constructor** llamados antes que los constructores de las **clases hijas**
           * compatibles : colección de objetos descendientes de la interface Set para almacenar un enum del tipo Especie
                * Se inicializa como colecciones vacias en el **constructor** llamados antes que los constructores de las **clases hijas**

#### ENUMERADOS

* **FormaMaceta**

```java
package huerto.enums2;

public enum FormaMaceta2{
	RECTANGULAR , TUBULAR
}
```

* **Familia**

```java
/**
 * Definimos 4 familias de Plantas
 * 
 * @author RVS
 * @time 6 may 2022 - 14:08:13
 *
 */
public enum Familia {

	/**
	 * Familia de las Plantas
	 */
	HOJA, RAIZ, FRUTO, AROMATICA
}
```


* **Especie**

```java

/**
 * Define todas las especies de la Familia de las Plantas
 * 
 * @author RVS
 * @time 6 may 2022 - 14:11:23
 *
 */
public enum Especie {

	LECHUGA, ZANAHORIAS, TOMATE, PEREJIL, ESPINACA, REMOLACHA, HINOJO;
}
```
