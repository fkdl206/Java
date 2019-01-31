import java.util.Scanner;

public class Practice_7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요:");
		int go = sc.nextInt();
		int i = 1;
		
		while(i<10) {
			System.out.println(go*i);
			i++;
			}

	}

}
