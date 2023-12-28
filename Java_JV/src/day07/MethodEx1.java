package day07;

public class MethodEx1 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		int result = sum(num1,num2);
			System.out.print(num1 + " + " + num2 + " + " + result);
			// 메소드를 호출할 때는 상황에 맞세 불러와야 한다. 
		
		/* 두 정수의 합을 알려주는 메소드
		 * 매개변수 	: 두 정수  => int num1, int num2
		 * 리턴타입	: 정수의 합 => 정수 => int
		 * 메소드명	: SUM
		 */
		
		public static int sum(int num1, int num2) {
			//구현;
			int result = num1 + num2;
			return result;
		
		}
	}

}
