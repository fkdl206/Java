package Building;

public class RedBuilding extends Building {

	public String color="red";
	public int floor=4;
	
	public RedBuilding() {}
	
	public static void main(String[] args) {
		RedBuilding r = new RedBuilding();
		System.out.println(r.location);
		System.out.println(r.floor);
	}

}
