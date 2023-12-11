package day02;

import java.util.Scanner;

public class TestEx5 {

	public static void main(String[] args) {
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12,1,2 : 겨울
		 * 그 외 : 잘못된 월
		 */
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요 : ");
		int date = scan.nextInt();
		System.out.println("입력받은 날짜 : " + date);
		
		//if(month == 3 || month == 4 || month == 5) {System.out.println(month + "월 은 봄입니다.)}
		
		/*if(month < 1 || month > 12) {
		 * System.out.println(month + " 월은 잘못 되었습니다.");
		 * }else if(month <= 2|| month == 12) {
		 * System.out.println(month + " 월은 겨울 입니다.");
		 * }else if(month <= 5) {
		 * System.out.println(month + " 월은 봄 입니다.");
		 * * }else if(month <= 8) {
		 * System.out.println(month + " 월은 여름 입니다.");
		 * * }else if(month <= 11) {
		 * System.out.println(month + " 월은 가을 입니다.");
		 * scan.close();
			}
		 */
		
		
		if(date == 0) {
			System.out.println(0);
		}else if(date ==3) {
			System.out.println(date + " 봄 입니다.");
		}
		if(date ==4) {
			System.out.println(date + " 봄 입니다.");
		}
		else if(date ==5) {
			System.out.println(date + " 봄 입니다.");
		}
		else if(date ==6) {
			System.out.println(date + " 여름 입니다.");
		}
		if(date ==7) {
			System.out.println(date + " 여름 입니다.");
		}
		else if(date ==8) {
			System.out.println(date + " 여름 입니다.");
		}
		else if(date ==9) {
				System.out.println(date + " 가을 입니다.");
		}
		else if(date ==10) {
				System.out.println(date + " 가을 입니다.");
		}
		else if(date ==11) {
				System.out.println(date + " 가을 입니다.");
		}
		else if(date ==12) {
					System.out.println(date + " 겨울 입니다.");
		}
			if(date ==1) {
					System.out.println(date + " 겨울 입니다.");
		}
		else if(date ==2) {
					System.out.println(date + " 겨울 입니다.");
		}
		if (date >= 12 ) {
					System.out.println(date + " 잘못되었습니다.");
		}
		scan.close();
					}
}