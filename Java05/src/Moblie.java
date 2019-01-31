
public class Moblie {
	//객체를 만들것임, 
	// 정적 속성= 변수
	// 색, 회사, 가격
	String color;
	String company;
	int price;
	
	// 동적 속성 = 메소드
	// 통화하다, 카톡하다, 인터넷하다 
	void communicate(){                //return값이 없을 때
		System.out.println("calling");
	}
	String kakaotalk(){
		return "뿅!";
	}
	int internet(){                    //인터넷 사용한 시간!
		return 10; 
		
	}
}
