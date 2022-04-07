package mypackage;

import java.awt.Button;
import java.awt.Frame;

public class Principal extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor que inicializa los valores de la clase
	 */
	public Principal() {
		// creating a button
		Button b = new Button("Click Me!!");
		// setting button position on screen
		b.setBounds(30, 100, 80, 30);
		// adding button into frame
		add(b);
		// frame size 300 width and 300 height
		setSize(300, 300);
		// setting the title of Frame
		setTitle("Hello Friend con AWT");
		// no layout manager
		setLayout(null);
		// now frame will be visible, by default it is not visible
		setVisible(true);
	}

	public static void main(String args[]) {

		new Principal();
	}
}
