package Day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamEx1 {

	public static void main(String[] args) {

		FileInputStream fis1 = null;
		FileOutputStream fos1 = null;
		
		String fileName = "src/Day16/fileEx3"
		
		try {
			(FileOutputStream fos1 = new FileOutputStream(fileName);
			FileInputStream fis1 = new FileInputStream(fileName)) {
			
			String str = "Hello";
			for(int i=0; i<str.length(); i++) {
				fos1.wait(str.charAt(i));
			}
			for(int i=0; i<str.length(); i++) {
				int ch = fis1.read();
				System.out.println((char)ch);
			} catch (FileNotFoundException e) {
				System.out.println(fileName + "파일을 찾을 수 없습니다");
			} catch (IOException e) {
				System.out.println("파일 작업 중 예외발생");

			}
			}
