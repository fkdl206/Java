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
		RiceCakeCafe c1 = new RiceCakeCafe("Cake Cafe", "street 5", "라떼", 50, 3000);
		System.out.println("카페이름 : "+ c1.name +" , 카페 좌석수 : "+ c1.seat);
		System.out.println(c1.order+"를 샀고, "+ c1.pay+"원을 지불했다.");
	}
	
	
}
