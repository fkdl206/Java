package AllPractice;
import java.util.*;

public class Practice_2 {
	//2. ������ �ý��ۿ���
	//100���� ���� �赥��, 200���� ���� �����, 300���� ���� �豸��, 400���� ���� ���ڷ�
	//200���� ���� Ż��, 300���� ���� ����(���漺)
	//=> ���� ��ü ����Ʈ�� ����Ʈ!

	
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("100", "�赥��");
		map.put("200", "�����");
		map.put("300", "�豸��");
		map.put("400", "���ڷ�");
		
		System.out.println(map);
		
		map.remove("200");
		map.put("300", "���漺");
		
		System.out.println(map);
	}
	


}
