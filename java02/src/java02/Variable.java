package java02;

public class Variable {

	public static void main(String[] args) {
		int i =100;
		byte b = 27;
		boolean bl = false;
		float f = 11.11f;
		double d = 22.22;
		char ch = 'a';
		
//		System.out.println("float 값 :" + f);
//		System.out.println("char 값 :" + ch);
		
		//작은 값-> 큰값에다 넣기
//		i = b;                    //자동 형변환(캐스팅)이 됨 
//		System.out.println(i);
//		//큰 값-> 작은값에다 넣기
//		b= (byte)i;               //자동 형변환이 안됨
//		System.out.println(b);    //따라서 강제 형변환 함
		
		i = 3/2; //정수=정수/정수 i = 1
		//만약 1.5가 나오게 하고 싶으면 1. 캐스팅하기 or 자료형 바꾸기
		d = 3/2.0; //.0을 붙여주어야지 실수로 계산이 됨 
		i = (int)(3/2.0); //항상 가로가 먼저여서(int)3/2.0하면 3만 정수형으로 됨
		System.out.println(i);
		System.out.println(d);
	}

}
 