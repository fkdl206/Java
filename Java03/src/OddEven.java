import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //sc�� ������ ����
		System.out.print("�Է��Ͻÿ�:");
		int input = sc.nextInt();
		if(input % 2 == 0) {
			System.out.println("¦����");
		}
		else {
			System.out.println("0�̰ų�, Ȧ����");
		}
		System.out.println("���α׷�����!");
	}

}
