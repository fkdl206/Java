package Animal;

public class Animal_Test {
	public static void main(String[] args) {
		Lion l = new Lion();
		l.weight=100;
		l.eat();        // animal에 있었던 것
		
		l.legs = 4;
		l.roar();       // lion 에 있었던 것
		
		
		Eagle e = new Eagle();    //animal에 있었던 것
		e.weight=50;
		e.eat();
		
		e.wings=2;					//egle 에 있었던 것
		e.fly();
		
	}
}
