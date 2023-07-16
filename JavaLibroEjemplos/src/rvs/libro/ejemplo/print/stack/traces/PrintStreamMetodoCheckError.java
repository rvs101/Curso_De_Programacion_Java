package rvs.libro.ejemplo.print.stack.traces;

import java.io.PrintStream;

/**
 * 
 * 3 jul 2023 - 18:19:37 
 *
 * @author RVS
 *
 */
public class PrintStreamMetodoCheckError {

	public static void main(String[] args) {
		
		PrintStream ps = new PrintStream(System.out);
		ps.println("Hello World!");
		if(ps.checkError()) {
			System.out.println("An error ocurred while writing to the PrintStream");
		}else {
			System.out.println("No errors ocurred while writing to the PrintStream");
		}
		
	}
}
