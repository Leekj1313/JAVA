package day4;

public class MutipleTableEx1 {

	public static void main(String[] args) {
		/* 구구단 2단 부터 9단까지 출력하는 코드를 작성하시오
		 * 반복횟수		: num은 2부터 9까지 1씩 증가
		 * 규칙성 		: num 단을 출력 
		 */
	
		int num1 = 2;
			for(int i = 1; i <= 9; i++) {
				System.out.println(num1 + " X " + i + " = " + num1*i);
		}	
		int num2 = 2; num2 <=9;
				for(int i = 1; i <= 9; i++) {
					System.out.println(num2 + " X " + i + " = " + num2*i);
		}
	
	}
}
