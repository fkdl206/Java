package java02;

public class Practice_2 {

	public static void main(String[] args) {
		int x = 100;
		byte y = 0;
		
//		//First 
//		y = x;
//		System.out.println(y);    //Error
		
		//Second
		y =(byte)x;
		System.out.println(y);    //Success!
		
	}

}
