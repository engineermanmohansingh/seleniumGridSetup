package networking;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class basics {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
URL url = new URL("http://www.google.com");
InputStream stream = url.openStream();
BufferedInputStream buf = new BufferedInputStream(stream);

StringBuilder sb = new StringBuilder();

while(true){
int data = buf.read();

if(data == -1){
			break;
}
else{
			sb.append((char)data);
}
}
System.out.println(sb);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
