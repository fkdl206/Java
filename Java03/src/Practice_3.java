//다시해볼것!


import java.util.Scanner;

public class Practice_3 {
	public static void main(String[] args) {
		System.out.println("월을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		if((month>=3) && (month<=5)) {
			System.out.println("봄");
		}
		else if((month>=6) && (month<=8)) {
			System.out.println("여름");
		}
		else if((month>=9) && (month<=11)) {
			System.out.println("가을");
		}
		else{
			System.out.println("겨울");
		}
	}
}
