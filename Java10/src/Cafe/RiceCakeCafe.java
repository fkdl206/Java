package Cafe;

public class RiceCakeCafe extends Cafe {

	public int seat;
	public int pay;
	

	public RiceCakeCafe(String name, String location, String order,int seat, int pay) {
		super(name, location, order);
		this.seat=seat;
		this.pay=pay;
	}
	
	public static void main(String[] args) {
		RiceCakeCafe c1 = new RiceCakeCafe("Cake Cafe", "street 5", "��", 50, 3000);
		System.out.println("ī���̸� : "+ c1.name +" , ī�� �¼��� : "+ c1.seat);
		System.out.println(c1.order+"�� ���, "+ c1.pay+"���� �����ߴ�.");
	}
	
	
}
