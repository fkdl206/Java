package Box;

public class BoxObject_Test {

	public static void main(String[] args) {
		BoxObject boxo1= new BoxObject();
		
		boxo1.set("dkdkdkdk");
		String s = (String)boxo1.get();
		
		boxo1.set(100);
		int i = (Integer)boxo1.get(); 
		
		
	
	}

}
