import java.net.*;
import java.io.*;

public class IPTest {


	public static void main(String[] args) {
		String hostname = "www.daum.com";
	
		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP주소: " + address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(hostname + "의 IP주소를 찾을 수 없습니다");
		}
	}
}
