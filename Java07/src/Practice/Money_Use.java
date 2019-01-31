package Practice;

public class Money_Use {
	public static void main(String[] args) {
		
		Money d1= new Money("루루", 5);
		System.out.println(d1.d+"는 나이가"+d1.a+"살이고, 매일 놀아요");
		System.out.println("아빠의 지갑에는"+ d1.money+"원이 남았어요");
		Money d2= new Money("리리", 7);
		System.out.println(d2.d+"는 나이가"+d2.a+"살이고, 매일 TV봐요");
		System.out.println("아빠의 지갑에는"+ d2.money+"원이 남았다");
	}
}
