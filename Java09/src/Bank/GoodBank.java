package Bank;

public class GoodBank extends Bank{

	@Override
	public double getInterestRate(double p) {
		System.out.println("GoodBank의 이자율은 :" +p);
		return super.getInterestRate(p);
	}
	
}
