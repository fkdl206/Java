
public class SwitchBreak {

	public static void main(String[] args) {
		int month = 6;
		
		switch(month) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("ggg");		
		}
	}

}


//나오고 싶게하는 곳에 break써야함