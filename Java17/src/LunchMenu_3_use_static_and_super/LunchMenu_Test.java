package LunchMenu_3_use_static_and_super;

public class LunchMenu_Test {
	public static void main(String[] args) {
		Child1 c1 = new Child1(Price.rice, Price.bulgogi, Price.banana, Price.milk,Price.amond);
		System.out.println(c1.amount());
		
		
//		Child1 c2;
//		c2 = new Child1(Price.rice, Price.bulgogi, Price.banana);
//		System.out.println(c2.rice+c2.bulgogi+c2.banana);
	
	}
}
