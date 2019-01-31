package AllPractice;
import java.util.*;

public class Practice_5 {

//	5. 내가 제일 좋아하는 연예인.
//	첫 번째 공유, 두 번째 이민호, 세 번째 김혜수, 네 번째 전지현
//	맘이 바뀌어 세 번째가 비로 변경!
//	두 번째 이민호는 싫어졌음.
//	=> 내가 좋아하는 연예인 리스트를 프린트!

	public static void main(String[] args) {
		ArrayList celeb = new ArrayList();
		
		celeb.add("공유");
		celeb.add("이민호");
		celeb.add("김혜수");
		celeb.add("전지현");
		System.out.println(celeb);
		
		celeb.set(2, "비");
		celeb.remove("이민호");
		System.out.println(celeb);
		
		
		for (int i=0 ; i < celeb.size() ;i ++) {
			System.out.println((i+1) + "번째 " + celeb.get(i));
		}
	}
}
