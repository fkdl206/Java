import java.util.Scanner;

public class Practice_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�԰���� �� �Է�:");
		String i = sc.next();
		
		switch(i) {
		case "�н�":
			System.out.println("�н�������");
			break;
		case "�ѽ�":
			System.out.println("�ѽ�������");
			break;
		case "�Ͻ�":
			System.out.println("�Ͻ�������");
			break;
		default:
			System.out.println("�� �����Τ���");
			break;
		}
		

	}

}
