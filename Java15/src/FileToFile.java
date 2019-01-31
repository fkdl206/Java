import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
// 파일에 있는 것을 다른 파일로 넣기

public class FileToFile {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("FileOutput.txt");											//보통 프로젝트 바로 아래에 저장!
		FileOutputStream output = new FileOutputStream("FileOutputResult.txt");	
		int in = 0;																
		
		while((in = input.read())!=-1) {
			output.write(in);
		}

	}

}