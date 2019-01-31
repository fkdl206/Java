package Building;

public class BlueBuilding extends Building {

	public String color = "blue";
	
	public BlueBuilding() {}
	
	public static void main(String[] args) {
		BlueBuilding b = new BlueBuilding();
		System.out.println(b.name);
		System.out.println(b.color);
	}
	
	

}
