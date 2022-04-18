package conceptos.herencia;

/**
 * Clase Main para mostrar los valores almacenados dentro de los objetos
 * 
 * @author RVS
 *
 */
public class HerenciaPadreHijaMain {

	public static void main(String[] args) {

//		Creamos un objeto Padre desde el constructor por defecto el cual tenía definidos una serie de valores básicos dentro del constructor
		Padre padreAnonimo = new Padre();
		System.out.println("• " + padreAnonimo.toString());

//		Creamos un objeto Padre desde un constructor que tiene definido una serie de parametros los cuales le darán valores que almacenara el nuevo objeto padre que vayamos a crear
		Padre padre = new Padre("David", 32, 180);
		System.out.println("•• " + padre.toString());

//		Creamos un objeto Hija desde un constructor por defecto el cual tenía definidos una serie de valores básicos dentro del constructor 
		Hija hija1 = new Hija();
		System.out.println("♦ " + hija1.toString());

//		Creamos un objeto Hija desde un constructor que tiene definidos una serie de parametros los cuales le darán valores que almacenara el nuevo objeto padre que vayamos a crear
		Hija hija2 = new Hija(56, "azules", "Madrid");
		System.out.println("♦♦ " + hija2.toString());

	}
}
