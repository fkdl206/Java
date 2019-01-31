
public class Pet_2 {
	public static void main(String[] args) {
		Pet p2= new Pet();
		
		p2.color="cc";
		p2.name="he";
		p2.size=30;
		
		System.out.println(p2.color);
		System.out.println(p2.name);
		System.out.println(p2.size);
		
		System.out.println(p2.bark());
		System.out.println(p2.run());
		p2.eat();
	}
}
