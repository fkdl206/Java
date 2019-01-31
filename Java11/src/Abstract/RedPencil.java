package Abstract;

public class RedPencil extends Pencil {

	String color;
	
	public RedPencil(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	@Override
	void getPencil() {
		System.out.println(name + ","+ price + "," + color);
	}

}
