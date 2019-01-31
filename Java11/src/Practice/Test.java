package Practice;

public class Test {

	public static void main(String[] args) {
		Manager m1 = new Manager("또봉이", "street 5", 15000);
		System.out.println("치킨이름: "+m1.name + "배달장소: "+ m1.location+"가격: " + m1.price);
		System.out.println("지점 갯수: "+m1.count);
		
		Manager m2 = new Manager("호식이", "street 8", 8500);
		System.out.println("치킨이름: "+m2.name + "배달장소: "+ m2.location+"가격: " + m2.price);
		System.out.println("지점 갯수: "+m2.count);
		
	}

}
