package day05;

public class RandomArrayEx1 {

	public static void main(String[] args) {
		/* 1~9사이의 랜덤한 수를 3개 정렬해서 배열애 저장하는 코드를 작성
		 * 3개 배열을 생성하여 랜덤한 수를 저장
		 */
		
		// 범위는 1~9, 랜덤생성 = 3개의 수, 정렬 = 3개의 배열 생성
		
		int  min = 1, max = 9;
		
		int r1 = (int)(Math.random()*(max-min+1) + min);
			System.out.println("랜덤 : "+ r1);
		int r2 = (int)(Math.random()*(max-min+1) + min);
			System.out.println("랜덤 : "+ r2);
		int r3 = (int)(Math.random()*(max-min+1) + min);
			System.out.println("랜덤 : "+ r3);
			
		// 랜덤한 수가 겹치면 안됨
			
		// 3개의 수를 정렬
			
			int arr[] = new int[] {r1,r2,r3};
			for(int i = 0; i<arr.length - 1; i++) {
				
				
			}
	}

}
