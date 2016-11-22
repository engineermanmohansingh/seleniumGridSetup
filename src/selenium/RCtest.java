package selenium;

import static org.junit.Assert.*;

import org.junit.Test;

public class RCtest {
	@Test
	  public void testSendCommand()
	  {
	     System.out.println("sendCommand");

	     /**
	      * YOU MUST CHANGE THE FOLLOWING
	      * FILE_NAME: A FILE IN THE DIRECTORY
	      * USER: LOGIN USER NAME
	      * PASSWORD: PASSWORD FOR THAT USER
	      * HOST: IP ADDRESS OF THE SSH SERVER
	     **/
	     String command = "cmd";
	     String userName = "qaadmin";
	     String password = "qaadmin";
	     String connectionIP = "randomIPAddress";
	     sshManager instance = new sshManager(userName, password, connectionIP, "");
	     String errorMessage = instance.connect();

	     if(errorMessage != null)
	     {
	        System.out.println(errorMessage);
	        fail();
	     }

	     String expResult = "FILE_NAME\n";
	     // call sendCommand for each command and the output 
	     //(without prompts) is returned
	     String result = instance.sendCommand(command);
	     // close only after all commands are sent
	     instance.close();
	     assertEquals(expResult, result);
	  }
}
