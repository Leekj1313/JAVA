package Day14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LottoEx1Collection {

	public static void main(String[] args) {
		/* 랜덤으로 당첨번호를 생성하고, 사용자가 로또 번호를 입력하면 등수를 알려주는 코드를 작성하시오
		 * 단, 컬랙션을 이용
		 * 당첨번호 6개, 보너스 1개
		 * 사용자 6개
		 */
		
		// 중복되지 않은 여섯개의 수 => set 은 6개의 번호를 생성 후 보너스 번호를 따로 생성해줘야 함 
		Set<Integer>set = new HashSet<Integer>();
		// 1~45 사이의 수
		int min = 1, max = 45;
		
		while(set.size() < 6) {
			Random random = new Random();
			int tmp = random.nextInt(max = min + 1) + min;
			set.add(tmp);
		}
		System.out.println(set);
		
		// 랜덤으로 생성되는 6개의 숫자를 contains 와 indexOf 를 이용하여
		
		// 랜덤으로 출력된 숫자와 사용자가 입력한 숫자를 비교
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		int count = 6;
		
		System.out.println("번호를 입력하세요 : ");
		
		for(int i = 0; i<count; i++) {
			
			int tmp = scan.nextInt();
			
			list.add(tmp);
		}
		
		for(int tmp : list) {
			System.out.println(tmp);
		}
		
		// 당첨인지 꽝인지를 비교
		
		// 당첨이면 당첨을 출력하거나
		
		// 꽝을 출력

	}

}
