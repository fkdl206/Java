package Box;

public class Box_Test {
	public static void main(String[] args) {

		Box b1 = new Box();
		b1.set("Hello Java");
		String s1 = b1.getS();
		
		b1.set(100);
		int i1 = b1.getI();
	}
}
