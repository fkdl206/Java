package MAPPractice;

public class Practice {

	String member;
	String exercise;
	int month;
	
	
	public Practice(String member, String exercise, int month) {
		super();
		this.member = member;
		this.exercise = exercise;
		this.month = month;
	}

	@Override
	public String toString() {
		return member+","+exercise+","+month;
	}
	
}
