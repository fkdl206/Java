import java.util.Date;

public class DateObject {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.clone());
		System.out.println(date.getDate());
		System.out.println(date.getTime());
		System.out.println(date.getTimezoneOffset());
		int s = date.hashCode();
		System.out.println(s);
		
		boolean k = date.before(date);
		System.out.println(k);
		
		
	}
	
}
