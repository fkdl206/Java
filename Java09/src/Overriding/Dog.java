package Overriding;

public class Dog extends Animal {
	//오버라이딩
	@Override
	public void eat() {
		System.out.println("사료사료");      
	}
	
	
	//오버로딩
	public void eat(String name, int price) {
		System.out.println("개가 먹은 음식은:"+name+"이고, 가격은: "+price);
	}
	
}
