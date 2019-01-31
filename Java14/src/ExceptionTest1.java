
public class ExceptionTest1 {


	public static void main(String[] args) {
		
		try {
			int num = Integer.parseInt("abc");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		System.out.println("Number Format ¿¹¿Ü");
	}

}
