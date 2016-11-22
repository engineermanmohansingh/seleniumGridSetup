package selenium;

import java.io.IOException;

public class launchServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String command = "cmd  /c start C:\\selenium\\server.bat";//for linux use .sh
		try {
			Process child = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("Launched!");
	}

}
