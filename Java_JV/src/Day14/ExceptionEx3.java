package Day14;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// throws 와 throw 를 이용한 예외처리
		try {
			printDiv(1,2);
		}catch (Exception e) {
			System.out.println("에외를 처리했습니다.");
		}

	}
	// 두 수룰 나눈 후 결과를 출력하는 매서드
	// throw 를 통해 예외를 발생시킴
	// 발생한 예외가 RuntimeException의 자식 예외이기 때문에 throw 를 생략함
	public static void printDiv(int num1, int num2) {
		if(num2 == 0) {
			throw new ArithmeticException("0으로 나눌 수 없다.");
		}
		System.out.println(num1 / (double)num2);
	}
	public static void printDiv2(int num1, int num2) throws Exception{
		if(num2 == 0) {
			throw new Exception("0으로 나눌 수 없다.");
		}
		System.out.println(num1 / (double)num2);

}
