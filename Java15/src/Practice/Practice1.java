package Practice;

import java.io.File;

public class Practice1 {

	public static void main(String[] args) {
		String file = "C:\\Program Files";
		File dir = new File(file);
		String[] dirList = dir.list();
		
		for (int i = 0; i < dirList.length; i++) {
			File f = new File(file + "/" +dirList[i]);
			System.out.println("�̸� : " + f.getName());
			System.out.println("��� : " + f.getPath());
			System.out.println("�θ� : " + f.getParent());
			System.out.println(" " + f.getAbsolutePath());
			System.out.println(" " + f.getTotalSpace());
			
		}
	}
}
