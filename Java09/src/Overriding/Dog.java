package Overriding;

public class Dog extends Animal {
	//�������̵�
	@Override
	public void eat() {
		System.out.println("�����");      
	}
	
	
	//�����ε�
	public void eat(String name, int price) {
		System.out.println("���� ���� ������:"+name+"�̰�, ������: "+price);
	}
	
}
