import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
// �ֿܼ� �ִ� ���� ���Ͽ� �����ϴ� ���

public class ContoFile {

	public static void main(String[] args) throws IOException {
		InputStream input = System.in;											//���� ������Ʈ �ٷ� �Ʒ��� ����!
		FileOutputStream output = new FileOutputStream("FileOutput.txt");		// ���������ϱ�! �� �� F5������ ��
//		FileOutputStream output = new FileOutputStream("C:\\Temp\\FileOutput2.txt");  // ��������Ϸ��� �̷���!
		int in = 0;																
		
		while((in = input.read())!=-1) {
			output.write(in);
		}

	}

}