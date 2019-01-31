package Abstract;

public class YourCal implements Cal2 {

	public YourCal() {}

	@Override
	public void start() {
		System.out.println("start()");
	}

	@Override
	public void stop() {
		System.out.println("stop()");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep()");
		
	}

}
