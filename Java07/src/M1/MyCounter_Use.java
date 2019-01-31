package M1;

import M1.MyCounter;

public class MyCounter_Use {
	public static void main(String[] args) {
		MyCounter my1 = new MyCounter();
		System.out.println(my1.x);
		MyCounter my2 = new MyCounter(100);
		System.out.println(my2.x);
		
	}
}
