//�ٽ��غ���!


import java.util.Scanner;

public class Practice_3 {
	public static void main(String[] args) {
		System.out.println("���� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		if((month>=3) && (month<=5)) {
			System.out.println("��");
		}
		else if((month>=6) && (month<=8)) {
			System.out.println("����");
		}
		else if((month>=9) && (month<=11)) {
			System.out.println("����");
		}
		else{
			System.out.println("�ܿ�");
		}
	}
}
