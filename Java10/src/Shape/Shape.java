package Shape;

public abstract class Shape {
	private int x, y;
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		}
	
	public abstract void draw();	
	public abstract void M();	
	

}

