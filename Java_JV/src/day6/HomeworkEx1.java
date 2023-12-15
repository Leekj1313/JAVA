package day6;

public class HomeworkEx1 {

	public static void main(String[] args) {
		/* 숫자 야구게임을 구현하시오
		 * 1~9사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임
		 * S = 숫자가 있고, 위치가 같은 경우
		 * B = 숫자가 있지만 위치가 다른 경우
		 * O = 일차하는 수가 하나도 없는 경우
		 * 3S 가 되면 게임이 종료
		 * 
		 * 예시
		 * 랜덤으로 생성된 숫자 : 3 9 1
		 * 입력 : 1 2 3
		 * 결과 : 2B
		 * 입력 : 4 5 6
		 * 결과 : O
		 * 입력 : 7 9 8 
		 * 결과 : 1S
		 * 입력 : 3 1 9
		 * 결과 : 1S2B
		 * 입력 : 3 9 1
		 * 결과 : 3S
		 * 정답입니다
		 */
		
		// 게임메뉴를 생성
		int menu;
		// 랜덤한 수는 1~9까지 범위
		int min = 1, max = 9;
		// 3개의 배열을 만들어 숫자를 랜덤으로 생성
		int base[] = new int[3];
		int count = 0;
		int i;
		int r = (int)(Math.random() * (max - min + 1) + min)
		int user;
		Scanner scan = new Scanner(System.in);
		
		do {
			// 메인 메뉴출력
				System.out.print("야구게임");
				System.out.print("1.게임시작");
				//System.out.print("2.순위조회");
				System.out.print("3.프로그램 종료");
				System.out.print("메뉴선택 : ");
			// 메뉴선택
				menu = scan.nextInt();
			// 1.게임시작을 선택
				
			// 반복문 = s가 3번 나올 때 까지 게임진행
			while(count < tmp.length) {
				int r = (int)(Math.random() * (max - min + 1) + min);
				int i;
					for(i = 0; i < count; i++) {
						if(r == tmp[i]) {
							break;
						}
					}
				
				
				
				
			switch(menu) {
			case 1 :
				//게임시작
				System.out.println("게임을 시작합니다.");
				// 1부터 9까지의 랜덤한 수를 생성, 이때 배열을 이용하여 3개의 숫자를 출력
				while(count < base.length)	{
				int r = (int)(Math.random()*(max-min+1);
				System.out.print(랜덤한 숫자);
				//사용자의 숫자 입력
				int user = scan.nextInt();
				//if (숫자가 있고 위치도 맞는 경우) {
				
				//	 	System.out.println("Strike");		
				
				//else if (숫자가 있지만 위치가 다른 경우) {
				
				//		System.out.println("Boll");		
				
				//else 일치하는 수가 없는 경우) {
				
				//      System.out.println("Out");
			
				// while S가 3번 나올 때까지 반복 후 
				
				// S가 3번 나오면 게임종료
				
				
				
		

	}

}
