package Lunch;

public abstract class Lunch {

	int rice=1000; 
	int bulgogi=1000 ;
	int banana=1000;
	int milk=1000;
	int almond=1000;
	
	public Lunch() {}
	public Lunch(int rice, int bulgogi, int banana, int milk, int almond) {
		this.rice=rice;
		this.bulgogi=bulgogi;
		this.banana=banana;
		this.milk=milk;
		this.almond=almond;
	}
	
	abstract void Menu();
	//public abstract int Menu(); --> 이것도 가능
	

}
