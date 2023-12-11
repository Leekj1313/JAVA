package day02;

import java.util.Scanner;

public class TestEx6 {

	public static void main(String[] args) {
		/* 산술 연산자와 두 정수를 입력받아
		 * 산술 연산자에 맞는 연산결과를 출력하는 코드를 작성하세요.
		 * 예시 1
		 * 두 정수와 연산자 입력 (1 + 2) : 1 + 2
		 * 1 + 2 =3
		 * 예시 2
		 * 두 정수와 연산자 입려 (1 + 2) : 1 / 2
		 * 1 / 2 = 0.5
		 * 두 정수와 연산자 입력 (1 + 2) : 1 ? 2
		 * ?는 산술 연산자가 아닙니다.
		 */
		
		//Scanner scan = new Scanner(System.in);
		
		//System.out.println("숫자를 입력하세요.");
		//int num1 = scan.nextInt();
		//int num2 = scan.nextInt();
		//int num3 = num1 - num2 % scan.nextInt();
		//System.out.println("합산 : " + num3);
		//scan.close();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자 입력 (예: 1+2) :");
		int num1 = scan.nextInt();
		char operator = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		//String str1 = "123";
		//String str2 = new String("123");
		//System.out.println(str1 == str2);
		
		if(operator == '+') {
			System.out.println(num1 + " " + operator + " " + num2 
					+ " = " + (num1 + num2));
		}
		else if(operator == '-') {
			System.out.println(num1 + " " + operator + " " + num2 
					+ " = " + (num1 + num2));
		}
		else if(operator == '*') {
			System.out.println(num1 + " " + operator + " " + num2 
					+ " = " + (num1 + num2));
		}
		else if(operator == '%') {
			System.out.println(num1 + " " + operator + " " + num2 
					+ " = " + (num1 + num2));
		}
		else if(operator == '/') {
			System.out.println(num1 + " " + operator + " " + num2 
					+ " = " + (num1 / (double)num2));
		}else {
			System.out.println(operator + "는 산술 연산자가 아닙니다.");
		} {
			System.out.println(num1 + " " + operator + " " + num2 + " = ");
}
		
		
		scan.close();
		
	}

}
