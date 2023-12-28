package day06;

import java.util.Scanner;

public class AreithmeticEx1 {

	public static void main(String[] args) {
		/* 랜덤으로 산수(+,-,*) 문제를 맞추는 게임
		 * 단, 숫자 범위는 1~99
		 * 1 + 2 = 3		=> 3가지의 랜덤 수가 필요
		 * 정답입니다
		 * 2 * 3 = 5
		 * 오답입니다
		 */
		
		// 랜덤으로 생성되는 num1, num2, num3 
		// 범위는 1~99까지
		// 연산자는 + - * 중 랜덤으로 생성
		// 유저의 답 제출
		// 답안 체크 정답이면 정답처리, 오답이면 오답처리
		
		//int min = 1, max = 99;
	 
		//System.out.println( "r1" + "r2" + "r3" + " = ");
		
		//int num1 = (int)(Math.random()*(max - min + 1) + min);
		//r2 = (int)(Math.random()*(max - min + 1) + min); - 연산자의 랜덤 
		// 												  => 랜덤으로 생성하지 않고 + - * 고정 후 각각의 경우를 출력
		//int num2 = (int)(Math.random()*(max - min + 1) + min);
		
		
		// 랜덤으로 생성되는 수와 연산자에 따른 식 출력
		//System.out.println( "r1 " + " + " + " r3 " + " = ");
		//System.out.println( "r1 " + " - " + " r3 " + " = ");
		//System.out.println( "r1 " + " * " + " r3 " + " = ");
		
		// Scanner scan = new Scanner(System in);
		// 유저의 답을 콘솔에 입력
		//num user = scan.nextInt();
		
		// if(r1 == user) { 
				// System.out.println("정답입니다.");
		// }else {
				// System.out.println("오답입니다.");
		
		/* 정수1를 랜덤으로 생성 1~99
		 * 정수2를 랜덤으로 생성 1~99
		 * 정수3를 (연산자)랜덤으로 생성 1~3
		 */
		
		// 얀산자가 1이면
			
			// 정수1 + 정수2 = 을 콘솔에 출력
		
		// 정답을 입력
		
					// 입력받은 정답과 정수1+정수2가 같으면 정답이라고 출력
				
					// 오답출력
				
				// 얀산자가 2이면
				
							// 정수1 + 정수2 = 을 콘솔에 출력
							
							// 정답을 입력
							
							// 입력받은 정답과 정수1+정수2가 같으면 정답이라고 출력
						
							// 오답출력
				
				// 얀산자가 3이면
				
							// 정수1 + 정수2 = 을 콘솔에 출력
							
							// 정답을 입력
							
							// 입력받은 정답과 정수1+정수2가 같으면 정답이라고 출력
						
							// 오답출력
		
		int min = 1, max = 99;
		int num1 = (int)(Math.random()*(max - min + 1) + min);
		int num2 = (int)(Math.random()*(max - min + 1) + min);
		int op + (int)(Math.random()*3+1);
		
		Scanner scan = new Scanner(System.in);
		
		int user, answer;
		
		switch(op) {
		
		case 1:
			System.out.print(num1 + " + " + num2 + " = ");
			user = scan.nextInt();
			
			answer = num1 + num2;
			if(user == answer) { 
				System.out.println("정답입니다.");
			}
		break;
		
		case 2:
			System.out.print(num1 + " - " + num2 + " = ");
			user = scan.nextInt();	
			
			answer = num1 - num2;
			if(user == answer) { 
				System.out.println("정답입니다.");
			}
		break;
		
		case 3:
			System.out.print(num1 + " * " + num2 + " = ");
			user = scan.nextInt();	
			
			answer = num1 * num2;
			if(user == answer) { 
				System.out.println("정답입니다.");
			}
		break;
		}

	}

}
