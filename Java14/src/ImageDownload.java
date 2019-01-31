import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class ImageDownload {
	public static void main(String[] args) throws Exception{
		String img = "http://post.phinf.naver.net/MjAxNzA1MTlfODcg/MDAxNDk1MTU2MTM0MjAx.OL0KGhikhSuRiJrFrFuHHQBzL21bHCqbmL13UWcbetkg.Hs7cOSQQBvryTKGTkBZWkzP9xHsnTGnWdtcW90t0-KUg.JPEG/IPIIQWjmP3knUxXsAKFiFc_GG3KA.jpg";
		System.out.println(img + "사이트에서 다운로드 합니다.");
		URL url = new URL(img);
		byte[] buffer = new byte[2048];
		try(InputStream in = url.openStream();
			OutputStream out = new FileOutputStream("download.jpg");)
				{
					int length = 0;
					while ((length = in.read(buffer)) != -1) {
						System.out.println(length + "바이트만큼 읽었음!");
						out.write(buffer, 0, length);
					}//while
					in.close();
					out.close();
				}catch (Exception e) {
					System.out.println("예외: "+ e.getMessage());
				}
	}
}
