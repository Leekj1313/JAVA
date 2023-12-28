package Day14;

import java.security.PublicKey;
import java.util.Scanner;

public class ArithmeticExceptionEx2 {

	private static Scanner scan;
	public static void main(String[] args) {
		// 두 정수와 산술연산자를 입력받아 결과를 출력하는 메서드를 구현하시오
		// 단, 메서드를 이용, throws 와 throw 를 이용 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 산술 연산자를 입력하시오 : ");
		printOpr();
		try {
			//printOpr();
		}//catch (Exception e) {
			//System.out.println("에외를 처리했습니다.");
		//}
	public static void printOpr() {
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char op	 = scan.next().charAt(0);
		double res = 0;
		
		switch(op) {
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		case '/' : res = num1 / num2; break;
		case '%' : res = num1 % num2; break;
		}
		

	}

	}

