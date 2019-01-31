
public class YourMobile {

	public static void main(String[] args) {
		Moblie your = new Moblie();
		your.color = "Yello";
		your.company = "Parkker";
		your.price = 150;
		
		your.communicate();
		your.internet();
		String s = your.kakaotalk(); //받아와야하는 return값을 변수에 넣기!
		System.out.println(your.color);
		System.out.println(your.company);
		System.out.println(s);
	}

}
