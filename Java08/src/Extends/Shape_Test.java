package Extends;

public class Shape_Test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Shape s= new Shape();
		
		r.width=100;        //�����ϴ���???�� ... �̰Ŵٽð���
//		s.x=100;
		
		s.print();
		r.area();
		r.draw();
		
	}

}
