package Practice;

public abstract class Chicken {

	String name;
	String location;
	int price;
	
	
	public Chicken(String name, String location, int price) {
		super();
		this.name = name;
		this.location = location;
		this.price = price;
	}
	
	public abstract int countPrice();
	public abstract int countLocation();
	
	

}
