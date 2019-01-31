import java.io.*;
public class ContoCon {
// 콘솔에 적은것을 콘솔에 나타내게하기
	public static void main(String[] args) throws IOException {
		InputStream input = System.in;
		OutputStream output = System.out;
		int in = 0;
		
		while((in = input.read())!=-1) {
			output.write(in);
		}

	}

}