package Day14;

public class ExceptionEx2 {

		public static void main(String[] args) {
		
			test();
			
		}
		
		public static void test() {
			int num1 = 1, num2 = 0;
			try {
				System.out.println(num1/ num2);
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없다.");
				return;
			} // 위에서 예외가 발생해서 처리하고, return 을 통해 빠져나가도 실행
			finally {
				System.out.println("finally 실행");
			} // 위에서 return 이 없으면 빠져나가지 않음
			System.out.println("매서드 종료");
		}
		
		
}
