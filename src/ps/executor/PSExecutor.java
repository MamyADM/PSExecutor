package ps.executor;

public class PSExecutor {
	
	public static void execute(String command) {
		String psPath = "C://Windows//System32//WindowsPowerShell//v1.0//powershell.exe ";
		try {
			Process psProcess = Runtime.getRuntime().exec(psPath + command);
			psProcess.getOutputStream().close();
			PSOutput.getPsOutput(psProcess);
			PSError.getPsError(psProcess);
		} catch (Exception e) {
			System.out.println("Caught exception: " + e);
		}
	}

}
