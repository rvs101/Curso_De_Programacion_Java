package huerto.plantas;

import huerto.enums.Especie;

/**
 * @time 9 may 2022 12:01:50
 * @author RVS
 */
public class Tomate extends PlantaFruto {

  /**
   * Construtor Parametrizado Publico
   *
   * Invoca con 'this' el Construtor protected Tomate declarado abajo para
   * asignarle unos parametros establecidos cada vez que instancie un objeto
   *
   * @param nombre - String : Asigna un nombre a los objetos que instanciemos
   */
  public Tomate(String nombre) {
// Invoca al constructor protected "Tomate" declarado abajo 
// y lo implementa con unos valores por defecto para que cuando
// se cree un objeto desde este constructor permita pasarle un parametro 
// y asigne otros parametros directamente 
    this(nombre, 30, 18); // Este "THIS" esta llamando directamente al constructor de protected
//    especie = Especie.TOMATE;
//    incompatibles.add(Especie.HINOJO);
//    compatibles.add(Especie.LECHUGA);
//    compatibles.add(Especie.PEREJIL);
//    compatibles.add(Especie.ZANAHORIAS);
  }

  /**
   * Construtor Parametrizado Protected
   *
   * Realiza todo el trabajo y hereda el constructor de la "clase PlantaFruto"
   *
   * @param nombre - String : Nombre de la planta
   * @param superfice - int : Superficie del espacio de la planta
   * @param volumen - int : volumen de sustrato que necesita la planta
   */
  protected Tomate(String nombre, int superfice, int volumen) {
// Construtor heredado de la clase PlantaFruto
    super(nombre, superfice, volumen);
// Atributo de instancia del tipo enum heredado de la clase Planta 
    especie = Especie.TOMATE;
// Atributo de instancia del tipo colección implementando por la clase HashSet
    incompatibles.add(Especie.HINOJO);
    compatibles.add(Especie.LECHUGA);
    compatibles.add(Especie.PEREJIL);
    compatibles.add(Especie.ZANAHORIAS);
  }

}
