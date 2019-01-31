package LunchMenu_2;

public class LunchMenu_Test {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		System.out.println("c1의 식대는 : "+c1.amount());
		
		Child2 c2 = new Child2();
		System.out.println("c2의 식대는 : "+c2.amount());
	}
}
