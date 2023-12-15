package day6;

import java.util.Scanner;

public class AreithmeticEx1Copy {

	public static void main(String[] args) {
		
		int min = 1, max = 99;
		int num1 = (int)(Math.random()*(max - min + 1) + min);
		int num2 = (int)(Math.random()*(max - min + 1) + min);
		int op + (int)(Math.random() * 3);
		
		Scanner scan = new Scanner(System.in);
		
		int user, answer = 0;
		String st = "+-*";
		char op = str.charAt(opNum);
		
		System.out.print("" + num1 + op + num2 + " = ");
		user = scan.nextInt();
		
	switch(op) {
		
	case '+':
			answer = num1 + num2;
		break;
		
	case '-':
			answer = num1 - num2;
		break;
		
	case '*':
			answer = num1 * num2;
		break;
			
		default:
			System.out.println("잘못되었습니다.");
		}
		
	}
}	
		
		
	