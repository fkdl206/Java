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
		//원래 return super.toString();  여기서 super는 object
	}
}
