package day5;

import java.util.Arrays;

public class LottoEx2_answer {

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
		int [] tmp = new int [7];
		int count = 0;
		int min = 1, max = 9;
		while(count < tmp.length) {
			int r = (int)(Math.random() * (max - min + 1) + min);
			
			int i;
			for(i = 0; i < count; i++) {
				if(r == tmp[i]) {
					break;
				}
			}
			if(i == count) {
				tmp[count++] = r;
			}
		}
		// 위에서 생성한 배열 중 0번지부터 6개를 새로운 배열애 복사 - 2번 배열
		int [] lotto = new int [6];
		System.arraycopy(tmp, 0, lotto, 0, 6);
		
		// 1번 배열 6번지에 있는 값을 보너스로 지정 - 보너스 번호
		int bonus = tmp[6];
		
		//2번 배열 정렬 후 출력
		Arrays.sort(lotto);
		System.out.print(" 당첨번호 : ");
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println(" [" + bonus + " ]");
		
		// 사용자 번호를 입력해서 배열에 저장 - 3번 배열
		int [] = new int[6];
		System.out.print("입력번호 :  ");
		for(int i + 0; i <6; i++) {
			user[i] = scan.nextInt();
		}
		// 당첨개수 확인 (이중반복문 사용)
		int sameCount = 0;
		for(int i = 0: i <lotto.length; i++) {
			for(int j = 0; j <user.length; j++) {
				if(lotto[i] == user[j]) {
					sameCount++;
					break;
				}
			}
		}
		// 당첨개수에 따른 등수를 출력
		switch(sameCount) {
		case 1 :
			break;
		case 2 :
			int i;
			// 시용자기 입력한 번호에 보너스와 일치하는 번호가 있는지 확인
			for( i = 0, i<user.length; i++) {
				if(bonus == user[i]) {
					System.out.println("3등");
				}else if {
					System.out.println("2등");
				}
				break;
			}
		case 3 :
			break;
			System.out.println("4등");
		case 4 :
			System.out.println("5등");
			break;
			default :
				System.out.println("꽝! ");
				
		}

	}

}
