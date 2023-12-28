package day06;

import java.util.Scanner;

public class AlphabetCountEx1 {

	public static void main(String[] args) {
		/* 단어를 입력받아 단어의 각 알파벳이 몇번 나왔는지 출력하시오
		 * 입력 : apple
		 * a : 1
		 * P : 2
		 * l : 1
		 * e : 1
		 */
		
		// 단어를 입력 받는다
		// Sanner scan = new Scanner
		// Scanner scan = new Scanner(System.in);
		// char eng = nextInt();
			// System.out.println("영단어를 입력하시오 : ");
		// 단어의 갯수를 파악한다
			// 영단어의 갯수를 배열로 파악
		// 단어를 파악한 갯수를 출력한다
			//다시 처음으로 복귀
		
		/* 단어를 입력 = > 문자열을 입력
		 * 반복문으로 문자열릐 길이만큼 반복
		 * 		문자열의 각 문자를 가져옴
		 * 		가져온 문자의 배열 번지에 숫자를 증가
		 * 반복문으로 배열의 크기만큼(26개) 반복
		 * 		갯수가 0이 아닌 알파벳들을 출력
		 */
		
		System.out.println("영단어를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int [] arr = new int[26];
		// 문자열의 각 문자를 가져옴
		for (int i = 0; i < str.length(); i++) { // 가져온 문자의 배열 번지에 숫자를 증가
				char ch = str.charAt(i);
				//System.out.println(ch);
				// 가져온 문자의 배열 번지에 숫자를 증가
				// 가져온 문자의 a이면 0번지에 있는 숫자를 1증가, b이면 1번지에 있는 숫자를 1증가
				// switch(ch) { 	<= 단순반복적인 방법
				///case 'a':		<= 코드가 매우 길어짐
					//arr[]++;		<=
				//break;			<=
				//}					<=
				arr[ch-'a']++;
			}
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0) {
				char ch = (char)('a'+i);
				System.out.println(ch + " : " + arr[i]);
				
			}
		}
		System.out.println("-------------");
		char ch = 'a';
		for(int count : arr); {
			if(count != 0) {
				System.out.println(ch + " : " + count);
			}
			ch++;
		}
		
		//for(int char ch : arr) {
			//System.out.println(count);
	
		
		//String str = "Hello";
		//System.out.println(str.length());
		//System.out.println(str.charAt(0));
	}
}
