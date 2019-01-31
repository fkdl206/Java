
public class Pet_1 {
	public static void main(String[] args) {
		Pet p = new Pet();
		
		p.color = "white";
		p.name = "´ó´ó´ó";
		p.size = 100;
		
		System.out.println(p.color);
		System.out.println(p.name);
		System.out.println(p.size);
		
		
		System.out.println("\n" +p.bark());
		System.out.println(p.run());
		p.eat();
		}
	}
