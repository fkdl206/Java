package MAPPractice;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		Map map = new HashMap();
		Student s1 = new Student("����", "01077574099");
		Student s2 = new Student("������", "01012345678");
		Student s3 = new Student("������", "01091234567");
		map.put("20171201", s1);
		map.put("20171202", s2);		//put�� ù��°�� key�� ���� 
		map.put("20171203", s3);
		
		System.out.println(map); // ���� �ϳ��� ��Ʈ��
		System.out.println(s1);
		
		//�����ϱ�
		map.remove("20171203");
		//�����ϱ�
		Student s4 = new Student("�ڹڹ�", "01098654321");
		map.put("20141202", s4);
		//�о����
		System.out.println(map.get("20171202"));
		
		System.out.println(map);
	}
}
