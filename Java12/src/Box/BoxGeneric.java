package Box;

public class BoxGeneric<T> {   //��ü �ϳ��� ���� ���̴� ��� T��
	private T input;		//object��ſ� t���
	public void set(T input) {
		this.input = input;
	}
	public T get() {
		return input;
	}



}
