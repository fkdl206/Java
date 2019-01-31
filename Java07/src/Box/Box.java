package Box;

public class Box {
	private int width;
	private int length;
	private int height;
	private int volume;
	
	public Box() {
		
	}

	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public int getVolume() {
		volume = width*length*height;
		return volume;   //return 문은 프린트문이 아님!! 그냥 return 값임
		//아님 여기에다 print문을 넣으면 
	}
	
}
