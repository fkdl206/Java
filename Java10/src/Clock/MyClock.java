package Clock;

public class MyClock extends MyTableClock {

	public static void main(String[] args) {
		MyTableClock c1 = new MyTableClock(5000, "korea", "blue", 5);
		System.out.println("�ð��� ���� : " +c1.color);
		System.out.println("�ð谡 ������� ����� : " +c1.nation);
		System.out.println("�ð��� ������ : " +c1.price);
		System.out.println("�ð��� �˶��ð��� : " +c1.alarm);
		
	}
	
	
	
}
