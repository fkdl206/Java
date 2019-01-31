import java.util.Scanner;

public class BigSmall {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //sc는 참조형 변수
		System.out.print("두수를 입력하시오:"); //넣어도됨
		int input_1 = sc.nextInt();
		int input_2 = sc.nextInt();
		int imsi = 0;
		                                    //임시변수 선언! 꼭필요하지
		if(input_1 > input_2) {
			imsi = input_1;                     //임시변수에 넣어서 반복을 줄이기!
			System.out.println("");
		}
		else {
			imsi = input_2;
		}
		System.out.print(imsi+ "이 더 크다");
	}

}
