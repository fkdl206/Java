import java.io.*;
public class ContoCon {
// �ֿܼ� �������� �ֿܼ� ��Ÿ�����ϱ�
	public static void main(String[] args) throws IOException {
		InputStream input = System.in;
		OutputStream output = System.out;
		int in = 0;
		
		while((in = input.read())!=-1) {
			output.write(in);
		}

	}

}