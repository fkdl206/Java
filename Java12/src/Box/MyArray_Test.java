package Box;

public class MyArray_Test {

	public static void main(String[] args) {
		String[] language = {"java", "c++", "python"};
		MyArray.swap(language, 0, 2);
		
		for(int i = 0 ; i<language.length; i ++) {		// language.length
			System.out.println(language[i]);			// 제네릭 연습해보기
		}
		
		for(String s : language)				// (int i = 0 ; i<language.length; i ++)
			System.out.println(s);				//  이럴 때 이렇게 사용가능
	}

}
