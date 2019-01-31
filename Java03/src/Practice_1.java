import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int i = 0;
		int sum = 0;
		
		while(i <= number) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}

}
