package conceptos.clases.internas;

/**
 * 
 * @author RVS
 * @time 3 may 2022 - 18:22:40
 *
 */
public class ClaseInterna {

	public static void main(String[] args) {

		ClaseInterna valor1 = new ClaseInterna();
		String valores = valor1.new Interna(5, 10).toString();
		System.out.println(valores);

	}

	/**
	 * 
	 * @author RVS
	 * @time 3 may 2022 - 18:22:37
	 *
	 */
	public class Interna {

		int x;
		int y;

		public Interna() {
			this.x = 0;
			this.y = 0;
		}

		public Interna(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public void setX(int x) {
			this.x = x;
		}

		public void setY(int y) {
			this.y = y;
		}

		@Override
		public String toString() {
			return "Valor x : " + getX() + " Valor y :  " + getY();
		}

	}
}
