package Practice;

public class Money_Use {
	public static void main(String[] args) {
		
		Money d1= new Money("���", 5);
		System.out.println(d1.d+"�� ���̰�"+d1.a+"���̰�, ���� ��ƿ�");
		System.out.println("�ƺ��� ��������"+ d1.money+"���� ���Ҿ��");
		Money d2= new Money("����", 7);
		System.out.println(d2.d+"�� ���̰�"+d2.a+"���̰�, ���� TV����");
		System.out.println("�ƺ��� ��������"+ d2.money+"���� ���Ҵ�");
	}
}
