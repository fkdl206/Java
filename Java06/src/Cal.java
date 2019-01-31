
public class Cal {
	int add(int x, int y){
		return x + y ;
	}
	
	double add(double x, double y) {  //다형성 같은 이름의 메소드를 가지고 다양한 형태를 만들수 있다
		return x + y ;				  //이름 똑같으면 맞는 자료형 골라서
	}								  //스스로 넣어짐
	
	String add(String x, String y) {
		return x + "  "+y;
	}
	
	int subs(int x, int y){
		return x - y ;
	}
	
	int multi(int x, int y){
		return x * y ;
	}
	
	int div(int x, int y){
		return x / y ;
	}
	
}
