
public class ExcpetionTest2 {

	public static void main(String[] args) {
		System.out.println(readString());
	}
	
	public static String readString() {
		byte[] buf = new byte[100];
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		System.out.println(buf);
		System.out.println("me");
		return new String(buf);
	}
	
	public static String readString() throws {
		byte[] buf = new byte[100];
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		System.out.println(buf);
		System.out.println("me");
		return new String(buf);

}
