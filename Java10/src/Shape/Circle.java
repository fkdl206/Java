package Shape;

public class Circle extends Shape {
	
	private int radius=2;
	
	@Override
	public void draw() {
		System.out.println("���׸��� �޼ҵ�");
	}
	
	@Override
	public void M() {
		System.out.println(3.14*radius*radius );
	}

}
