package day05;

import java.util.Arrays;

public class LottoEx1 {

	public static void main(String[] args) {
		/* 1~45 사이의 랜덤한 수 6개 출력
		 * 단, 정렬이 되도록 출력
		 */
		
		// 1~45까지의 범위를 설정
		int min = 1, max = 45;
		int lotto[] = new int[6];
		// 6개의 숫자를 생성
		int count = 0; // 배열에 저장된 중복되지 않은 수의 개수
		//랜덤한 수 생성
		while(count < lotto.length)	{
			int r = (int)(Math.random()*(max-min+1) + min);
			int i;
		for(i = 0; i <count; i++) {
			if(lotto[i] == r) {
				break;
			}
		}
			if(i == count) {
				lotto[count++] = r;
		}

		}
		Arrays.sort(lotto);
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
}
