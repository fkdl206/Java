package AllPractice;
import java.util.*;

public class Practice_7 {

//	7. 냉장고에 어제 , 오늘 우유를 사다 넣어놨음. 
//	어제 우유이름은 "어제 우유", 오늘 우유이름은 "오늘 우유"
//	어제의 우유가 먼저 없어짐. 현재 남은 우유의 이름을 프린트!
	
	public static void main(String[] args) {
		Queue queue = new LinkedList();
		queue.add("어제 우유");
		queue.add("오늘 우유");
		
		queue.remove();
		System.out.println(queue);
		
	}

	

}
