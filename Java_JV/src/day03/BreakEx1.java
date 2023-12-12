package day03;

import java.util.Scanner;

public class BreakEx1 {

	public static void main(String[] args) {
		// 문자를 입력하여 문자를 출력하고, q를 입력하면 종료하는 예제
		Scanner scan = new Scanner(System.in);
		
		char ch = 'a';
		while(true) {
			System.out.print("문자입력 : ");
			ch = scan.next().charAt(0);
			System.out.print("문자 : " + ch);
			if(ch == 'q') {
				break;
			}
		}
		
		
		scan.close();
	}

}
