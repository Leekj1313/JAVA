package day7;

public class MathodEx2 {

	public static void main(String[] args) {
		
		int num1 = 10, num2 = 20;
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
		
		int [] arr1	= {1,2,3,4,5};
		int [] arr2 = {10,20,30,40,50};
		
		System.out.print("arr1 = ");
		printArray(arr1);
		System.out.print(", arr2 = ");
		printArray(arr2);
		
		swap2(arr1, arr2);
		
		/* 매개변수가 기본형 변수인 경우와 참조형 변수인 경우의 차이를 보여주는 예제
		 * 매개변수가 비본자료형이면 메소드 안에서 값이 바뀌어도 원본은 안 바뀜
		 * 
		 */
		
		/* 기능		: 정수 배열을 콘솔에 한 줄로 출력하는 메소드
		 * 매대변수	: 출력하려는 정수 배열 => int []arr
		 * 리턴타입	: 없음 => void
		 * 메소드명	: printArray
		 */
		
		public static void printArray(int []arr) {
			for(int tmp : arr) {
				System.out.print(tmp + " ");
			}
		
		/* 기능		: 두 정수를 바꾸는 메소드
		 * 매대변수	: 바꿀 두 정수 => int num1, int num2
		 * 리턴타입	: 없음 => void
		 * 메소드명	: swap1
		 */
		
		public static void swap1(int num1, int num2) {
			int tmp  = num1;
				num1 = num2;
				num2 = tmp;
		}
		
		/* 기능		: 두 정수배열을 바꾸는 메소드
		 * 매대변수	: 바꿀 두 정수 => int []arr1, int {}arr2
		 * 리턴타입	: 없음 => void
		 * 메소드명	: swap2
		 */ 
		public static void swap2(int []arr1, int []arr2) {
			for(int i = 0; i<arr1.length; i++) {
				int tmp  = num1;
					num1 = num2;
					num2 = tmp;
	}
		
	}}
	}
	
	

}
