//다른 위치에 있을때만 import사용, 현재는 Mobile과 같은 위치이기 때문에 
//import 사용 안함

public class MyMobilephone {
	
	public static void main(String[] args) {
		Moblie my = new Moblie();
		my.color = "red";
		my.company ="ss";
		my.price = 50;
		
		my.communicate();
		System.out.println(my.internet());//보냈으니깐 받는것이 필요!
		String k = my.kakaotalk();        //받는것을 변수k로 설정해서 함
		System.out.println("카톡이 왔다!"+k);
		System.out.println(my.company);
	
		System.out.println(my);			  // 결과값 : Moblie@161cd475 이렇게 나옴 my의 주소값임
		System.out.println(my.price);
	}
}
