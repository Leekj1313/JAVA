package Day14;

import java.text.MessageFormat;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArithmeticExceptionEx1 {

	public static void main(String[] args) {
		// 두 정수와 산술연산자를 입력받아 산술연산하는 코드를 작성하시오
		// 단, 0으로 나눌 때 예외처리를 적용
	
		System.out.println("두 정수와 산술 연산자를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		char op = scan.next().charAt(0);
		double res = 0;
		
		switch(op) {
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 * num2; break;
		case '/' : res = num1 / num2; break;
		case '%' : res = num1 % num2; break;
		}
		String pattern = "{0} {1} {2} = {3}";
		System.out.println(MessageFormat.format(pattern, num1, op, num2, res));
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(InputMismatchException e) {
			System.out.println("입력을 잘 못하였습니다.");
		}

}

