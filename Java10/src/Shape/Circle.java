package Shape;

public class Circle extends Shape {
	
	private int radius=2;
	
	@Override
	public void draw() {
		System.out.println("원그리기 메소드");
	}
	
	@Override
	public void M() {
		System.out.println(3.14*radius*radius );
	}

}
