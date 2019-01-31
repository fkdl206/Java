package Parent;

public class Child extends Parent {

	@Override
	public void print() {
		super.print();
		System.out.println("자식 클래스의 print() 메소드");
	}
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
	}
}
 
