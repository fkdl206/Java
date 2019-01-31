package EmployeeTest;

public class EmployeeTest_Use {
	public static void main(String[] args) {
		EmployeeTest e1,e2,e3;
		e1 = new EmployeeTest("리리리", 3500);
		e2 = new EmployeeTest("라라라", 3400);
		e3 = new EmployeeTest("루루루", 6700);
		
		System.out.println("현재의 직원수=" + e3.getCount());
		System.out.println(EmployeeTest.num);
		
	}
}
