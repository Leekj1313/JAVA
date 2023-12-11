package day02;

import java.util.Scanner;

public class Ifmutiple {

	public static void main(String[] args) {
		// 정수를 입력받아 3의 배수인지 아닌지 판별하는 코드 작성
		//정수를 3으로 나누었을 때 나머지가 0과 같다면 3의 배수
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("입력받은 정수 : " + num1);
		
		if(num1 % 3 == 0) {
			System.out.println(num1 + "는 3의 배수");}
		else { 
			System.out.println(num1 + "는 3의 배수가 아님");
			}
		
		scan.close();
		

	}

}
