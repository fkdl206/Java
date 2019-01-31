package Practice3;

public class Airplane747 implements Airplane2 {


	public Airplane747() {}

	@Override
	public String fly() {
		return FinalStatic.fly;
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return FinalStatic.stop;
	}

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return FinalStatic.start;
	}

	@Override
	public String drive() {
		// TODO Auto-generated method stub
		return FinalStatic.drive;
	}

	@Override
	public String person() {
		// TODO Auto-generated method stub
		return FinalStatic.person;
	}

	
	public static void main(String[] args) {
		Airplane747 a = new Airplane747();
		System.out.println(a.fly());
		System.out.println(a.stop());
		System.out.println(a.start());
		System.out.println(a.drive());
		System.out.println(a.person());
	}
}
