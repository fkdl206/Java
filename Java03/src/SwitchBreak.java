
public class SwitchBreak {

	public static void main(String[] args) {
		int month = 6;
		
		switch(month) {
		case 2:
			System.out.println("28�ϱ���");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�ϱ���");
			break;
		default:
			System.out.println("ggg");		
		}
	}

}


//������ �Ͱ��ϴ� ���� break�����