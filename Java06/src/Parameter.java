
public class Parameter {
	int speed;
	int distance;
	
	void run(){
		System.out.println("달리기를 시작하다!");
	}
	
	String stop(int location){
		return "물을 drinking";
	}
	
	String speedup(int location, int sUp){
		return location + "에서 " + sUp +"만큼 속도를 높였다";
	}
}
