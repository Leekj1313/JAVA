package day4;

import java.util.Scanner;

public class RockPaperScissorsEx1 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 가위, 바위, 보 게임 프로그램을 작성하시오
		 * 1. 새 게임
		 * 2. 기록
		 * 3. 프로그램 종료
		 * 
		 *  - 새게임
		 *  	-컴퓨터가 랜덤으로 내는 가위,바위,보 와 내가 입력한 가위,바위,보를 
		 *  	 비교하여 이기면 승, 지면 패, 비기면 무승부로 기록함
		 *  	 바위 = R 보 = P 가위 = S
		 *  -기록
		 *  	- 승부기록을 순서대로 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		int menu;
		
		
		do { // 게임 메뉴를 출력
			System.out.println("입력 : ");
			System.out.println("---------------");
			System.out.println("메뉴");
			System.out.println("1. 새 게임");
			System.out.println("2. 최고기록 확인");
			System.out.println("3. 프로그램 종료");
			System.out.println("---------------");
			System.out.println("4. 메뉴선택 : ");
			
			menu = scan.nextInt();
			int R = 1;
			int P = 2;
			int S = 3;
			int max = 3, min  = 1;
			
			 // R, P, S 승리 조건을 설정 P는 R에 승리. R은 S에 승리, S는 P에 승리
			//		   패배 조건을 설정
		   //          무승부 조건을 설정
			switch(menu) { //게임을 시작
				System.out.println("1. 새 게임");
		
			case 1 : menu = 1;
			System.out.println("게임을 시작합니다.");
			int random = (int)(Math.random()*(max-min+1) + min);
			System.out.println("랜덤 : "+ random);
			count = 0;
			} do
				num = scan.nextInt();
			count++;
			if(num > random) {
				System.out.println("Down!");
			}else if(num < random) {
					System.out.println("Up!");
				}else {
					System.out.println("정답!");
				
			
			
			//while(char != random); // 승패의 기록, 이긴기록, 진 기록, 무승부 기록 
			//if() {
				
			
			break;
			}
			
			case 2
			
			
			case 3 :menu = 3;
				System.out.println("프로그램을 종료합니다.");
			break;
		} 
			while(menu != 3);
		
			
		
	}

}
