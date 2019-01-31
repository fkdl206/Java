import java.io.File;

public class FileTest {

	public static void main(String[] args) {		//디렉토리와 파일, 2개 다 다루는 개체
		String file =  "C:\\Users\\jongro22\\Pictures";
		File dir = new File(file);
		String[] dirList = dir.list();
		
		for (int i = 0; i < dirList.length; i++) {
			File f = new File(file + "/" + dirList[i]);
			System.out.println("===================");
			System.out.println("이름 : "+ f.getName());
			System.out.println("경로 : "+ f.getPath());
			System.out.println("부모 : "+ f.getParent());
			System.out.println("절대경로 : "+ f.getAbsolutePath());
			System.out.println("디렉토리 : "+ f.isDirectory());
			System.out.println("절대경로 : "+ f.getAbsolutePath());
			
			
		}
	}

}
