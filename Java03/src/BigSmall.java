import java.util.Scanner;

public class BigSmall {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //sc�� ������ ����
		System.out.print("�μ��� �Է��Ͻÿ�:"); //�־��
		int input_1 = sc.nextInt();
		int input_2 = sc.nextInt();
		int imsi = 0;
		                                    //�ӽú��� ����! ���ʿ�����
		if(input_1 > input_2) {
			imsi = input_1;                     //�ӽú����� �־ �ݺ��� ���̱�!
			System.out.println("");
		}
		else {
			imsi = input_2;
		}
		System.out.print(imsi+ "�� �� ũ��");
	}

}
