package Person;

public class SuperMan extends Man{
	String fly;

	public SuperMan(String fly, String work) {
		super(work);
		this.fly = fly;
	}

	public static void main(String[] args) {
		SuperMan sMan1 = new SuperMan();			//Q.���ư���? A.�� �ֳĸ� ����Ŭ������ �⺻������ ȣ��Ǳ� ����
		SuperMan sMan2 = new SuperMan("�����","���α׷���");   //
	}
}
