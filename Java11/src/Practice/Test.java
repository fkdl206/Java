package Practice;

public class Test {

	public static void main(String[] args) {
		Manager m1 = new Manager("�Ǻ���", "street 5", 15000);
		System.out.println("ġŲ�̸�: "+m1.name + "������: "+ m1.location+"����: " + m1.price);
		System.out.println("���� ����: "+m1.count);
		
		Manager m2 = new Manager("ȣ����", "street 8", 8500);
		System.out.println("ġŲ�̸�: "+m2.name + "������: "+ m2.location+"����: " + m2.price);
		System.out.println("���� ����: "+m2.count);
		
	}

}
