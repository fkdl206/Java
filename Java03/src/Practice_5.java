import java.util.Scanner;

public class Practice_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ñ����ظ� �Է��ϼ���:");
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			System.out.println("�����Դϴ�!");
		}
		else {
			System.out.println("���⤤��");
		}
	}

}
