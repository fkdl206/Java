package Box;

public class OrderedPair_Test {

	public static void main(String[] args) {
		OrderedPair<String, String> oS = new OrderedPair<String, String>("id", "pakker");
		OrderedPair<String, Integer> oI = new OrderedPair<String, Integer>("pw", 1234);
		
		System.out.println(oS.getKey() +","+ oS.getValue());
		System.out.println(oI.getKey() +","+ oI.getValue());
		
	}

}
