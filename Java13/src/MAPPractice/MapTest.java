package MAPPractice;

import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		Map map = new HashMap();
		Student s1 = new Student("김김김", "01077574099");
		Student s2 = new Student("이이이", "01012345678");
		Student s3 = new Student("최최최", "01091234567");
		map.put("20171201", s1);
		map.put("20171202", s2);		//put은 첫번째로 key를 넣음 
		map.put("20171203", s3);
		
		System.out.println(map); // 쌍은 하나의 엔트리
		System.out.println(s1);
		
		//삭제하기
		map.remove("20171203");
		//수정하기
		Student s4 = new Student("박박박", "01098654321");
		map.put("20141202", s4);
		//읽어오기
		System.out.println(map.get("20171202"));
		
		System.out.println(map);
	}
}
