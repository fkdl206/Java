import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //sc�� ������ ����
		System.out.print("�� �޾ҳ���:"); 
		int input_1 = sc.nextInt();
		final int TARGET  =1000;                  
		
		//final ������ �ٲܼ��� ����!!  �ƿ��ȹٲܰ� �����͵��� final�̶� ǥ��
		//���� �ڹٿ��� final �����Ŵ� ���� �ƿ��빮�ڷ� ��!
		
		if(input_1 > TARGET) {         
			System.out.println("�����޼�");
			System.out.println("����� ���ʽ���" + (int)(input_1*0.1) + "�Դϴ�^^");
			// ���θ� �Ⱦ��� ����� �ȵ� ���ʸ� �����̵Ǿ
		
		}
		else {
			System.out.print("��� ������...");
		}

	}

}
