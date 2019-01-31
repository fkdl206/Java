package java02;
import java.util.Scanner;  //Scanner만 클래스, java..이런건 걍 경로

public class Input {
	
	public static void main(String[] args) {
		//두수를 입력받아, 합!
		Scanner sc = new Scanner(System.in); //원래 변수 앞에 자료형 써주듯이 원본 써야함 따라서 원본인 Scanner를 쓸 것
//		System.out.println("첫번 째 수: ");
//		int n1 = sc.nextInt();
//		System.out.println("두번 째 수: ");
//		int n2 = sc.nextInt();
//		int sum = n1+ n2;
//		System.out.println(sum);
		
		
		//막간을 이용한 String 사용법
		
		String s = "My Id";
		System.out.println(s);
		
		s = sc.next(); //
		System.out.println(s);
		
	}
}
