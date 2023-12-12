package day03;

public class WhileMultipleTableEx1 {

	public static void main(String[] args) {
		/* 구구단 2단을 출력하는 코드를 작성
		 * 반복횟수       : i는 1부터 9까지 1씩 증가
		 * 규칙성        : 2 X i = 2*1 출력
		 * 반복종료후     : 없음
		 */
		
		int num = 2;
		int i = 1;
		while(i <= 9) {
		System.out.println(num + " X " + i + " = " + num*i);
		++i;
		}
	}

}
