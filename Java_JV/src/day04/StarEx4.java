package day04;

public class StarEx4 {

	public static void main(String[] args) {
		/*			*			1	-2				4
		 * 		   ***			3	-2				3
		 *        *****			5	-2				2
		 *       *******		7	-2				1	
		 *      *********		9 	-2	2*i-1		0 	
		 *                 
		 */
		
		int row = 5;
		for(int i = 1 ; i <= 5; i++) {
			// ' ' 출력 5-1 개
			
			// * 출력 2*i-1
			for(int j = 1; j <= row-i; j++) {
				
		System.out.print(' ');
		}
				for(int j = 1; j <= 2*i-1; j++) {
					System.out.print("*");
		}
			
		System.out.println();
		
		}
	
	}
		
}
