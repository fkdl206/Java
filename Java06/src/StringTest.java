
public class StringTest {
	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "banana";
		String s3 = s1;
		String s4 = "apple";  //new�� �Ⱦ��� �⺻������ ���� but ��������
		String s5 = new String("apple"); //new���� ���������� ����
	// <<�ּ� ��>> ���ϱ�
		System.out.println(s1 == s2); //false
		System.out.println(s1 == s3); //true -> �ּҰ��� �־!
		System.out.println(s1 == s4); //true -> �⺻������ ���� ���� ���� �Ȱ����� �Ȱ������� ����
		System.out.println(s1 == s5); //false->??? new��� ������� ������ ���ο� �ּҰ�
		
	//�ȿ� ����ִ� ���� ���� ���ϴ� ���� equals �޼ҵ�
		
	}
}
