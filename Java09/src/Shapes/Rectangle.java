package Shapes;

public class Rectangle extends Shapee{

	private int w;
	private int h;
	
	public Rectangle(int x, int y, int w, int h) {    //ªÛº”πﬁæ“¿∏¥œ±Ò ¥Ÿ µ   souce - using field
		super(x, y);
		System.out.println("Rectangle(x,y)===========");
		this.w = w;
		this.h = h;
	}
	
	double calsArea() {
		return w*h;
	}
	

}
