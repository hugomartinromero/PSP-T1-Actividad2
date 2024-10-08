package actividad2;

import java.io.IOException;

public class Actividad2 {

	public static void main(String[] args) {

		try {
			ProcessBuilder pb = new ProcessBuilder(args);
			
			Process p = pb.start();

			System.out.println(p.exitValue());
			
		} catch (IOException e) {
			System.err.println("ERROR: de Entrada/Salida al ejecutar el comando.");
			e.printStackTrace();
		}
	}
}
