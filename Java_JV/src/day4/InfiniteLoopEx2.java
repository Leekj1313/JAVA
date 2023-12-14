package day4;

import java.util.Scanner;

public class InfiniteLoopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 반복문 
		 * while문
		 * 조건식에 따라 한번도 실행되지 않을 수 있다.
		 * while(조건식){
		 			실행문0
		 	}
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		int num;
		// 조건식에 사용하는 변수가 증감하지 않아서 무한루프 발샹하는 에제
		for(int i = 10; i>0;) {
			System.out.print("정수입력 : ");
			num = scan.nextInt();
			System.out.print("정수출력 : " + num);
		}
		//i에 따라 조건식에 true로 될수도 있기 때문에 이 코드가 에러가 발생하지 않음
		System.out.print("프로그램 종료");
		// 위 코드와 차이는 위에서 무한루프이고, 이 코드는 무수히 많이 실행
		// i 가 증가를 하다가 int 양수 표현범위를 넘어가면 오버플로우가 발생하여
		// 음수가 되는데 이때 반복문이 종료
		for(int i = 10; i>0;i++) {
			System.out.print("정수입력 : ");
			num = scan.nextInt();
			System.out.print("정수출력 : " + num);
	}
}
}


	for(int i = 0; i <4; i++) {
		for(int j=3; j > i; j--) {
			System.out.print(" ");
			
		for(int j = 0; j < i * 2 + 1; j++)
			System.out.print("*");
			
			System.out.println(" ");
		}
	}