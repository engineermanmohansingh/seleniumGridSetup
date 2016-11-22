package apacheCommons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class fileUtilities {
public static void main(String ... args){
	File f1 = new File("loremipsum.txt");
	File f2 = new File("target.txt");
	
	try {
		FileUtils.copyFile(f1, f2);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("File Copied");
}
}
