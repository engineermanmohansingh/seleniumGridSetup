package selenium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class seleniumStart {
	
	
	static  String new_dir="C:";
	  protected	static String hubAddress = null;
	  protected static String hubPort = "4444";
	  
public static void main(String... args){
startSeleniumServer();
startSeleniumNode(hubAddress, "5555");
System.out.print("Completed grid setup !");


}

public static void startSeleniumServer() {
	System.out.println("---- Starting selenium server ----");
	InetAddress IP;
	try {
		IP = InetAddress.getLocalHost();
		hubAddress = IP.getHostAddress();
		System.out.println("hub Address  is := "+ hubAddress+":"+hubPort);
	} catch (UnknownHostException e2) {

		e2.printStackTrace();
	}
	
	
	Process p;
	 String command = "cmd  /c start C:\\selenium\\server.bat";//for linux use .sh
		try {
			 p = Runtime.getRuntime().exec(command);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("Grid launched !");

}

public static void startSeleniumNode(String nodeIP,String nodePort){
	System.out.println("---- Registering selenium node "+nodeIP+" to hub:"+hubAddress+" ----");
	 String command = "cmd  /c start  java -Dwebdriver.chrome.driver=C:\\selenium\\chromedriver.exe -jar C:\\selenium\\selenium-server-standalone-2.52.0.jar -role webdriver -hub http://"+hubAddress+"/:"+hubPort+"/grid/register -port "+nodePort;
		System.out.println(command);
	 Process p = null; 
	
		try {
			p = Runtime.getRuntime().exec(command);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	System.out.println("Node"+nodeIP+" registered to "+hubAddress+"at port number:-"+nodePort);

}
}
