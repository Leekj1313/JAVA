package day03;
import java.util.Scanner;

public class SwitchEx4 {

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
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("두 정수와 연산자 입력 ( 예1: 1 + 2 ) :");
			int num1 = scan.nextInt();
			char operator = scan.next().charAt(0);
			int num2 = scan.nextInt();
			
			switch(operator) {
			case '+' :
				System.out.println("" + num1 + operator + num2 + " = " + (num1 + num2));
				break;
			}
			case '-' :
				System.out.println("" + num1 + operator + num2 + " = " + (num1 - num2));
				break;
			}	
			case '*' :
				System.out.println("" + num1 + operator + num2 + " = " + (num1 * num2));
				break;
			}
			default:
				System.out.println(operator + "는 산술 연산자가 아닙니다.");
			
		
		}
	}
}

