package day5;

import java.util.Arrays;

public class LottoEx2 {

	public static void main(String[] args) {
		/* lotto 번호를 랜덤으로 6자리 생성 후,
		 * user가 lotto 번호를 입력하면 (로또번호 6자리 + 보너스 번호)
		 * user가 lotto 번호를 입력하면 (로또번호 6자리) 당첨 등수를 출력하는 코드를 작성하시오
		 */
		
		/* int min = 1, max = 45; 랜덤으로 나올 숫자의 범위를 제한
		 * int lotto[] = new int[6]; 로또 번호 6개의 생성
		 * 랜덤으로 나온 수의 중복되는지 확인
		 * ---- 보너스 번호
		 * 로또번호를 입력
		 * 당첨등수를 출력 -- 등수를 배열 (등수의 범위)
		 */
		
		// 7개의 배열을 만들어 로또 당첨번호를 랜덤으로 생성 - 1번 배열
		
		// 위에서 생성한 배열 중 0번지부터 6개를 새로운 배열애 복사 - 2번 배열
		
		// 1번 배열 6번지에 있는 값을 보너스로 지정 - 보너스 번호
		
		//2번 배열 정렬 후 출력
		
		// 사용자 번호를 입력해서 배열에 저장 - 3번 배열
		
		// 당첨개수 확인 (이중반복문 사용)
		
		// 당첨개수에 따른 등수를 출력
		Scanner scan = new Scanner(System.in); //사용자의 번호 입력
			
		int min = 1, max = 45
		int lotto[] = new int[6]; //6개의 랜덤 수 생성
		
		
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
			System.out.print(lotto[i] + " "); // 당첨개수를 확인 - 1당첨일 때 2당첨일 때 3당첨일 때 .... 7
		}
	}

}
