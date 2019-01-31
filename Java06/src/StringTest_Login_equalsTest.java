import java.util.Scanner;

public class StringTest_Login_equalsTest {

		public static void main(String[] args) {
			String id = "pakker";
			String pw = "1234";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("ID: ");
			String inputId = sc.next(); //초기화안하면 안찍힌다 했던거같은데? 기본형만 그런건가?
			System.out.println("PW: ");
			String inputPw = sc.next();
			
			if(inputId.equals(id) && inputPw.equals(pw)) {
				System.out.println("login success");}
			else {
				System.out.println("nono");}
			}
		}
