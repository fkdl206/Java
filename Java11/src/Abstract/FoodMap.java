package Abstract;

public class FoodMap implements MapInterFace, Sleep {
	int x;
	int y;
	
	public FoodMap() {}

	@Override
	public void findMap() {
			x= LocationX;
			y= LocationY;
			System.out.println(x+","+y);
	}

	@Override
	public void executeMap() {
		System.out.println("executeMap()====����");
	}

	@Override
	public void closeMap() {
		System.out.println("closeMap()====����");
			}
	
	public void reservation() {
		System.out.println("���� ���� ���ּž��ؿ�");
	};
	public void pay() {
		System.out.println("���� �����ؾ��ؿ�");
	}
	

	
	
}
