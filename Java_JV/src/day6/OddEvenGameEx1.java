package day6;

import java.util.Scanner;

public class OddEvenGameEx1 {

	public static void main(String[] args) {
		// 정수 num 가 주어졌을 때 홀수인지 짝수인지 판별하는 예제
		
		int num = 10; 
		
		// num 가 1~10 사이의 랜덤한 수를 생성하는 코드
		int min = 1, max = 100;
		Scanner scan = new Scanner(System.in);
		int totalMoney = 10000; // 게임 시작시 주어지는 금액
		
		// 아래 코드를 현재 금액이 0이 될 때까지 반복하도록 수정
		
		while(totalMoney > 0) {
			
		
			num = (int)(Math.random()*(max - min + 1) + min);
			
			// 사용자가 게임에 투입할 금액을 입력하는 코드를 작성
			System.out.print("배팅금액 (1~ " + totalMoney+") : ");
			int money = scan.nextInt();
			
			// 입력받은 money가 totalmoney 보다 크면 totalmoney로 수정
			//money = money > totalMoney ? totalMoney : money; 한줄로 정리 가능
			if(money > totalMoney) {
				money = totalMoney;
			}
			
			System.out.print(" 홀(1)/짝(0)?");
			int user = scan.nextInt();
			
			
			if(num % 2 ==0) { 
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
			// 사용자가 입력한 값이 맞았는지 틀렸는지 출력하는 코드를 작성
			// 사용자가 입력한값이 num의 홀짝과 맞는지를 출력하는 코드
			// 승이면 배팅 금액을 주고, 패 라면 배팅 금액을 차감
			if(user == num % 2) {
				System.out.println("승");
				totalMoney += money; 
			}else {
				System.out.println("패");
				totalMoney -= money; 
			}
			// 사용자가 승일 때 배팅금액 출
			// 패이면 배팅금액에서 차감
			
			System.out.println("현재금액 : " + totalMoney);
		
		System.out.println("잔액부족으로 게임종료");
		scan.close();
			// 구현순서를 단계별로 처음에는 힌트 없이 구현하는 연습
		

	}

}
}
