package Bank;

public class GoodBank extends Bank{

	@Override
	public double getInterestRate(double p) {
		System.out.println("GoodBank�� �������� :" +p);
		return super.getInterestRate(p);
	}
	
}
