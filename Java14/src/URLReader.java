import java.net.*;
import java.io.*;

public class URLReader {

	public static void main(String[] args) throws Exception {
		URL site = new URL("http://www.nate.com");
		URLConnection url = site.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(url.getInputStream()));
		String inLine;
		while((inLine = in.readLine())!= null) {
			System.out.println(inLine);
		}
		
	}
}
