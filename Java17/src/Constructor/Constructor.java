
public class Constructor {
	int num = 1;
	
	Constructor() {
		System.out.println("��ü�ν��Ͻ�����");   //�ƹ� �ִ� ���� ������ ���� 
	}
//	Constructor(int input){              //�ִ� ���� 1�� ���� �� ����
//		num = input;
//	}

	Constructor(int num){              //�ִ� ���� 1�� ���� �� ����
	this.num = num;  // ������ ��¥�� �����Ŵ� input��ſ� �Ȱ���num �� -> this���
}
	
	
	Constructor(String input_1, int num){  //string�� ����Ʈ�ϰ�, input_2�� num�� ����
		String a =input_1 ;  // ������ ���� ���� �� ������?����Ʈ��������?
		System.out.println(a);
		this.num = num;
	}
	
	int getNum() {
		return num;
	}
}
