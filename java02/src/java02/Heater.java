package java02;

public class Heater {
	public static void main(String[] args) {
		int nowH = 10;
		int basicH = 11;
		int windH = 15;
		int basicW = 10;
		
		if((nowH <= basicH)&&(windH >= basicW)) {
			System.out.println("Heater ON!");
		}
		else {
			System.out.println("Heater OFF!");
		}
		
	}
}
