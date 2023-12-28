package day04;

import java.util.Scanner;

public class InfiniteLoopEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		// 무한 루프 예제1 : 조건식을 참으로 만들어서 무한루프 발생
		
		while(true) {
			System.out.print("정수입력 : ");
			int num = scan.nextInt();
			System.out.print("정수출력 : " + num);
		}
		// 무한루프가 100% 발생하는 코드 아래에 
	}

}
