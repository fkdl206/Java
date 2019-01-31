package StatCar;

public class StatCar_Test {
	
	public static void main(String[] args) {

		StarCarLowGrade s1 = new StarCarLowGrade(StatCarValue.color_1,StatCarValue.tire_1,StatCarValue.displacement_1,StatCarValue.heandle);
		System.out.println("color"+s1.color);
		System.out.println("tire"+s1.tire);
		System.out.println("displacement"+s1.displacement);
		System.out.println("heandle"+s1.heandle);
		
		if (s1.displacement > 2000) {
			System.out.println("tax : 1000");
		}
		
		s1.getSpec();
		
		StarCarHighGrade s2 = new StarCarHighGrade(StatCarValue.color_2,StatCarValue.tire_2,StatCarValue.displacement_2,StatCarValue.heandle);
		System.out.println("color"+s2.color);
		System.out.println("tire"+s2.tire);
		System.out.println("displacement"+s2.displacement);
		System.out.println("heandle"+s2.heandle);
		
		if (s2.displacement > 2000) {
			System.out.println("tax : 1000");
			
		s2.getSpec();
		}
	}	

}
