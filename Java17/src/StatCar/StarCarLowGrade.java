package StatCar;

public class StarCarLowGrade extends StatCar {

	
	public StarCarLowGrade() {}
	
	public StarCarLowGrade(String color, String tire, int dispalcement, String heandle) {
		super(color, tire, dispalcement, heandle);
	}

	@Override
	public void getSpec() {
		System.out.println("**************************");
	}

}
