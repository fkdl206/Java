package Box;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector vc = new Vector();
		vc.add("hello java!");
		vc.add(38383838);
		vc.add(5.456);
		
		System.out.println("Vector Size : " + vc.size());
		
		for(int i = 0 ; i < vc.size() ; i++ ) {
			System.out.println("vector Element" + ":" + vc.get(i) );
		}
	}
}
