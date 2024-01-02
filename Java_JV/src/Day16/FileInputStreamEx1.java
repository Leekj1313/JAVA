package Day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		
		try {
				FileInputStream fis = new FileInputStream("src/Day16/fileEx1.txt");
				for(int i = 0; i<20; i++) {
					int num = fis.read();
					System.out.print((char)num);
				}
				fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일을 닫을 수 없습니다.");
		}
		
	}

}
