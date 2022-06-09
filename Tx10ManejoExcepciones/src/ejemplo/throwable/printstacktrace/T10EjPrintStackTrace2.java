package ejemplo.throwable.printstacktrace;

public class T10EjPrintStackTrace2 {

	public static void main(String[] args) {

		try {
			int i = 4 / 0;
		} catch (Throwable e) {
			e.printStackTrace();
			System.out.println("Cause : " + e.getCause()+ " | print stack trace : " + e.getMessage() + " | message ");
		}
	}
}
