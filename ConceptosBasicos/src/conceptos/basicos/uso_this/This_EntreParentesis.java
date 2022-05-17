package conceptos.basicos.uso_this;

/**
 * 
 * @author RVS
 * @time 10 may 2022 - 12:49:11
 *
 */
public class This_EntreParentesis {

	/**
	 * 
	 */
	private int x;

	/**
	 * 
	 */
	private int y;

	/**
	 * 
	 */
	private String nombre;

	/**
	 * 
	 */
	public This_EntreParentesis() {
	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param nombre
	 */
	public This_EntreParentesis(int x, int y, String nombre) {
		this.x = x;
		this.y = y;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

}

/**
 * 
 * @author RVS
 * @time 10 may 2022 - 12:49:04
 *
 */
class ThisClaseSecundaria extends This_EntreParentesis {

	private double xx;
	private double yy;
	private String apellido;

	public ThisClaseSecundaria(double xx, double yy, String apellido) {
		super(new This_EntreParentesis().getX(), new This_EntreParentesis().getY(), apellido);
		this.xx = xx;
		this.yy = yy;
		this.apellido = apellido;
	}

}
