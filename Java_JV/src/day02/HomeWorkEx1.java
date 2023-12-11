package day02;

import java.util.Scanner;

public class HomeWorkEx1 {

	public static void main(String[] args) {
		/* 성적을 입략받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90점 이상 ~ 100점 이하 : A
		 * 80점 이상 ~ 90점 미만 : B
		 * 70점 이상 ~ 80점 미만 : C
		 * 60점 이상 ~ 70점 미만 : D
		 * 60점 미만 : F
		 * 0보다 작거나 100보다 큰 경우 : 잘못된 점수
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println("입력받은 점수 : " + num);
		
		if(num < 0 || num > 100) {
		System.out.println(num + " 점수가 잘못 되었습니다.");
		}
		
		else if(num >= 90 && num <= 100 ) {
		System.out.println("A");
		}
		else if(num >= 80 && num <= 90 ) {
		System.out.println("B");
		}
		else if(num >= 70 && num <= 80 ) {
		System.out.println("C");
		}
		else if(num >= 60 && num <= 70 ) {
		System.out.println("D");
		}
		else if(num < 60 ) {
		System.out.println("F");
		}
		
		scan.close();

		
	}

}
