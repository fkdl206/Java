package AllPractice;
import java.util.*;

public class Practice_2 {
	//2. 고객관리 시스템에서
	//100번의 고객은 김데이, 200번의 고객은 김사전, 300번의 고객은 김구조, 400번의 고객은 김자료
	//200번의 고객은 탈퇴, 300번의 고객은 개명(김충성)
	//=> 고객의 전체 리스트를 프린트!

	
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("100", "김데이");
		map.put("200", "김사전");
		map.put("300", "김구조");
		map.put("400", "김자료");
		
		System.out.println(map);
		
		map.remove("200");
		map.put("300", "김충성");
		
		System.out.println(map);
	}
	


}
