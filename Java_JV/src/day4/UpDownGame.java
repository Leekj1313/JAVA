package day4;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		/* Up Down 게임을 구현하시오
		 * 다음과 같은 메뉴를 설정하시오
		 * 1. 새 게임
		 * 2. 최고기록
		 * 3. 프로그램 종료
		 * 
		 * - 새 게임은 업다운을 시작
		 * 	- 랜덤으로 생성된 수를 맞추는 게임
		 * 	- 맞췄을 때 맞춘 횟수를 출력하고 메뉴로 돌아감
		 * - 최고기록 확인 업다운 게임을 하면서 맞춘 횟수 중 가장 적은 횟수를 가르쳐줌
		 */
		
		// 숫자의 범위를 설정 - 출력창을 설정 - 업다운 숫자를 랜덤으로 생성 - 입력창 출력 - 정답 확인 - 메뉴로 돌아감 - 최고기록 확인 - 가장적은 횟수 확인
		// 1. 메뉴를 출력 2. 메뉴를 선택 3. 선택한 메뉴에 따라 기능을 실행
		// 1) 메뉴선택 - 게임실행
				//랜덤한 수 생성
				//반복문
					//정수입력 - 입력횟수를 1증가
					//입력한 정수와 랜덤한 수 비교 후 업다운, 정답 출력
				// 게임이 끝났으면 현재 횟수가 최고기록 횟수보다 좋으면
				// 최고 기록횟수를 현재 횟수로 수정
		// 2) 메뉴선택 - 최고기록을 출력
				//최고 기록을 출력
		// 3) 메뉴선택 - 프로그램 종료
		
		
		
		
		Scanner scan = new Scanner(System.in);
		int menu;
		int count, bestCount = -1;
	
		do {
			System.out.println("메뉴");
			System.out.println("1. 새 게임");
			System.out.println("2. 최고기록 확인");
			System.out.println("3. 프로그램 종료");
			System.out.println("4. 메뉴선택 : ");
			menu = scan.nextInt();
			while(menu != 1);
				System.out.println("게임을 시작합니다.");
			int  min = 1, max = 100;
			int random = (int)(Math.random()*(max-min+1) + min);
				System.out.println("랜덤 : "+ random);
				
			int num = min -1;
			for(; num != random;) {
				System.out.println("입력 : ");
				num = scan.nextInt();
			}
				if(num>random) {
					System.out.println("Down!");
				}else if(num<random) {
					System.out.println("Up!");
				}else {
					System.out.println("정답!");
				}while(menu != 2);
				System.out.println("최고기록 :" + bestCount);
				// 최고기록을 기록하는 
		// 메뉴로 돌아가기
		// 2,3번 메뉴 선택
			
		}while(menu != 3);
			System.out.println("프로그램을 종료합니다.");
		
	
		
	scan.close();
			
			
			
	}
	

}
