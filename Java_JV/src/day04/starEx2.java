package day04;

public class starEx2 {

	public static void main(String[] args) {
		/* *			i=1
		 * **			i=2
		 * ***			i=3
		 * ****			i=4
		 * *****		i=5
		 * 
		 *반복횟수		: i는 1부터 5까지 1씩 증가
		 *규칙성 		: *을 ㅑ개 출력 후 엔터
		 *			반복횟수	: j는 1부터 i까지
		 *			규칙성	: *을 출력
		 *			반복문 종료후 : 엔터
		 */
		for(int i = 1 ; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
		}
		System.out.println();
		}
	}

}
