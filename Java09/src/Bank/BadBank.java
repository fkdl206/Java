package Bank;

public class BadBank extends Bank{
	int x;
	int y;
	
	public BadBank(int x, int y, double z) {
		super(z);
		this.x = x;
		this.y = y;
	}
	
	@Override
	public double getInterestRate(double p) {
		System.out.println("BadBank�� �������� : " + p);
		return super.getInterestRate(p);
	}

}
