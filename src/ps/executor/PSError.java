package ps.executor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PSError {
	
	public static void getPsError(Process process) throws IOException {
		String line;
		BufferedReader stderr = new BufferedReader(new InputStreamReader(process.getErrorStream()));
		System.out.println("\n===================================\n");
		if (stderr.readLine() == null) {
			System.out.println("No error encountered");
		} else {
			System.out.println("Error found:");
			while ((line = stderr.readLine()) != null) {
				System.out.println(line);
			}
		}
		stderr.close();
	}

}
