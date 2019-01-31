package StatCar;

public class StarCarHighGrade extends StatCar {

	
	public StarCarHighGrade() {}
	
	public StarCarHighGrade(String color, String tire, int dispalcement, String heandle) {
		super(color, tire, dispalcement, heandle);
	}

	@Override
	public void getSpec() {
		System.out.println("**************************");
	}
}
