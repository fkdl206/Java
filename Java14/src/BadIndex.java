
public class BadIndex {

public static void main(String[] args) {
	int[] array = new int[10];
	for (int a = 0; a < array.length; a++) {
		array[a]= 0;
		
	}
	try {
		int result = array[12];	
	} catch (Exception e) {							// 拭君 概聖 凶 坦軒敗 
		System.out.println("壕伸税 昔畿什 拭君 ");		// 酔焼馬惟 拭君研 坦軒敗せせせせせせ
		System.out.println(e.getMessage());
		e.printStackTrace();
	} finally {
		System.out.println("蟹澗 拭君亜 降持背亀,降持馬走 省焼亀 巷繕闇 伽 叔楳馬澗 蝕拝戚陥 = finally");
	}
	System.out.println("引尻 戚 庚舌戚 叔楳吃猿推?");
}
}
