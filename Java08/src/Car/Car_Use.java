package Car;

public class Car_Use {
	public static void main(String[] args) {
		Car c1 = new Car("s600","white",80);
		Car c2 = new Car("e500","blue",100);
		
		int n = Car.numbers;
		System.out.println("���ݱ��� ������ �ڵ��� ����?: "+n +"���Դϴ�");
		
		//static���� ����Ŵ� class������ ������ �� �ִ�
		
		System.out.println(Car.numbers);  //����! ��ü ������ ����� ��� ����
	}
}
