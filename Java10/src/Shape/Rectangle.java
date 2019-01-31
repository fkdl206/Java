package Shape;

public class Rectangle extends Shape {
	
	private int width=3, height=6; 
	
	@Override
	public void draw() {
		System.out.println("사각형 그리기 메소드");
	}
	
	@Override
	public void M() {
		System.out.println(width*height);
	}

}
