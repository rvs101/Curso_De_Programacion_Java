package conceptos.modificadores;

/**
 * 
 * @author RVS
 * @time 4 may 2022 - 11:52:11
 *
 */
public class ModificadorPublico {

	/**
	 * Clase Pública para que puedan acceder a ella desde fuera del
	 * "package/paquete" principal
	 * 
	 */
	public class Ejemplo {

		/**
		 * Variables de Instancia - Evitar siempre hacerlas public siempre "private"
		 */
		public int x;

		/**
		 * Variables de Instancia - Evitar siempre hacerlas public siempre "private"
		 */
		public int y;

		/**
		 * Constructor publico
		 * 
		 * Para que puedan instanciar objetos desde la misma clase u otra clase que la
		 * herede o la invoque mediante la importanción
		 * 
		 */
		public Ejemplo() {
			this.x = 0;
			this.y = 0;
		}

		/**
		 * Constructor publico parametrizado
		 * 
		 * Para que puedan instanciar objetos desde la misma clase u otra clase que la
		 * herede o la invoque mediante la importanción
		 * 
		 * @param x
		 * @param y
		 */
		public Ejemplo(int x, int y) {
			this.x = x;
			this.y = y;
		}

		/**
		 * Procedimiento de Instancia
		 * 
		 * Modificador public
		 * 
		 * Para que se pueda usar en cualquier objeto que se instancie su propia clase
		 * 
		 * Permite modificar el valor de las variables de instancia mediante metodos
		 * público y así proteger las modificaciones erróneas y respetando el principio
		 * de Encapsulamiento
		 * 
		 * 
		 * @param x
		 */
		public void setX(int x) {
			this.x = x;
		}

		/**
		 * Metodo de Instancia
		 * 
		 * public → para que se pueda usar en cualquier objeto que instancie su propia
		 * clase
		 * 
		 * @return - int x
		 */
		public int getX() {
			return x;
		}

		/**
		 * Procedimiento de Instancia
		 * 
		 * public → para que se pueda usar en cualquier objeto que instancie su propia
		 * clase
		 * 
		 * @param y
		 */
		public void setY(int y) {
			this.y = y;
		}

		/**
		 * Metodo de Instancia
		 * 
		 * public → para que se pueda usar en cualquier objeto que instancie su propia
		 * clase
		 * 
		 * @return y
		 */
		public int getY() {
			return y;
		}
	}

}
