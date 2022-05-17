package huerto.macetas;

/**
 *
 */
import huerto.enums.FormaMaceta;

/**
 * Clase Concreta hereda los atributo y metodos de la Clase Padre Maceta
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
   * Constructor parametrizado
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
  @Override
  public FormaMaceta getForma() {
    return FormaMaceta.RECTANGULAR;

  }
}
