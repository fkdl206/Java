package animal;

public class Dog extends Animal{

	int legs;
	int foodPrice;
	
	public Dog(int size, String color, int legs, int foodPrice) {
		super(size, color);
		this.legs = legs;
		this.foodPrice = foodPrice;
	}
}
