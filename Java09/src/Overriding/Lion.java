package Overriding;

public class Lion extends Animal {
	@Override
	public void eat() {
		System.out.println("»ç·á¸¦ ¸Ô´Ù");
	}
	
	@Override
	public void sound() {
		System.out.println("¸Û¸Û");
	}
}
