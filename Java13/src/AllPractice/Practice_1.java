package AllPractice;
import java.util.*;

public class Practice_1 {

//	1. �޸��⸦ �ߴµ�,
//	1���� �ڼ���, 2���� ������, 3���� ������, 4���� �谳��
//	2���� ��Ģ->Ż��
//	=>����� �̸��� �� �������� ���α׷�!

	public static void main(String[] args) {
		ArrayList run = new ArrayList();
		
		run.add("�ڼ���");
		run.add("������");
		run.add("������");
		run.add("�谳��");
		
		System.out.println(run);
		
		run.remove("������");
		System.out.println(run);
		
/*		for (Iterator iterator = run.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);*/
		for(int i=0; i<run.size(); i++) {
			System.out.println((i+1) + "��: " + run.get(i));
		}
	}
}
