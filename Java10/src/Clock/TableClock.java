package Clock;

public class TableClock extends Clock {

	public String color;

	public TableClock() {}
	
	public TableClock(int price, String nation, String color) {
		super(price, nation);
		this.color=color;
	}

	
}
