package day03;

public class WhileTestEx1 {

	public static void main(String[] args) {
		/* 1부터 5까지 출력되는 코드를 작성
		 * 
		 */
		/*int i = 1;
		 * System.out.println(i);
		   ++i;
		   System.out.println(i);
		   ++i;
		 */
		/* 반복횟수       : i가 1부터 5까지 1씩 증가
		 * 규칙성         : i룰 콘솔에 출력
		 * 반복문 종료후
		 */
		int i = 1;
		int count = 5;
		while(i <= count) {
			System.out.println(i);
			++i;
		}
	
	}

}
