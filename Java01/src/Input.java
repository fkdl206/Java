import java.util.Scanner;  //Scanner�� Ŭ����, java..�̷��� �� ���

public class Input {
	
	public static void main(String[] args) {
		//�μ��� �Է¹޾�, ��!
		Scanner sc = new Scanner(System.in); //���� ���� �տ� �ڷ��� ���ֵ��� ���� ����� ���� ������ Scanner�� �� ��
		System.out.println("ù�� ° ��: ");
		int n1 = sc.nextInt();
		System.out.println("�ι� ° ��: ");
		int n2 = sc.nextInt();
		int sum = n1+ n2;
		System.out.println(sum);
	}
}
