package EmployeeTest;

public class EmployeeTest_Use {
	public static void main(String[] args) {
		EmployeeTest e1,e2,e3;
		e1 = new EmployeeTest("������", 3500);
		e2 = new EmployeeTest("����", 3400);
		e3 = new EmployeeTest("����", 6700);
		
		System.out.println("������ ������=" + e3.getCount());
		System.out.println(EmployeeTest.num);
		
	}
}
