import java.io.PrintWriter;
import java.io.IOExpection;

public class ThrowsException {

	public static void main(String[] args) {
		try {
			write();
		} catch (IOException e) {
			System.out.println("에러발생....!!");
		}
	}
	
	public static void write() throws IOException {
		PrintWriter p = new PrintWriter("out.txt")
		System.out.println("나는 ...........?");
	}

}
