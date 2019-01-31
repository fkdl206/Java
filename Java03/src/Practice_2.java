import java.util.Scanner;
public class Practice_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int like = sc.nextInt();
		
		switch(like) {
		case 1:
			System.out.println("Â«»Í");
			break;
		case 2:
			System.out.println("Â¥Àå¸é");
			break;
		case 3:
			System.out.println("¿ìµ¿");
			break;
		default: 
			System.out.println("¾È¸Ô¾î¿è");
			break;
		}

	}

}
