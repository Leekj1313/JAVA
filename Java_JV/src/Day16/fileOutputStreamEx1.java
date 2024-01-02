package Day16;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.fileOutputStream;

public class fileOutputStreamEx1 {

	public static void main(String[] args) {

		fileOutputStream fos = null;
		
		String fileName = "src/Day16/fileEx2.txt";
		try {
			fos = new fileOutputStream(fileName);
			fos.writer((char)('A'=i));
			}
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 닫을 수 없습니다.");
		}

	}

}
