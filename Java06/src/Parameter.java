
public class Parameter {
	int speed;
	int distance;
	
	void run(){
		System.out.println("�޸��⸦ �����ϴ�!");
	}
	
	String stop(int location){
		return "���� drinking";
	}
	
	String speedup(int location, int sUp){
		return location + "���� " + sUp +"��ŭ �ӵ��� ������";
	}
}
