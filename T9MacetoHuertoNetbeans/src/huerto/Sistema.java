package huerto;

import huerto.macetas.Maceta;
import huerto.macetas.MacetaRectangular;
import huerto.macetas.MacetaTubular;

import huerto.plantas.Lechuga;
import huerto.plantas.Hinojo;
import huerto.plantas.Perejil;
import huerto.plantas.TomateCherry;
import huerto.plantas.Zanahoria;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Concreta Principal para ejecutar todos las clases , objetos y metodos
 * que hacen que el programa funcione
 *
 *
 * @time 11 may 2022 12:42:07
 * @author RVS
 */
public class Sistema {

  /**
   * CONSTANTE que define el numero de Zanahorias
   */
  private static final int NUM_ZANAHORIAS = 5;

  public static void main(String[] args) {

// Definimos la clase principal que almacena todos los objetos de la clase Macetas
//mediante la interface Set y el objeto para almacenar una colección de la clase HashSet
    Huerto miHuerto = new Huerto("Mi primer huerto");

// Creamos todos los objetos del tipo Macetas para añadirlos a la colección de objetos de la clase miHuerto 
    Maceta cuadrada = new MacetaRectangular("Cuadradita", 20, 20, 20);
    Maceta botella = new MacetaTubular("Botella", 25, 15);
    Maceta maceton = new MacetaTubular("Macetón", 40, 40);

// El objeto de la colección 'miHuerto' van almacenando un objeto 'maceta' distinto de la clase Maceta
    miHuerto.addMaceta(cuadrada);
// El objeto de la colección 'miHuerto' van almacenando un objeto 'maceta' distinto de la clase Maceta
    miHuerto.addMaceta(botella);
// El objeto de la colección 'miHuerto' van almacenando un objeto 'maceta' distinto de la clase Maceta
    miHuerto.addMaceta(maceton);

    System.out.println("Mi huerto nuevito : " + miHuerto);

// Invoco a la Interface IPlanta para que instancie un objeto del tipo 'tomatitos' 
//y apunte a la clase descendiente de TomateCherry para obtener toda su implementación y metodos 
    IPlanta tomatitos = new TomateCherry("tomatitos");
// Interface objeto = Clase Concreta(Constructor)   
    IPlanta acelga = new Lechuga("hojas verdes");
    IPlanta zanahoria = new Zanahoria("larguita");
    IPlanta perejil = new Perejil("verdito");
    IPlanta hinojo = new Hinojo("hijo sin ojo");

// Interface List<ClaseConcreta> 
//         instancia objeto "zanahorias"
//                               CLase ArrayList<>() → Añade los metodos necesarios al objeto zanahorias
    List<Zanahoria> zanahorias = new ArrayList<>();
// Recorremos el bucle 4 veces    
    for (int i = 0; i < NUM_ZANAHORIAS; i++) {
// Instanciamos un objeto del tipo Zanahoria                      
      Zanahoria z = new Zanahoria("z" + i);
// Añadimos a la colección de objetos del tipo 'zanahorias' el metodo add() 
// 5 objetos del mismo tipos enumerados desde 0
      zanahorias.add(z);
    }

//Interface de tipo IMaceta crea un objeto del tipo 'macetaTomatitos'
// 'macetaTomatitos' apunta a un objeto del tipo 'miHuerto' e invoca al metodo (plantar) 
//   El metodo (plantar) implementando en la clase Huerto y declarado en la Interface IHuerto
//    Recibe por parametro cualquier objeto descendiente de la Interface IPlanta 
//      para añadirlo a una colección de objetos del tipo IMaceta
    IMaceta macetaTomatitos = miHuerto.plantar(tomatitos);
    pintaResultadoPlantar(tomatitos, macetaTomatitos);

    IMaceta macetaAcelga = miHuerto.plantar(acelga);
    pintaResultadoPlantar(acelga, macetaAcelga);

    IMaceta macetaZanahoria = miHuerto.plantar(zanahoria);
    pintaResultadoPlantar(zanahoria, macetaZanahoria);

    IMaceta macetaPerejil = miHuerto.plantar(perejil);
    pintaResultadoPlantar(perejil, macetaPerejil);

    IMaceta macetaHinojo = miHuerto.plantar(hinojo);
    pintaResultadoPlantar(hinojo, macetaHinojo);

    for (Zanahoria z : zanahorias) {
      IMaceta macetaZ = miHuerto.plantar(z);
      pintaResultadoPlantar(z, macetaZ);
    }

    System.out.println("Mi huerto con muchas plantas: " + miHuerto);
  }

  /**
   * Procedimiento de Clase
   *
   * Muestra el nombre del planta y el nombre de la maceta
   *
   * @param planta - Objeto descendiente de la Interface IPlanta
   * @param maceta - Objeto descendiente de la Interface IMaceta
   */
  private static void pintaResultadoPlantar(IPlanta planta, IMaceta maceta) {
    if (maceta != null) {
      System.out.println("He plantado " + planta.getNombre() + " en " + maceta.getNombre());
    } else {
      System.out.println("No he podido plantar " + planta.getNombre());
    }
  }
}
