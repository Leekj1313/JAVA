package day5;

import java.util.Scanner;

public class ArrayScoreEx1 {

	public static void main(String[] args) {
		// 학생 5명의 국어 성적을 입력받고, 총점과 평균을 구하는 코드를 작성하시오
		
		Scanner scan = new Scanner(System.in);
		
		int [] korscore = new int[5];
		
		for(int i = 0; i <= 4; i++) {
			System.out.print("학생" + (i+1) + " 성적 : ");
			korscore[i] = scan.nextInt();
			
			int sum = 0;
			//sum = sum + korscore[0];
			//sum = sum + korscore[1];
			//sum = sum + korscore[2];
			//sum = sum + korscore[3];
			//sum = sum + korscore[4];
		}
		for(int i = 0; i <= 4; i++) {
			sum += korscore[i];
			
			double avg = (double)sum / 5;
			System.out.println("총점 : " + sum + " 평균 : " + avg);
			scan.close();
		}
	
	}

}
