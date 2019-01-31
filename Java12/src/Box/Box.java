package Box;

public class Box {

	private String s;
	private Integer i;
	public void set(String s) {      //set때는 받을 값을 넣어주고 ()안에
		this.s=s;
	}
	public void set(Integer i) {      //set때는 받을 값을 넣어주고 ()안에
		this.i=i;
	}
	
	public String getS(){			//get할 때는 보통 비어있음
		return s;
	}
	
	public Integer getI(){			//get할 때는 보통 비어있음
		return i;
	}
	
}
