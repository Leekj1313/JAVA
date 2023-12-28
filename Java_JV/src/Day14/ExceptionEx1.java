package Day14;

import java.io.ByteArrayInputStream;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int num1 = 1, num2 = 0;
		
		try {
			//ArithmeticException 발생 : 0으로 나누어서
			System.out.println(num1/ num2);
		//catch(RuntimeException e) 은 ArithmeticException e 의 보모격이라 위에 오면 안됨
			
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 번지입니다.");
		}catch(ArithmeticException e) { //RuntimeException 가능
			System.out.println("0으로 나누면 안됩니다.");
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
