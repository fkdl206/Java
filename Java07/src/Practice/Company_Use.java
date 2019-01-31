package Practice;

public class Company_Use {
	public static void main(String[] args) {
		Company c1 = new Company("로로", "남", 20);
		Company c2 = new Company("라라", "여", 30);
		Company c3 = new Company("류류", "남", 40);
		
		System.out.println("전체 직원수: " + c1.num+","+c2.num+","+c3.num);
		System.out.println("c1.c2.c3.로 해도되고, 클래스 이름으로 바로 생성가능"+ Company.num);
		//위에 잘 읽어보기! 클래스이름으로 접근할 수 있는 유일한 변수임
		System.out.println("직원들의 평균나이: "+(c1.age+c2.age+c3.age)/3);
		System.out.println("첫번째 직원의 이름: "+c1.name);
	}
}
