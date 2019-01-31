package Person;

public class Person_2 {
	public static void main(String[] args) {
		Person p1 = new Person(160, 45, "dd");
		Person p2 = new Person(168, 50, "루루", "서울시 마포구");
		
		System.out.println(p2.getWeight());
		System.out.println(p2.getSecret());
		System.out.println(p2.print());
	}
}
