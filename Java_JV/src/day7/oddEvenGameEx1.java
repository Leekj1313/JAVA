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
		int win = 0, lose = 0;
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
				boolean result = newGame(); 
				if(result) {
					System.out.print("승");
					win++;
				}else 
					System.out.print("패");
				lose++;
				}
				// 랜덤으로 홀 아니면 짝의 수를 생성, 이 때 num1 = 1, num2 = 2
				printRecord;
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
	/* 기능 : 랜덤으로 숫자를 생섯하고, 정수 홀 짝을 입력받아
	 * 		맞추고 승패를 알려주는 메소드
	 * 매개변수 	: none
	 * 리턴타입	: boolean 숭 또는 패 승은 참 패는 거짓
	 * 메소드명	: newGame
	 */
	public static boolean newGame() {
		// 랜덤으로 정수를 생서
		int r = random(1,100);
		// 정수를 입력받음(0,1)
		Scanner scan = new Scanner(System.in);
		System.out.print("선탣(홀:1, 짝0) : ");
		int user = scan.nextInt();
		System.out.print(r + " " + (r%2==0?"짝":"홀") + "입니다." );
		// 판별
		return r % 2 == user;
	}
	/* 기능 : 승 횟수와 해 횟수가 주어지면 a승 b패로 출력하는 메소드
	 * 매개변수 	: none
	 * 리턴타입	: void
	 * 메소드명	: printRecord
	 */
	public static void printRecord(int win, int lose) {
		System.out.print(win + "승 " + lose + "패");
	}
	public static int random (int min, int max) {
		if(max < min) {
			int tmp = max;
				max = min;
				min = tmp;
		}
		return (int)(Math.random() * (max - min + 1) + min);
	}
}
	
	
	
	
	
	
	
