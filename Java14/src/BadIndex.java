
public class BadIndex {

public static void main(String[] args) {
	int[] array = new int[10];
	for (int a = 0; a < array.length; a++) {
		array[a]= 0;
		
	}
	try {
		int result = array[12];	
	} catch (Exception e) {							// ���� ���� �� ó���� 
		System.out.println("�迭�� �ε��� ���� ");		// ����ϰ� ������ ó���Ԥ�����������
		System.out.println(e.getMessage());
		e.printStackTrace();
	} finally {
		System.out.println("���� ������ �߻��ص�,�߻����� �ʾƵ� ������ �� �����ϴ� �����̴� = finally");
	}
	System.out.println("���� �� ������ ����ɱ��?");
}
}
