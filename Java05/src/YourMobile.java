
public class YourMobile {

	public static void main(String[] args) {
		Moblie your = new Moblie();
		your.color = "Yello";
		your.company = "Parkker";
		your.price = 150;
		
		your.communicate();
		your.internet();
		String s = your.kakaotalk(); //�޾ƿ;��ϴ� return���� ������ �ֱ�!
		System.out.println(your.color);
		System.out.println(your.company);
		System.out.println(s);
	}

}
