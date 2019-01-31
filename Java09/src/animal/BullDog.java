package animal;

public class BullDog extends Dog {

	int eatAmount;
	int tailLength;
	
	public BullDog(int size, String color, int legs, int foodPrice, int eatAmount, int tailLength) {
		super(size, color, legs, foodPrice);
		this.eatAmount = eatAmount;
		this.tailLength = tailLength;
	}
	
	public static void main(String[] args) {
		BullDog bull = new BullDog(10,"red",10,20,30,10);
	}
	}
