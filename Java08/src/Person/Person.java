package Person;

public class Person {
	private int height;
	private int weight;
	private String secret;
	private String address;
	
	public Person(int height, int weight, String secret, String address) {
		this.height = height;
		this.weight = weight;
		this.secret = secret;
		this.address = address;
	}
	public Person(int height, int weight, String secret) {
		this.height = height;
		this.weight = weight;
		this.secret = secret;
	}
	
	public int getWeight() {      // getters setters 사용해서 만들기
		return weight;
	}
	public String getSecret() {
		return secret;
	}
	
	public double print() {			
		this.height = height;
		return (height-100)*0.9;
	}     
	
//	void getWight() {
//		System.out.println(weight);
//	}
//	void getSecret() {
//		System.out.println(secret);   --> 이렇게 만들어도 됨
//	}
//	void Print(){
//		System.out.println("자신의 적정 몸무게:" + ((height-100)*0.9) );
//	}
	
	
	//추가 자신의 적정 몸무게 (height-100)*0.9
	
	
	
}
