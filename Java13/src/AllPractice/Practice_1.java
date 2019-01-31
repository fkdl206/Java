package AllPractice;
import java.util.*;

public class Practice_1 {

//	1. 달리기를 했는데,
//	1등이 박소정, 2등이 김정민, 3등이 소지현, 4등이 김개념
//	2등이 반칙->탈락
//	=>등수와 이름이 잘 찍히도록 프로그램!

	public static void main(String[] args) {
		ArrayList run = new ArrayList();
		
		run.add("박소정");
		run.add("김정민");
		run.add("소지현");
		run.add("김개념");
		
		System.out.println(run);
		
		run.remove("김정민");
		System.out.println(run);
		
/*		for (Iterator iterator = run.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);*/
		for(int i=0; i<run.size(); i++) {
			System.out.println((i+1) + "등: " + run.get(i));
		}
	}
}
