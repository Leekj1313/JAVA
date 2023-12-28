package Day14;

import java.security.PublicKey;
import java.text.MessageFormat;
import java.util.Scanner;

public class ArithmeticExceptionEx2 {

	private static Scanner scan;
	public static void main(String[] args) {
		// 두 정수와 산술연산자를 입력받아 결과를 출력하는 메서드를 구현하시오
		// 단, 메서드를 이용, throws 와 throw 를 이용 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 산술 연산자를 입력하시오 : ");
		try {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			char op = scan.next().charAt(0);
			double res = 0;
			String pattern = "{0} {1} {2} = {3}";
			System.out.println(MessageFormat.format(pattern, num1, op, num2, res));
		
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
		public static double double Caculator(int num1, char op, int num2) {
			//throws RumtimeException  // 생략가능 
			switch(op) {
			case '+':	return num1 + num2;
			case '-':	return num1 - num2;
			case '*':	return num1 * num2;
			case '%':	return num1 % num2;
				if(num2 == 0) {
					throw new ArithmeticException("0으로 나눌 수 없습니다.");
				}
				return num1 % num2;
			case '/':	return num1 / (double)num2;
				if(num2 == 0) {
					throw new ArithmeticException("0으로 나눌 수 없습니다.");
			default:
					throw new RuntimeException(op + "는 산술 연산자가 아닙니다.");
					}
			}
		}
		

