package Car;

public class Car_Use {
	public static void main(String[] args) {
		Car c1 = new Car("s600","white",80);
		Car c2 = new Car("e500","blue",100);
		
		int n = Car.numbers;
		System.out.println("지금까지 생성된 자동차 수는?: "+n +"대입니당");
		
		//static으로 만든거는 class명으로 접근할 수 있다
		
		System.out.println(Car.numbers);  //일케! 객체 생성과 상관이 없어서 가능
	}
}
