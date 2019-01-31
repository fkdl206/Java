import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream in = null;		// null을 꼭 써야지 됨, 걍 외워
		FileOutputStream out = null;		// 그리고 try 안에다 이걸만들면 지역변수로 try 안에서만 사용되니깐 여기다가 해야함
		
		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output2.txt");	
			
			int c;
			while((c=in.read())!=-1) {
				out.write(c);
			}
			
		}  finally {					//외부 자원을 가져다가 쓰다가 에러생길 수 있어서 try-catch로 또! 묶어줘야함... 귀차나
			if(in != null) {
				in.close();
			}
			if(out != null) {
				out.close();	
			}
		}
	}
}
