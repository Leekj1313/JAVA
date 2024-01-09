package test;

import java.util.Scanner;

public class Test {

/*	public void count() {
		Scanner sc = new Scanner(System.in);
		
		while(false) {
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			if(str == "EXIT") {
				break;
			}else {
				System.out.println(str.length() + "글자입니다");
			}
		}
		System.out.println("프로그램을 종료합니다");
	}

}
*/
public void count() {
	Scanner sc = new Scanner(System.in);
	
	while() {
		System.out.print("문자열을 입력해주세요 : ");
		String str = sc.nextLine();
		if(str == "EXIT") {
			break;
		}else {
			System.out.println(str.length() + "글자입니다");
		}
	}
	System.out.println("프로그램을 종료합니다");
}

}