import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MessengerA extends JFrame implements ActionListener{
	
	
	textArea.appent("SENT: " + s+ "\n");
	
	public static void main(String[] args) {
		MessengerA a = new MessengerA();
		a.process();
	}
}



//process method, actionperform, ��Ʈ��ũ ��� socket, ä�����α׷� �����, UDP���, ��Ʈ
//UDP��Ű� TCP����� �ִµ� TCP�� ��Ʈ�� �޶�� ��û, UDP����� �Ѵ� ��Ʈ�� �־�� �Ѵ�
//UDP DatagramPacket�̶�� ��ü�� ���ʿ� ����� �־�� �Ѵ�.
//TCP�� ��û�� �޾Ƶ� ó���ϴ� ServerSocket()�̶�� �޼��尡 �ʿ�, ServerSocket�� accept�� ȣ���� �־�� �Ѵ�
//��Ʈ�� ������ �������ΰ�?, �����Ҷ��� ��Ŷ������ ���۵ȴٰ� �ϴµ� ����������?
// catch������ e.printStackTrace 
// MessengerA�� B�����ڿ��� throws IOEception�־��ֱ� --> ������ ����ó���� �ؾ��ϴ� ��츦 �� �𸣰���