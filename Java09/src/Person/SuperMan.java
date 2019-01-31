package Person;

public class SuperMan extends Man{
	String fly;

	public SuperMan(String fly, String work) {
		super(work);
		this.fly = fly;
	}

	public static void main(String[] args) {
		SuperMan sMan1 = new SuperMan();			//Q.돌아갈까? A.네 왜냐면 상위클래스의 기본생성자 호출되기 때문
		SuperMan sMan2 = new SuperMan("태평양","프로그래머");   //
	}
}
