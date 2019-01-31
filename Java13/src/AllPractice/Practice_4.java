package AllPractice;
import java.util.*;

public class Practice_4 {

//	4. 여행을 가려함.
//	한 번 다녀온 곳은 가지 않음. 가고 싶은 여행지:유럽, 일본, 필리핀, 캐나다, 미국
//	=>전체 여행지 리스트를 프린트!

	public static void main(String[] args) {
		Set travel = new HashSet();
		travel.add("유럽");
		travel.add("일본");
		travel.add("필리핀");
		travel.add("캐나다");
		travel.add("미국");
		
		System.out.println(travel);
		
	}

}
