package Abstract;

public abstract class Pencil {

	String name;
	int price;
	
	public Pencil() {
		
	}
	
	public Pencil(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	abstract void getPencil();
	
}
