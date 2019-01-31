import java.util.Scanner;

public class Practice_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("궁금한해를 입력하세요:");
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			System.out.println("윤년입니다!");
		}
		else {
			System.out.println("윤년ㄴㄴ");
		}
	}

}
