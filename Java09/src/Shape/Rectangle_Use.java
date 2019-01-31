package Shape;

public class Rectangle_Use {
	public static void main(String[] args) {
		Rectangle rex = new Rectangle();
	}	
}

//메서드 안만들었는데 결과가 뜸
//기본생성자호출
//Rectangle 생성자()
//
//주석막아서 Shape안에 있는 모든걸 막아도 Use는 성공됨
//but 밑에만 막으면 (rectangle) 기본생성자가 생성되지 않으므로 안됨
//파라메터가 있는 생성자는 기본생성자 안만들어준다.??

//상위에있는 기본생성자를 자동으로 호출




//파라메터 넣을 때 위에서 가져와야만 하지는 않는다. 어떤때 가능?