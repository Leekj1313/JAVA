package day5;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 학생 5명의 국어 성적을 저장하기 위한 배열
		
		//int kor1, kor2, kor3, kor4, kor5
		
		Scanner scan = new Scanner(System.in);
		
		int [] korscore = new int[5];
		
		//korscore[1] = scan.nextInt();
		//korscore[2] = scan.nextInt();
		//korscore[3] = scan.nextInt();
		//korscore[4] = scan.nextInt();
		// 아래 반복문은 변수명에 숫자가 들어가서 i로 
		for(int i = 0; i <= 4; i++) {
			System.out.print("학생" + (i+1) + " 성적 : ");
			korscore[0] = scan.nextInt();
		}
		for(int i = 0; i <= 4; i++) {
			System.out.println("학생" + (i+1) + " 성적 : " + korscore[i]);
			
		scan.closs();
	}

}
	
}
