package Pracccctice;
import java.util.*;

public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new LinkedList();
		int time = 10 ;
		for (int i = time ; i >= 0; i--) {
			queue.add(i);
			System.out.println(queue);
		}

		System.out.println("=================");
		queue.remove();
		System.out.println(queue);
		
}
	
}
