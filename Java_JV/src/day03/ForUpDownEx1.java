package day03;

import java.util.Scanner;

 public class ForUpDownEx1 {

	public static void main(String[] args) {
		/* 숫자 업다운 게임 작성
		 * 랜덤으로 생성된 숫자를 맞추는 게임
		 * 예시
		 * 랜덤으로 생성되는 숫자 : 30
		 * 정수 : 50
		 * Dawn!
		 * 점수 :20
		 * Up!
		 * 정수 30
		 * 정답!
		 */
		
		/* 랜덤한 수 생성 처음 한 번
		 * 반복문
		 * 정수 입력
		 * 정수와 랜덤한 수를 비교 후 결과를 출력
		 */
		
		int min = 1, max = 100;
		int r = (int)(Math.random() * (max-min+1) + min);
				System.out.println("랜덤 : " + r);
		Scanner scan = new Scanner(System.in);
		int num = min - 1;
		for( ; num != r; ) {
			System.out.println("입력 : ");
			num = scan.nextInt();
			if(num > r) {
				System.out.println("down");
			}else if(num < r) {
				System.out.println("up");
			}else{
					System.out.println("정답");
				}
		
			
		scan.close();
		
	}
		}
}

