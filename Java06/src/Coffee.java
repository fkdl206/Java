
public class Coffee {
	String field;
	int price;

	public Coffee() {
		System.out.println("Coffee��ü�� �����Ǿ����ϴ�.");
	}
	
	public Coffee(String field) {
		//System.out.println("���� �����ϴ� Ŀ�Ǵ�" + field + "�Դϴ�");
		this.field = field;
		}
	
	public Coffee(String field, int price) {
		this.field = field;
		this.price = price;
	}
	
	
	void getLattee(){
		System.out.println("���� �����ϴ� Ŀ�Ǵ�" +field +"�Դϴ�");
	}
	void getCoffu() {
		System.out.println("���� �����ϴ� Ŀ�Ǵ�" + field+ "�̰�, ������ "+ price +"�� �Դϴ�");
	} 
}
