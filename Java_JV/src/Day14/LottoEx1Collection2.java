package Day14;

import java.util.HashSet;
import java.util.Set;

public class LottoEx1Collection2 {

	private static Object scan;

	public static void main(String[] args) {
		/* 랜덤으로 당첨번호를 생성하고, 사용자가 로또 번호를 입력하면 등수를 알려주는 코드를 작성하시오
		 * 단, 컬랙션을 이용
		 * 당첨번호 6개, 보너스 1개
		 * 사용자 6개
		 */
		Set<Integer>lotto = new HashSet<Integer>();
		Set<Integer>user = new HashSet<Integer>();
		int bonus;
		int min = 1, max = 10;
		// 로또 당첨번호 6개를 랜덤으로 생성
		while(lotto.size() < 6) {
			int tmp = (int)(Math.random() * (max- min +1) + min);
			lotto.add(tmp);
		}
		// 보너스 번호를 생성
		while(true) {
			bonus = (int)(Math.random() * (max- min +1) + min);
			if(!lotto.contains(bonus)) {
				break;
			}
		}
		System.out.println(lotto + ", 보녀스 : " + bonus);
		// 사용자가 당첨번호를 입력
		System.out.print( "번호(중복X) : ");
		while(user.size() < 6) {
			int tmp = scan.nextInt();
			user.add(tmp);
		}
		
		int count = 0;
		for(int tmp : user) {
			if(lotto.contains(tmp)) {
				count++;
			}
		}
		switch(count) {
		case 6 :
			System.out.println( "1등 입니다");
		break;
		case 5 :
			int rank = user.contains(bonus) ? 2 : 3; 
			System.out.println( rank + "등 입니다");
		break;
		case 4 :
			System.out.println( "4등 입니다");
		break;
		case 3 :
			System.out.println( "5등 입니다");
		break;
		default:
			System.out.println("꽝");
		
		}
		// 일치하는 개수 계산
		
		// 등수를 출력

	}

}
