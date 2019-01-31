package LunchMenu_3_use_static_and_super;

public class Child1 extends LunchMenu {

	public Child1() {}
	
	public Child1(int rice,int bulgogi, int banana, int milk, int amond) {
		super(rice,bulgogi,banana,milk,amond); 
		}

	@Override
	int amount() {
		return rice+bulgogi+banana;
	}

}
