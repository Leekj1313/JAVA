package Day13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternEx2 {

	public static void main(String[] args) {
		/* 아이디를 입력받아 아이디 형식에 맞는지 틀린지를 출력하는 프로그램을 작성하시오
		 * 아이디 정규 표현식 : 영문, 숫자, 1~13자
		 * 
		 * 아이디 : abcd1234
		 * 아이디로 사용 가능합니다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디 : ");
		String id = scan.next();
	
		String regex = "^[a-zA-Z0-9]{8,13}$"; // 영문자 + 숫자, 범윈는 1~13자
		if(Pattern.matches(regex, id)) {
			System.out.println("아이디로 사용 가능합니다.");
		}else {
			System.out.println("아이디로 사용 불가능합니다.");
		}
	}
}
