
public class Coffee {
	String field;
	int price;

	public Coffee() {
		System.out.println("Coffee객체가 생성되었습니다.");
	}
	
	public Coffee(String field) {
		//System.out.println("내가 좋아하는 커피는" + field + "입니다");
		this.field = field;
		}
	
	public Coffee(String field, int price) {
		this.field = field;
		this.price = price;
	}
	
	
	void getLattee(){
		System.out.println("내가 좋아하는 커피는" +field +"입니다");
	}
	void getCoffu() {
		System.out.println("내가 좋아하는 커피는" + field+ "이고, 가격은 "+ price +"원 입니다");
	} 
}
