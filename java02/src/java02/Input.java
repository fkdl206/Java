package java02;
import java.util.Scanner;  //Scanner�� Ŭ����, java..�̷��� �� ���

public class Input {
	
	public static void main(String[] args) {
		//�μ��� �Է¹޾�, ��!
		Scanner sc = new Scanner(System.in); //���� ���� �տ� �ڷ��� ���ֵ��� ���� ����� ���� ������ Scanner�� �� ��
//		System.out.println("ù�� ° ��: ");
//		int n1 = sc.nextInt();
//		System.out.println("�ι� ° ��: ");
//		int n2 = sc.nextInt();
//		int sum = n1+ n2;
//		System.out.println(sum);
		
		
		//������ �̿��� String ����
		
		String s = "My Id";
		System.out.println(s);
		
		s = sc.next(); //
		System.out.println(s);
		
	}
}
