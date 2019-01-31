package Practice;

import java.io.*;

public class Practice2 {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("C:\\Program Files\\Java\\me.txt");
		FileOutputStream output = new FileOutputStream("meInfo.txt");
		int in = 0;
		
		while((in=input.read()) !=-1) {
			output.write(in);
		}
	}
}
