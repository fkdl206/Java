package MAPPractice;

public class Student {

	String name;
	String tel;
	
	public Student(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	

	@Override
	public String toString() {
		return name;		
		//���� return super.toString();  ���⼭ super�� object
	}
}
