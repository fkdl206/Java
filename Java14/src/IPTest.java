import java.net.*;
import java.io.*;

public class IPTest {


	public static void main(String[] args) {
		String hostname = "www.daum.com";
	
		try {
			InetAddress address = InetAddress.getByName(hostname);
			System.out.println("IP�ּ�: " + address.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(hostname + "�� IP�ּҸ� ã�� �� �����ϴ�");
		}
	}
}
