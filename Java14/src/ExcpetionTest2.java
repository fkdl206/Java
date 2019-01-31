
public class ExcpetionTest2 {

	public static void main(String[] args) {
		System.out.println(readString());
	}
	
	public static String readString() {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오.");
		System.out.println(buf);
		System.out.println("me");
		return new String(buf);
	}
	
	public static String readString() throws {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하시오.");
		System.out.println(buf);
		System.out.println("me");
		return new String(buf);

}
