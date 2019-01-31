package Practice2;

public class Car implements Speaker, Fire {

	public Car() {}

	@Override
	public void water() {
		System.out.println("¹° ÄåÄå");
	}

	@Override
	public void fireStop() {
		System.out.println("ºÒ ¸ØÃã");
	}

	@Override
	public void soundUp() {
		System.out.println("º¼·ı¾÷");
	}

	@Override
	public void soundDown() {
		System.out.println("º¼·ı´Ù¿î");
	}

	
	public static void main(String[] args) {
		Car car = new Car();
		car.water();
		car.fireStop();
		car.soundUp();
		car.soundDown();
		
	}
}
