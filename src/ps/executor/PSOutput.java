package ps.executor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PSOutput {
	
	public static void getPsOutput(Process process) throws IOException {
		String line;
		System.out.println("PowerShell Output:");
		BufferedReader stdout = new BufferedReader(new InputStreamReader(process.getInputStream()));
		while ((line = stdout.readLine()) != null) {
			System.out.println(line);
		}
		stdout.close();
	}

}
