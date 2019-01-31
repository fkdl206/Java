package Extends;

public class Shape_Test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Shape s= new Shape();
		
		r.width=100;        //접근하느거???헐 ... 이거다시공부
//		s.x=100;
		
		s.print();
		r.area();
		r.draw();
		
	}

}
