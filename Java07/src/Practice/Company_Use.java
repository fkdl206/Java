package Practice;

public class Company_Use {
	public static void main(String[] args) {
		Company c1 = new Company("�η�", "��", 20);
		Company c2 = new Company("���", "��", 30);
		Company c3 = new Company("����", "��", 40);
		
		System.out.println("��ü ������: " + c1.num+","+c2.num+","+c3.num);
		System.out.println("c1.c2.c3.�� �ص��ǰ�, Ŭ���� �̸����� �ٷ� ��������"+ Company.num);
		//���� �� �о��! Ŭ�����̸����� ������ �� �ִ� ������ ������
		System.out.println("�������� ��ճ���: "+(c1.age+c2.age+c3.age)/3);
		System.out.println("ù��° ������ �̸�: "+c1.name);
	}
}
