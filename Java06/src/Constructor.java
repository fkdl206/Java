
public class Constructor {
	int num = 1;
	
	Constructor() {
		System.out.println("객체인스턴스생성");   //아무 넣는 값이 없을때 찍힘 
	}
//	Constructor(int input){              //넣는 값이 1개 있을 때 찍힘
//		num = input;
//	}

	Constructor(int num){              //넣는 값이 1개 있을 때 찍힘
	this.num = num;  // 변수가 어짜피 같은거니 input대신에 똑같이num 씀 -> this사용
}
	
	
	Constructor(String input_1, int num){  //string은 프린트하고, input_2는 num에 넣음
		System.out.println(input_1);   // 변수를 만들어서 넣을 수 있을까?프린트하지말고?
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
}
