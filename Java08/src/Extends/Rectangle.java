package Extends;

public class Rectangle extends Shape {

		int width = 5;
		int height = 10;
		

		public void draw() {
			System.out.println(width*height);
		}
		
		public void area() {
			System.out.println(width + height);
		}
		
//		public double area() {
//			return (width + height);      원래 이렇게 해야함
//		}
//		
		
}
