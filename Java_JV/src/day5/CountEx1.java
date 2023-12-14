package day5;

import java.util.Scanner;

public class CountEx1 {

	public static void main(String[] args) {
		/* 1에서 9 사이의 정수를 10개 입력받아 각 숫자가 몇개씩 입력 됐는지 출력하는 코드를 작성하시오
		 * 1 2 3 1 2
		 * 1 : 2
		 * 2 : 2
		 * 3 : 1
		 * 4 : 0
		 * 5 : 0
		 * 6 : 0
		 * 7 : 0
		 * 8 : 0
		 * 9 : 0
		 */
		// 5개의 배열(입력한 수를 저장하는 배열 - user)과 10개의 배열(각 숫자가 몇개 입력됐는지 저장하는 배열 - count) 선언
		
		// 반복문으로 5개의 정수를 입력 받아 user에 저장하고, count 배열에 입력받은 정수번지에 해당하는 숫자를 1증가
		
		// count 배열에 있는 값을 1번지 부터 9번지 까지 출력
		
		//int user  [] = new int [5];
		//int count [] = new int [10];
		
		//Scanner scan = new Scanner(System.in);
			//System.out.print("정수 5개를 입력하세요 1~9사이 : ");
		
		//for(int i = 0; i < user.length; i++) {
			//user[i] = scan.nextInt();
			//count[user[i]]++;
			
		//for(int i = 1; i<count.length; i++) {
			//System.out.println(i + " : " + count[i]);

		//정수를 입력하여 num에 저장
		
		//tmp에 num을 복사
		
		//10개 짜리 배열 arr를 선언 
		
		//반복문(tmp가 0이 아닐때까지)
		
			//tmp를 10으로 나눈 나머지를 배열에 저장 : cont 번지에 저장
		
			//count를 1증가
		
			// tmp를 10으로 나눈 값을 tmp에 저장
		
		//반복문을 이용하여 arr에 값을 0번지부터 count 수 만큼 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력하새요 : ");
		int num = scan.nextInt();
		
		int tmp = num;
		int [] arr = new int[10];
		int count = 0;
		
		while(tmp != 0) {
			arr[count] = tmp % 10;
			count++;
			tmp = tmp / 10; // tmp /=10;
			System.out.print("결과 : ");
		for(int i = 0; i < count; i++ ) {
			System.out.print(arr[i]);
		scan.close();
			
		
	}
		}
		}
		
	}

