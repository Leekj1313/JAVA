package day03;

public class WhileTeseEx3 {

	public static void main(String[] args) {
		/* 1에서 10사이의 모든 짝수를 순서대로 출력하는 코드 작성
		 * 2
		 * 4
		 * 6
		 * 8
		 * 10
		 * 
		 * 방법1
		 * 반복횟수 - i는 2부터 2씩증가
		 * 규칙성 - i를 출력
		 * 
		 * 방법2
		 * 반복횟수 - i는 1부터 10까지 1씩 증가
		 * 규칙성 - i가 짝수이면 i를 출력
		 * 
		 * 방법3
		 * 반복횟수 - i는 1부터 5까지 1씩 증가
		 * 규칙성 - 2*i를 출력
		 * 
		 */
		
		//int num = 2;
		//int i = 1;
		//while(i <= 5) {
		//System.out.println(num*i);
		//++i;
		//}
		
		int i;
		//방법1
		int num = 10;
		while(num <= 10) {
		System.out.println(num);
		i = num + 2;
		}
		//방법2
		while(i <= 10) {
			if(i % 2 == 0)
				System.out.println(i);	
		++i;
		}
		//방법3
		while(i <= 5) {
		System.out.println(2*i);
		++i;
		}
}
}
