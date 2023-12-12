package day02;

import java.util.Scanner;

public class HomeWorkEx2 {

	public static void main(String[] args) {
		
		/* 성적을 입략받아 성적에 맞는 학점을 출력하는 코드를 작성하세요.
		 * 90점 이상 ~ 100점 이하 : A
		 * 80점 이상 ~ 90점 미만 : B
		 * 70점 이상 ~ 80점 미만 : C
		 * 60점 이상 ~ 70점 미만 : D
		 * 60점 미만 : F
		 * 0보다 작거나 100보다 큰 경우 : 잘못된 점수
		 */
		
		// 1순위 성적을 콘솔에서 입력 받아야 한다.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("성적 입력 (0~100) : ");
		int score = scan.nextInt();
		
		// 성적을 기준으로 학점을 출력
		// 성적이 90점 이상이고 성적이 100점 이하(이면)IF A학점 출력
		
		if(score >= 90 && score <= 100) {
			System.out.println(score + " 점은 A ");
		}
		// 성적이 80점 이상이고 성적이 90점 미만이면 A학점 출력
		// else if 동시에 만족할 수 없는 경우 위의 경우가 거짓이 되어야 할 경우
		else if(score >= 80 && score <= 90) {
		System.out.println(score + " 점은 B ");
		}
		else if(score >= 70 && score <= 80) {
		System.out.println(score + " 점은 C ");
		}
		else if(score >= 60 && score <= 70) {
		System.out.println(score + " 점은 D ");
		}
		else if(score >= 0 && score < 60) {
		System.out.println(score + " 점은 F ");
		}
		else {
		System.out.println("잘못된 점수");
		}
		
		if(score < 0 || score > 100) {
		System.out.println(score + " 점수가 잘못 되었습니다.");
		}
		else if(score >= 90 && score <= 100 ) {
		System.out.println("A");
		}
		else if(score >= 80 && score <= 90 ) {
		System.out.println("B");
		}
		else if(score >= 70 && score <= 80 ) {
		System.out.println("C");
		}
		else if(score >= 60 && score <= 70 ) {
		System.out.println("D");
		}
		else {
		System.out.println("F");
		}
			
		scan.close();
		
		
		
		
		
		
	}

}
