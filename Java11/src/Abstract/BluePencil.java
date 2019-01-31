package Abstract;

public class BluePencil extends Pencil {

	String owner;
	
	public BluePencil(String name, int price, String owner) {
		super(name, price);
		this.owner = owner;
	}

	@Override
	void getPencil() {
		System.out.println(name + ","+ price + "," + owner);
	}

}
