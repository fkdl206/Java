package Animal;

public class Animal_Test {
	public static void main(String[] args) {
		Lion l = new Lion();
		l.weight=100;
		l.eat();        // animal�� �־��� ��
		
		l.legs = 4;
		l.roar();       // lion �� �־��� ��
		
		
		Eagle e = new Eagle();    //animal�� �־��� ��
		e.weight=50;
		e.eat();
		
		e.wings=2;					//egle �� �־��� ��
		e.fly();
		
	}
}
