package AllPractice;
import java.util.*;

public class Practice_5 {

//	5. ���� ���� �����ϴ� ������.
//	ù ��° ����, �� ��° �̹�ȣ, �� ��° ������, �� ��° ������
//	���� �ٲ�� �� ��°�� ��� ����!
//	�� ��° �̹�ȣ�� �Ⱦ�����.
//	=> ���� �����ϴ� ������ ����Ʈ�� ����Ʈ!

	public static void main(String[] args) {
		ArrayList celeb = new ArrayList();
		
		celeb.add("����");
		celeb.add("�̹�ȣ");
		celeb.add("������");
		celeb.add("������");
		System.out.println(celeb);
		
		celeb.set(2, "��");
		celeb.remove("�̹�ȣ");
		System.out.println(celeb);
		
		
		for (int i=0 ; i < celeb.size() ;i ++) {
			System.out.println((i+1) + "��° " + celeb.get(i));
		}
	}
}
