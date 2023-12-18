package day7;

import java.util.Scanner;

public class oddEvenGameEx1 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 프로그램을 작성하시오 메소드 이용
		 * 1. 새 게임
		 * 2. 결과조회
		 * 3. 프로그램종료
		 * 메뉴선택 : 1
		 * ----------
		 * 선택(:홀1, 짝:0) : 1
		 * 3 홀입니다
		 * 성공
		 * ----------
		 * 1. 새 게임
		 * 2. 결과조회
		 * 3. 프로그램종료
		 * 메뉴선택 : 2
		 * 결과 : 1승 0패
		 * ----------
		 * 1. 새 게임
		 * 2. 결과조회
		 * 3. 프로그램종료
		 * 메뉴선택 : 3
		 * 프로그램 종료
		 */

		
		int menu;
		int num1 = 1, num2 = 2; // 1와 2 중에서 랜덤으로 출력
		int num = 2;
		int min = 1, max = 2;
		Scanner scan = new Scanner(System.in);
		do {
		
			// 메뉴출력 : 메소드
			printMenu();
			
			//System.out.print("--메뉴--");
			//System.out.print("1.성적수정");
			//System.out.print("2.성적조회");
			//System.out.print("3.프로그램 종료");
			//System.out.print("메뉴선택 : ");
		
			// 메뉴선택
			menu = scan.nextInt();
			System.out.println("---------------");
			// 선택된 메뉴에 따른 기능실행
			switch(menu) {
			case 1:
				// 새 게임 : 메소드
				//boolean result = newGame(); 
				// 랜덤으로 홀 아니면 짝의 수를 생성, 이 때 num1 = 1, num2 = 2
				num = (int)(Math.random()*(max - min + 1) + min);
				System.out.println("번호" + " = ");
				System.out.println("번호 입력 = ");
				break;
			case 2:
				// 기록확인 : 메소드
				//printRecord(win, lose);
				break;
			case 3:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("잘못된 메뉴선택");
			}
		}while(menu != 3);
		scan.close();
	}
	/* 배열의 기능 	: 메뉴를 출력하는 메소드
	 * 매개변수 	: none
	 * 리턴타입	: void
	 * 메소드명	: printMenu
	 */
	
	// 반복문 : 프로그램 종료를 선택 전까지 반복
	public static void printMenu() {
		System.out.print("--메뉴--");
		System.out.print("1.새 게임");
		System.out.print("2.결과 조회");
		System.out.print("3.프로그램 종료");
		System.out.print("메뉴선택 : ");
		
		
		
		
		
	}

}
