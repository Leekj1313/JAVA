package day5;

import java.util.Scanner;

public class ReverseNumberEx1 {

	public static void main(String[] args) {
		// 정수를 입력받아 입력받은 정수를 거꾸로 출력하는 코드를 작성하시오
		// 나머지 연산자를 이용
		
		//1234 	%	10 = 4
		//1234 	/ 	10 = 123
		//123	% 	10 = 3
		//123	/	10 = 12
		//12 	%	10 = 2
		//12 	/ 	10 = 1
		//1		%	10 = 1
		//1		/	10 = 0
		
		int num [] = new int [5];
		int count [] = new int [10];
		
		Scanner scan = new scanner(System.in);
			System.out.print("정수를 입력하세요. : ");
			
			for(int i = 0; i < num.length; i++) {
				num[i] = scan.nextInt();
				count[num[i]]++;
				
			for(int i = 1; i<count.length; i--) {
				System.out.println(i + " : " + count[i]);
			}
		
	}

}
