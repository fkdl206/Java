package Box;

public class SimplePair<T> {
	private T data1;
	private T data2;
	
	public SimplePair(T data1, T data2) {
		super();
		this.data1 = data1;
		this.data2 = data2;
	}

	public T getData1() {
		return data1;
	}

	public void setData1(T data1) {
		this.data1 = data1;
	}

	public T getData2() {
		return data2;
	}

	public void setData2(T data2) {
		this.data2 = data2;
	}
	
	

}
