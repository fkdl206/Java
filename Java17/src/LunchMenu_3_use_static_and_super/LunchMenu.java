package LunchMenu_3_use_static_and_super;

public abstract class LunchMenu {
	public int rice;
	public int bulgogi;
	public int banana;
	public int milk;
	public int amond;
	
	public LunchMenu() {}

	public LunchMenu(int rice,int bulgogi, int banana, int milk, int amond) {
		this.rice = rice;
		this.bulgogi = bulgogi;
		this.banana = banana;
		this.milk = milk;
		this.amond = amond;
		
		}
	
	abstract int amount(); {}
}
