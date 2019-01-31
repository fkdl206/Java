import java.util.Scanner;

public class Practice_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("먹고싶은 것 입력:");
		String i = sc.next();
		
		switch(i) {
		case "분식":
			System.out.println("분식집으로");
			break;
		case "한식":
			System.out.println("한식집으로");
			break;
		case "일식":
			System.out.println("일식집으로");
			break;
		default:
			System.out.println("걍 집으로ㄱㄱ");
			break;
		}
		

	}

}
