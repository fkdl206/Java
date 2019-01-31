package Box;

public class SimplePair_Test {

	public static void main(String[] args) {
		SimplePair<String> sS = new SimplePair<String>("id", "dd");
		SimplePair<Integer> sI = new SimplePair<Integer>(100, 200);
		SimplePair<Double> sD = new SimplePair<Double>(25.2, 10.2);
		
		String s1 = sS.getData1();
		String s2 = sS.getData2();
		
		int i1 = sI.getData1();
		int i2 = sI.getData2();
	
		double d1 = sD.getData1();
		double d2 = sD.getData2();
		
		System.out.println(s1 + i2 + d1);
	
		
		
		
	}

}
