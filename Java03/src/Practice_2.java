import java.util.Scanner;
public class Practice_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int like = sc.nextInt();
		
		switch(like) {
		case 1:
			System.out.println("«��");
			break;
		case 2:
			System.out.println("¥���");
			break;
		case 3:
			System.out.println("�쵿");
			break;
		default: 
			System.out.println("�ȸԾ��");
			break;
		}

	}

}
