package Bank;

public class NormalBank extends Bank{

	@Override
	public double getInterestRate(double p) {
		System.out.println("NormalBank�� �������� : " + p);
		return super.getInterestRate(p);
	}
	
}
