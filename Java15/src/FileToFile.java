import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
// ���Ͽ� �ִ� ���� �ٸ� ���Ϸ� �ֱ�

public class FileToFile {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("FileOutput.txt");											//���� ������Ʈ �ٷ� �Ʒ��� ����!
		FileOutputStream output = new FileOutputStream("FileOutputResult.txt");	
		int in = 0;																
		
		while((in = input.read())!=-1) {
			output.write(in);
		}

	}

}