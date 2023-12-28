package day04;


public class StarEx3 {

	public static void main(String[] args) {
		/* ____  *
		 * 		**
		 *     ***
		 *    ****
		 *   *****    
		 */
		int row = 5;
		for(int i = 1 ; i <= 5; i++) {
			// 공백을 출력 5-i
			for(int j = 1; j <= row-i; j++) {
				
		System.out.print(" ");
		}
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
		}
			
		System.out.println();
		
		}
	
	}
	
}
