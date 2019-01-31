import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MessengerA extends JFrame implements ActionListener{
	
	
	textArea.appent("SENT: " + s+ "\n");
	
	public static void main(String[] args) {
		MessengerA a = new MessengerA();
		a.process();
	}
}



//process method, actionperform, 네트워크 통신 socket, 채팅프로그램 만들기, UDP통신, 포트
//UDP통신과 TCP통신이 있는데 TCP는 포트를 달라고 요청, UDP통신은 둘다 포트가 있어야 한다
//UDP DatagramPacket이라는 객체가 양쪽에 만들어 있어야 한다.
//TCP는 요청을 받아들어서 처리하는 ServerSocket()이라는 메서드가 필요, ServerSocket은 accept를 호출해 주어야 한다
//포트와 소켓은 같은것인가?, 전송할때는 패킷단위로 전송된다고 하는데 무슨말이지?
// catch문에서 e.printStackTrace 
// MessengerA와 B생성자에는 throws IOEception넣어주기 --> 아직도 예외처리를 해야하는 경우를 잘 모르겠음