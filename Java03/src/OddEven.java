import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //sc는 참조형 변수
		System.out.print("입력하시오:");
		int input = sc.nextInt();
		if(input % 2 == 0) {
			System.out.println("짝수임");
		}
		else {
			System.out.println("0이거나, 홀수임");
		}
		System.out.println("프로그램종료!");
	}

}
