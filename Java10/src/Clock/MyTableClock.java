package Clock;

public class MyTableClock extends TableClock{

	public int alarm;

	public MyTableClock() {}

	public MyTableClock(int price, String nation, String color, int alarm) {
		super(price, nation, color);
		this.alarm = alarm;
	}
}
