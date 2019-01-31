package LunchMenu;

public class LunchMenu_Test {
	public static void main(String[] args) {
		LunchMenu a = new LunchMenu();
		Child_1 c1 = new Child_1();
		System.out.println("child_1 Àº");
		a.a();
		c1.banana();
		c1.milk();
		c1.amond();
		
		Child_2 c2 = new Child_2();
		System.out.println("child_2 Àº");
		a.a();
		c2.banana();
		c2.milk();
		c2.amond();
	}
}
