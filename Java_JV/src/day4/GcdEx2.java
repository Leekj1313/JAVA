package day4;

public class GcdEx2 {

	public static void main(String[] args) {
		/* 두 정수의 공약수를 출력하는 코드를 작성하시오
		 * 약수	: 나누어서 떨어지는 수
		 * 공약수	: 공통으로 있는 약수
		 * 12의 약수	: 1,2,3,4,6,12
		 * 8의 약수	: 1,2,4,8
		 * 8과 12의 공약수	: 1,2,4
		 * 반복횟수		: i는 1부터 num1까지
		 * 규칙성			: i가 num1의 약수이고, i가 num2의 약수이면 i를 출력
		 * 				=> num1을 i로 나누었을 때 나머지가 0과 같고,
		 * 				   num2를 i롸 나누었을 때 나머지가 0과 같다면 i를 출력
		 * 반복문종료문		: 없음
		 */
		
		// 일단 약수를 구해야 함 - 각각의 약수를 먼저 구한 후에 공약수(공통된 수를 출력)
					
		int num1 = 12;
		int num2 = 8;
			System.out.println(num1 + "과 " + num2 + "의 최대공약수");
		for( int i = 1; i <= num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println((i == 1 ? "" : ", ") + i);
		}
	}
}
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
