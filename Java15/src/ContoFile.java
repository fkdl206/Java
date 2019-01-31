import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
// 콘솔에 있는 것을 파일에 저장하는 방법

public class ContoFile {

	public static void main(String[] args) throws IOException {
		InputStream input = System.in;											//보통 프로젝트 바로 아래에 저장!
		FileOutputStream output = new FileOutputStream("FileOutput.txt");		// 파일저장하기! 쓴 후 F5누르면 됨
//		FileOutputStream output = new FileOutputStream("C:\\Temp\\FileOutput2.txt");  // 경로지정하려면 이렇게!
		int in = 0;																
		
		while((in = input.read())!=-1) {
			output.write(in);
		}

	}

}