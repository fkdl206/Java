package Box;

public class BoxGeneric_Test {

	public static void main(String[] args) {
		BoxGeneric<String> boxS = new BoxGeneric<String>();
		BoxGeneric<Integer> boxI = new BoxGeneric<Integer>(); // 이렇게 써주면 boxgeneric안에 있는 t에 String이 들어간다!!!

		boxS.set("hello java");
		String s = boxS.get();
		System.out.println(s);
		
		boxI.set(100);
		int i = boxI.get();
		System.out.println(i);
		
	}

	
}
