package Practice;

public class Manager extends Chicken {

	static int count;
	
	public Manager(String name, String location, int price) {
		super(name, location, price);
		count++;
	}
	

	@Override
	public int countPrice() {
		return price;
	}
	
	@Override
	public int countLocation() {
		return count;
	}

}
