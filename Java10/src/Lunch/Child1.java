package Lunch;

public class Child1 extends Lunch {
	
	
	public Child1() {}

	
	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {
		super(rice, bulgogi, banana, milk, almond);
	}
	
	@Override
	void Menu() {
		System.out.println(rice+bulgogi+banana);
	}
	
//	@Override
//	public int Menu() {
//		return rice + bulgogi + banana;
//	}

}
