package Abstract;

public class MyCalendar implements Cal {

	int year;
	int month;
	int day;
	
	void start() {
		System.out.println("2018년이 시작됩니다");
	}
	
	void stop() {
		System.out.println("2017년이 끝나갑니다");
	}
}
