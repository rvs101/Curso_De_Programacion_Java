package t17.ejemplos.externos.chat.gpt;

/**
 * Clase Concreta <br>
 * Se usa como Clase Generica <br>
 * 
 * @author Roboto
 *
 */
public class Product {

	/**
	 * 
	 */
	private String type;

	/**
	 * 
	 */
	private double price;

	/**
	 * 
	 * @param type
	 * @param price
	 */
	public Product(String type, double price) {
		this.type = type;
		this.price = price;
	}

	/**
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Productos { " + "type='" + type + '\'' + ", price=" + price + '}';
	}
}
