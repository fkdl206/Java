
public class Array2D {
	public static void main(String[] args) {
		int [] one = new int[3];
		int [] two = {1,2,3};
		String [] three = {"hello", "hi", "nihao",}; 
		// 길이는 다 3
		
		System.out.println(three[2]);
		
		int[][] four = new int[2][3];
		four [0][0] = 100;
		four [1][2] = 200;
		
		System.out.println(four[0][2]);
		System.out.println(four[0][0]);
		
		int [][] five = {
				{1,2,3},{4,5,6}
		};
		System.out.println(five[0][0]);
		
		String[][] six = {
				{"park","kim","lee"},{"choi","jang","seo"} };
		System.out.println(six[1][2]);
		System.out.println(six.length);  //배열.length : 행갯수
		System.out.println(six[0].length + "/////"); //열 갯수 구하기
		
		for(int i=0 ; i<six.length; i++) {		//for가지고 배열접근
			for(int j=0; j<six[i].length; j++) {
				System.out.println(six[i][j]);
			}
		}
	}
		}

