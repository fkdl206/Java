package MAPPractice;
import java.util.*;

public class Practice_Test {

	public static void main(String[] args) {
		Map map = new HashMap();
		Practice p1 = new Practice("����", "����", 3);
		Practice p2 = new Practice("������", "�豸", 6);
		Practice p3 = new Practice("�ڹڹ�", "�౸", 9);
		map.put("kim", p1);
		map.put("lee", p2);
		map.put("park", p3);
		
		System.out.println("1: "+ map);
		System.out.println("2: "+ p1);
		
		map.remove("park");
		/*map.put("kim", p1.exercise = "����");
		map.put("kim", p1.member = "�ƾƾ�");
		map.put("kim", p1.month = 78);*/
		Practice p4 = new Practice("����", "����", 4);	//�����ÿ��� ������ ��ü�� ���� ���� �ؾ���
		map.put("kim", p4);
		
	
		System.out.println("3: "+ p1);
		System.out.println("4: "+ map);
	}

}
