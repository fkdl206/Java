import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
// �ֿܼ� �ִ� ���� ���Ͽ� �����ϴ� ���

public class FileToCon {

	public static void main(String[] args) throws IOException {
		FileInputStream input = new FileInputStream("FileOutput.txt");											//���� ������Ʈ �ٷ� �Ʒ��� ����!
		OutputStream output = System.out;		
//		FileOutputStream output = new FileOutputStream("C:\\Temp\\FileOutput2.txt");  // ��������Ϸ��� �̷���!
		int in = 0;																
		
		while((in = input.read())!=-1) {
			output.write(in);
		}

	}

}