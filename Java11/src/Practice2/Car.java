package Practice2;

public class Car implements Speaker, Fire {

	public Car() {}

	@Override
	public void water() {
		System.out.println("�� ����");
	}

	@Override
	public void fireStop() {
		System.out.println("�� ����");
	}

	@Override
	public void soundUp() {
		System.out.println("������");
	}

	@Override
	public void soundDown() {
		System.out.println("�����ٿ�");
	}

	
	public static void main(String[] args) {
		Car car = new Car();
		car.water();
		car.fireStop();
		car.soundUp();
		car.soundDown();
		
	}
}
