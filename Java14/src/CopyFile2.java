import java.io.*;
public class CopyFile2 {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;		// null�� �� ����� ��, �� �ܿ�
		FileOutputStream out = null;		// �׸��� try �ȿ��� �̰ɸ���� ���������� try �ȿ����� ���Ǵϱ� ����ٰ� �ؾ���
		
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output2.txt");	
			
			int c;
			while((c=in.read())!=-1) {		//?? 
				out.write(c);
			}
			
		}  finally {					//�ܺ� �ڿ��� �����ٰ� ���ٰ� �������� �� �־ try-catch�� ��! ���������... ������
			if(in != null) {			//�׷��� �������ϱ� ���� throws�� �Ἥ ������ �ٵ� ���� throws�� ������ �� �𸣰��� �����ϱ�
				in.close();
			}
			if(out != null) {
				out.close();	
			}
		}
	}
}
