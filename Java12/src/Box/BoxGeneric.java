package Box;

public class BoxGeneric<T> {   //객체 하나를 받을 것이다 라고 T씀
	private T input;		//object대신에 t사용
	public void set(T input) {
		this.input = input;
	}
	public T get() {
		return input;
	}



}
