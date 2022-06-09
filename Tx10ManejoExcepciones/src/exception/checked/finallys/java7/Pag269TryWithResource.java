package exception.checked.finallys.java7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Pag269TryWithResource {

	public void LanzarTryWithResource() {

		try (BufferedReader br = new BufferedReader(new FileReader(""))) {
	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
