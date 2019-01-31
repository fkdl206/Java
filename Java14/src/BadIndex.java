
public class BadIndex {

public static void main(String[] args) {
	int[] array = new int[10];
	for (int a = 0; a < array.length; a++) {
		array[a]= 0;
		
	}
	try {
		int result = array[12];	
	} catch (Exception e) {							// 에러 났을 때 처리함 
		System.out.println("배열의 인덱스 에러 ");		// 우아하게 에러를 처리함ㅋㅋㅋㅋㅋㅋ
		System.out.println(e.getMessage());
		e.printStackTrace();
	} finally {
		System.out.println("나는 에러가 발생해도,발생하지 않아도 무조건 꼭 실행하는 역할이다 = finally");
	}
	System.out.println("과연 이 문장이 실행될까요?");
}
}
