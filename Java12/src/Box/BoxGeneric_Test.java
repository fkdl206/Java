package Box;

public class BoxGeneric_Test {

	public static void main(String[] args) {
		BoxGeneric<String> boxS = new BoxGeneric<String>();
		BoxGeneric<Integer> boxI = new BoxGeneric<Integer>(); // �̷��� ���ָ� boxgeneric�ȿ� �ִ� t�� String�� ����!!!

		boxS.set("hello java");
		String s = boxS.get();
		System.out.println(s);
		
		boxI.set(100);
		int i = boxI.get();
		System.out.println(i);
		
	}

	
}
