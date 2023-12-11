package day02;

import java.util.Scanner;

public class TestEx4 {

	public static void main(String[] args) {
		/* 성인판별 예제
		 * 나이를 입력받아 나이가 20세 이상이면 성인으로 출력하고,
		 * 20세 미만이면 미성년자로 출력하는 코드 작성
		 */
		
	Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("입력받은 나이 : " + age);
		
		if(age == 0) {
			System.out.println(0);
		}else if(age >= 19) {
			System.out.println(age + " 성인입니다.");
		}else {
				System.out.println(age + " 성인이 아닙이다.");
			}
		
		
		scan.close();
	}

}
