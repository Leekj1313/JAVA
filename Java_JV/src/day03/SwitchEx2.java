package day03;

import java.util.Scanner;

public class SwitchEx2 {
	
	//switch 예제
	public static void main(String[] args) {
		// 정수를 입력받아 입력받은 정수의 홀짝 판별 예제를 switch 문을 이용하여 작성
		
		Scanner scan = new Scanner(System.in);
		System.out.print(" 정수입력 : ");
		int num = scan.nextInt();
		/* 입력 받은 정수가 짝수인지 판단
		 * 입력 받은 정수가 홀수인지 판단
		 */
		
		if(num % 2 ==0) {
			System.out.println(num + "는 짝수");
		}else {
			System.out.println(num + "는 홀수");
		}
		// if 문을 이용하여 홀짝 산정
		
		switch(num % 2) {
		case 0: 
			System.out.println(num + "는 짝수");
			break;
		default:
			System.out.println(num + "는 홀수");
		
		
		scan.close();
		}
	}
}