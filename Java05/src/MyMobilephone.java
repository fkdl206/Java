//�ٸ� ��ġ�� �������� import���, ����� Mobile�� ���� ��ġ�̱� ������ 
//import ��� ����

public class MyMobilephone {
	
	public static void main(String[] args) {
		Moblie my = new Moblie();
		my.color = "red";
		my.company ="ss";
		my.price = 50;
		
		my.communicate();
		System.out.println(my.internet());//�������ϱ� �޴°��� �ʿ�!
		String k = my.kakaotalk();        //�޴°��� ����k�� �����ؼ� ��
		System.out.println("ī���� �Դ�!"+k);
		System.out.println(my.company);
	
		System.out.println(my);			  // ����� : Moblie@161cd475 �̷��� ���� my�� �ּҰ���
		System.out.println(my.price);
	}
}
