package EmployeeTest;

public class EmployeeTest {
	String name;
	int money;
	static int num;
	
	public EmployeeTest(String name, int money) {
		this.name = name;
		this.money = money;
		++num;
	}

	public static int getCount() {
		return num;		
	}
}
