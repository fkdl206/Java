package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.imageio.stream.FileImageInputStream;

public class Practice3 {

	public static void main(String[] args) throws IOException {
		FileImageInputStream input = new FileImageInputStream("http://news.naver.com/main/read.nhn?mode=LSD&mid=sec&sid1=004&oid=346&aid=0000014573");
		FileOutputStream output = new FileOutputStream("C:\\Temp\\naver.jpg");
		int in = 0;
		
		while((in = input.read()) !=-1) {
			output.write(in);
		}
	}
}
