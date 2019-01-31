package Bank;

public class NormalBank extends Bank{

	@Override
	public double getInterestRate(double p) {
		System.out.println("NormalBank의 이자율은 : " + p);
		return super.getInterestRate(p);
	}
	
}
