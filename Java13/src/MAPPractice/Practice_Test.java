package MAPPractice;
import java.util.*;

public class Practice_Test {

	public static void main(String[] args) {
		Map map = new HashMap();
		Practice p1 = new Practice("김김김", "볼링", 3);
		Practice p2 = new Practice("이이이", "배구", 6);
		Practice p3 = new Practice("박박박", "축구", 9);
		map.put("kim", p1);
		map.put("lee", p2);
		map.put("park", p3);
		
		System.out.println("1: "+ map);
		System.out.println("2: "+ p1);
		
		map.remove("park");
		/*map.put("kim", p1.exercise = "수정");
		map.put("kim", p1.member = "아아아");
		map.put("kim", p1.month = 78);*/
		Practice p4 = new Practice("김김김", "골프", 4);	//수정시에는 무조건 객체를 새로 만들어서 해야함
		map.put("kim", p4);
		
	
		System.out.println("3: "+ p1);
		System.out.println("4: "+ map);
	}

}
