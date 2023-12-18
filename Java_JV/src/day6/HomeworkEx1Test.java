package day6;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkEx1Test {

	public static void main(String[] args) {
		/* 숫자 야구게임을 구현하시오
		 * 1~9사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임
		 * S = 숫자가 있고, 위치가 같은 경우
		 * B = 숫자가 있지만 위치가 다른 경우
		 * O = 일차하는 수가 하나도 없는 경우
		 * 3S 가 되면 게임이 종료
		 * 
		 * 예시
		 * 랜덤으로 생성된 숫자 : 3 9 1
		 * 입력 : 1 2 3
		 * 결과 : 2B
		 * 입력 : 4 5 6
		 * 결과 : O
		 * 입력 : 7 9 8 
		 * 결과 : 1S
		 * 입력 : 3 1 9
		 * 결과 : 1S2B
		 * 입력 : 3 9 1
		 * 결과 : 3S
		 * 정답입니다
		 */
		
		// 1. 변수선언
		// 2. 랜덤으로 세자리 숫자 정하기
			// 배열 만킁의 반복문을 돌려서 랜덤한 숫자를 생성 후 중복이 있는지 확인
		
		// 컴퓨터가 랜덤으로 중복되지 않은 숫자 3개를 생성 (1~9) - 반복문 시작전
				int min = 1, max = 9;
				int com[] = new int[3];
				int count = 0;
				// 3개의 숫자를 생성
				int count = 0; 
				String names[] = new int[5];
				// 배열에 저장된 중복되지 않은 수의 개수
				//랜덤한 수 생성
				while(count < com.length)	{
					int r = (int)(Math.random()*(max-min+1) + min);
					int i;
				for(i = 0; i <count; i++) {
					if(com[i] == r) {
						break;
					}
				}
					if(i == count) {
						com[count++] = r;
				for(int i = 0; i<com.length; i++) {
					System.out.print(com[i] + " ");
					System.out.println();
				}
		
				}
				int strike, ball;
				int user [] = new int[com.length];
				// 반복문 : 맞출 때까지 = 스트라이크 3개 미만인 경우 반복
				Scanner scan = new Scanner(System.in);
				do {
				
					// 중복되지 않은 숫자 3개를 입력
					count = 0;
					System.out.print("입력 : ");
					while(count < user.length) {
						int input = scan.nextInt();
						int i;
					for(i = 0; i <count; i++) {
						if(user[i] == input) {
					}
					// 스트라이크와 볼의 갯수를 계산
					strike = 0;
					ball = 0;
					for(int i = 0; i<com.length;i++) {
						for(int j = 0; j<user.length;j++) {
							// 두 수가 같으면
						}
							if(com[i]==j) { // 위치가 같으면
								strike++;
							}else {
								ball++;
							}
						}
					if(strike !=0) {
						System.out.print(strike + "S");
					}
					if(ball !=0) {
						System.out.print(strike + "B");
					}
					if(ball ==0 && strike == 0) {
						System.out.print(strike + "O");
					}
					System.out.println();
					recodCount++;
					
					// 스트라이크와 볼의 갯수에 따른 결과를 출력
				}while(strike < 3); // 초기화를 안 해서 오류
				// 정답입니다. - 출력
				System.out.println("정답입니다.");
				
				
				//기록을 획인하여 등수에 들면 추가
				if(rankCount < 5 || [rankCount-1] > recordCount) {
					recod[4] = recordCount;
					string name = scan.next();// 오름차 순으로 정렬
					rankCount = rankCount < 5 ? rankCount + 1 : rankCount;
					int - index = 0;
					// 현재기록이 들어갈 위치를 찾음
					for(int i = 0; i<rankCount;i++) {
						if(recordCount < recod[i]) {
							index = i
									break;
						}
					}
					// 이전 기록들을 뒤로 한 칸씩 밀어둠
					for(int i = rankCount -1; i > index; i--) {
						record[i] = record[i-1];
						 names[]=names[i-1];
						 names[]
					}
					record[index] = recordCount;
					for(int i = rankCount - 1 ; i > index; i--) {
						
					}
					}
					break;
					// 반복문 : 프로그램 종료 선택 전까지 반복
					int menu;
					int records[] = new int[5];
					int rankCount = 0;
					
					// record를 가장 큰 값으로 초기화
					for(int i = 0; i <record.length;i++) {
						record[i] = Integer.MAX_VALUE;
					}
					do {
						System.out.println("메뉴");
						System.out.println("1.새 게임");
						System.out.println("2.기록확인");
						System.out.println("3.프로그램 종료");
						System.out.println("메뉴선택 : ");
						
						menu = scan.nextInt();
						
						switch(menu) {
						
						case 1 : 
							int min = 1, max = 9;
							int com[] = new int[3];
							int count = 0'
							int recordCount = 0;
							break;
							
						case 2 :
							if(rankCount == 0) {
								System.out.print("기록이 없습니다.");
							}else {
								for(int i = 0; i<rankCpunt; i++) {
									System.out.println(i+1 + "등 : " + record[i]+ "회 - " + names[i]);
								}
							}
							}
							break;

						case 3 :
							System.out.println("프로그램 종료");
							break;

						default:
							System.out.println("잘못된 메뉴 입니다.");
						}
						
						
						
					}while(menu != 3);
					scan.close();
					}

}					// debug 자세히 알아보기
					// 코드 정리 = 알아보기 쉽게
		
			
