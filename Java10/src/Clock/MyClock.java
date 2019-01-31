package Clock;

public class MyClock extends MyTableClock {

	public static void main(String[] args) {
		MyTableClock c1 = new MyTableClock(5000, "korea", "blue", 5);
		System.out.println("시계의 색은 : " +c1.color);
		System.out.println("시계가 만들어진 나라는 : " +c1.nation);
		System.out.println("시계의 가격은 : " +c1.price);
		System.out.println("시계의 알람시간은 : " +c1.alarm);
		
	}
	
	
	
}
