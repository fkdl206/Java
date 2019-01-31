
public class StringTest {
	public static void main(String[] args) {
		String s1 = "apple";
		String s2 = "banana";
		String s3 = s1;
		String s4 = "apple";  //new를 안쓰면 기본형으로 사용됨 but 생략가능
		String s5 = new String("apple"); //new쓰면 참조형으로 사용됨
	// <<주소 값>> 비교하기
		System.out.println(s1 == s2); //false
		System.out.println(s1 == s3); //true -> 주소값을 넣어서!
		System.out.println(s1 == s4); //true -> 기본형으로 사용될 때는 값이 똑같으면 똑같은데다 넣음
		System.out.println(s1 == s5); //false->??? new라고 만든것은 무조건 새로운 주소값
		
	//안에 들어있는 참조 값을 비교하는 것이 equals 메소드
		
	}
}
