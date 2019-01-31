package Overriding;

public class Animal_Use {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Dog dog = new Dog();
		
		lion.eat();
		dog.eat();
		lion.sound();
		dog.sound();
		dog.eat("dd", 5000);
	}
}
