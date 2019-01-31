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
		System.out.println("executeMap()====실행");
	}

	@Override
	public void closeMap() {
		System.out.println("closeMap()====실행");
			}
	
	public void reservation() {
		System.out.println("예약 먼저 해주셔야해요");
	};
	public void pay() {
		System.out.println("돈을 지불해야해요");
	}
	

	
	
}
