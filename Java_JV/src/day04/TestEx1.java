package day04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* Scanner 를 이용하여 국어,영어,수학 성적을 입력받고
		 * 총점과 평균을 구하는 코드를 작성히시오.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print(" 점수입력 : ");
				
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
				
			int sum = kor + eng + math;
			double avg = sum / 3.0;
				
			System.out.print(총점 : " + sum + ", 평균 : " + avg ");
			
		scan.close();
				
				
				
				
	}

}
