import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
// 콘솔에 있는 것을 파일에 저장하는 방법

public class FileToCon {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("FileOutput.txt");											//보통 프로젝트 바로 아래에 저장!
		OutputStream output = System.out;		
//		FileOutputStream output = new FileOutputStream("C:\\Temp\\FileOutput2.txt");  // 경로지정하려면 이렇게!
		int in = 0;																
		
		while((in = input.read())!=-1) {
			output.write(in);
		}

	}

}