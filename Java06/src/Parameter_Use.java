//���� ��ġ�� ���� ���� import�� �Ƚᵵ ��

public class Parameter_Use {
	public static void main(String[] args) {
		Parameter param = new Parameter();
		
		param.distance = 42;
		param.speed = 50;
		
		param.run();
		String a = param.speedup(20, 15);
		System.out.println(a);
		System.out.println(param.stop(20));
		
	}
}
