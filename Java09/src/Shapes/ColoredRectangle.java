package Shapes;

public class ColoredRectangle extends Rectangle {
	
	String color;
	
	public ColoredRectangle(int x, int y, int w, int h, String color) {
		super(x, y, w, h);  ////��ӹ޾����ϱ� �� ��  souce - using field
		System.out.println("ColoredRectangle(,,,,)==============");
		this.color = color;
	}



	public static void main(String[] args) {
		ColoredRectangle color = new ColoredRectangle(10, 20, 20, 20, "red");
		System.out.println(color.calsArea());
	}
}


//�ܼ�
//shape(x,y)============                -->super�� ������ ����Ͽ� ������ü�� �ҷ������Ƿ� �������� ����
//Rectangle(x,y)===========			-->????? �̰͵鵵 �ٽ��غ���..
//ColoredRectangle(,,,,)==============
//400.0
//
//�׷�new �ڿ��ִ� 10.,0.. �̷������ ��� ���� �� �־�?