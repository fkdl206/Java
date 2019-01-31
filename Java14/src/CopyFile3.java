import java.io.*;


public class CopyFile3 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;		// null�� �� ����� ��, �� �ܿ�
		FileOutputStream out = null;		// �׸��� try �ȿ��� �̰ɸ���� ���������� try �ȿ����� ���Ǵϱ� ����ٰ� �ؾ���
		
		try {
			in = new FileInputStream("C:\\Users\\jongro22\\Pictures\\�ٿ�ε�.jpg");
			out = new FileOutputStream("result1.txt");	
			
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
			
		}  finally {					//�ܺ� �ڿ��� �����ٰ� ���ٰ� �������� �� �־ try-catch�� ��! ���������... ������
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();	
			}
		}
	}
}
