import java.io.File;

public class FileTest {

	public static void main(String[] args) {		//���丮�� ����, 2�� �� �ٷ�� ��ü
		String file =  "C:\\Users\\jongro22\\Pictures";
		File dir = new File(file);
		String[] dirList = dir.list();
		
		for (int i = 0; i < dirList.length; i++) {
			File f = new File(file + "/" + dirList[i]);
			System.out.println("===================");
			System.out.println("�̸� : "+ f.getName());
			System.out.println("��� : "+ f.getPath());
			System.out.println("�θ� : "+ f.getParent());
			System.out.println("������ : "+ f.getAbsolutePath());
			System.out.println("���丮 : "+ f.isDirectory());
			System.out.println("������ : "+ f.getAbsolutePath());
			
			
		}
	}

}
