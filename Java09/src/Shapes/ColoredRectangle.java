package Shapes;

public class ColoredRectangle extends Rectangle {
	
	String color;
	
	public ColoredRectangle(int x, int y, int w, int h, String color) {
		super(x, y, w, h);  ////상속받았으니깐 다 됨  souce - using field
		System.out.println("ColoredRectangle(,,,,)==============");
		this.color = color;
	}



	public static void main(String[] args) {
		ColoredRectangle color = new ColoredRectangle(10, 20, 20, 20, "red");
		System.out.println(color.calsArea());
	}
}


//콘솔
//shape(x,y)============                -->super로 지속적 사용하여 상위객체를 불러줬으므로 마지막에 나옴
//Rectangle(x,y)===========			-->????? 이것들도 다시해보기..
//ColoredRectangle(,,,,)==============
//400.0
//
//그럼new 뒤에있는 10.,0.. 이런얘들은 어떻게 넣을 수 있어?