package Box;

public class Practice_1_Test {

	public static void main(String[] args) {
		Integer[] i = {10, 20, 30, 40, 50};
		Double[] d = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] c = {'S', 'P', 'R', 'I', 'N', 'G'};
	
		printArray(i);
		printArray(d);
		printArray(c);
	}
		
		
	public static <T> void printArray(T[] ar) {
		
		for(T t : ar)	{
			System.out.println(t);	
		}
		System.out.println();
		System.out.println("================");
	}
}
