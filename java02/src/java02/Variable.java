package java02;

public class Variable {

	public static void main(String[] args) {
		int i =100;
		byte b = 27;
		boolean bl = false;
		float f = 11.11f;
		double d = 22.22;
		char ch = 'a';
		
//		System.out.println("float �� :" + f);
//		System.out.println("char �� :" + ch);
		
		//���� ��-> ū������ �ֱ�
//		i = b;                    //�ڵ� ����ȯ(ĳ����)�� �� 
//		System.out.println(i);
//		//ū ��-> ���������� �ֱ�
//		b= (byte)i;               //�ڵ� ����ȯ�� �ȵ�
//		System.out.println(b);    //���� ���� ����ȯ ��
		
		i = 3/2; //����=����/���� i = 1
		//���� 1.5�� ������ �ϰ� ������ 1. ĳ�����ϱ� or �ڷ��� �ٲٱ�
		d = 3/2.0; //.0�� �ٿ��־���� �Ǽ��� ����� �� 
		i = (int)(3/2.0); //�׻� ���ΰ� ��������(int)3/2.0�ϸ� 3�� ���������� ��
		System.out.println(i);
		System.out.println(d);
	}

}
 