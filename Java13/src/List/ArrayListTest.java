import java.util.*;
package List;

public class ArrayListTest{
	
	public static void main(String[] args) {
		ArrayList l = new ArrayList();		
		
		l.add("java");
		l.add("jsp");
		l.add("spring");
		l.add("database");
		l.add(1,"servlet");
		l.remove(4)
		Interator it =l.iterator();
		while(it.hasNext()) {
			String s = (String)it.next();
			System.out.println(s);
		}
	}
}
