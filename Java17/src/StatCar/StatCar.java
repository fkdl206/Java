package StatCar;

public abstract class StatCar {
	public String color;
	public String tire;
	public int displacement;
	public String heandle;
	
	public StatCar() {}
	
	public StatCar(String color, String tire, int dispalcement, String heandle) {
		this.color = color;
		this.tire = tire;
		this.displacement = dispalcement;
		this.heandle = heandle;
	}
	
	public abstract void getSpec(); {}
	
}
