import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //sc는 참조형 변수
		System.out.print("얼마 받았나요:"); 
		int input_1 = sc.nextInt();
		final int TARGET  =1000;                  
		
		//final 넣으면 바꿀수가 없음!!  아예안바꿀것 같은것들을 final이라 표현
		//보통 자바에서 final 붙은거는 보통 아예대문자로 씀!
		
		if(input_1 > TARGET) {         
			System.out.println("실적달성");
			System.out.println("당신의 보너스는" + (int)(input_1*0.1) + "입니다^^");
			// 가로를 안쓰면 제대로 안됨 앞쪽만 인정이되어서
		
		}
		else {
			System.out.print("노노 다음달...");
		}

	}

}
