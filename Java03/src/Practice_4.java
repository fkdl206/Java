import java.util.Scanner;

public class Practice_4 {

	public static void main(String[] args) {
		System.out.print("첫번째 숫자를 입력하세요:");
		Scanner num1 = new Scanner(System.in);
		int n1 = num1.nextInt();
		System.out.print("두번째 숫자를 입력하세요:");
		Scanner num2 = new Scanner(System.in);
		int n2 = num2.nextInt();
		
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
	}
}
