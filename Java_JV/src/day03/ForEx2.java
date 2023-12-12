package day03;

public class ForEx2 {

	public static void main(String[] args) {
		/* 1에서 10사이의 짝수들의 합을 구하는 코드를 작성
		 * 반복횟수	: i는 1부터 10까지 1씩 증가
		 * 규칙성		: i를 2로 나누었을 때 나머지가 0과 같다면
		 * 				sum = sum + i 를 실행
		 * 반복종료후	: sum을 출력
		 */
		
		// i는 2씩 증가 10이하
		
		int sum = 0;
		// 초기호에 i를 선언하면 i는 반복문 밖에서 사용할 수 없다. 사용하려면 재선언을 해야 람
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
		}
			System.out.println("1부터 10까지의 짝수의 합 : " + sum);
		}
}
