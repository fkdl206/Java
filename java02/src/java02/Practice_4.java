package java02;
import java.util.Scanner; 

public class Practice_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First number : ");
		int n1 = sc.nextInt();
		System.out.println("Second number : ");
		int n2 = sc.nextInt();
		
		if((n1>0)&&(n2>0)) {
			System.out.println("두수는 양수임");
		}
		else {
			System.out.println("양수가 아님");
		}
	
	}

}
