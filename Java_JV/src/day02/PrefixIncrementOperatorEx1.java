package day02;

public class PrefixIncrementOperatorEx1 {
	//증감 연산자 예제
	public static void main(String[] args) {
		int num1 = 1, num2 = 1;
		// num1은 전위형 증가연산자, num2는 후위형 증가연산자
		System.out.println("증가 전 : num1 = " + num1 + ", num2 = " + num2);
		// num1은 1에서 2로 증가 후에 "증가 중 : num1 ="라는 문자열과 더함
		// unm2는 "증가 중 : num1 = 2, num2 ="라는 문자열과 더한 후에 num2를 증가
		System.out.println("증가 중 : num1 = " + ++num1 + ", num2 = " + num2++);
		System.out.println("증가 후 : num1 = " + num1 + ", num2 = " + num2);
		
		System.out.println("=============================");
		//전위형과 후위형 동작을 전위형 하나로 이용하여 후휘형도 구현
		//나눠서 계산
		num1 = 1;
		num2 = 1;
		System.out.println("증가 전 : num1 = " + num1 + ", num2 = " + num2);
		++num1;
		System.out.println("증가 중 : num1 = " + num1 + ", num2 = " + num2);
		++num2;
		System.out.println("증가 후 : num1 = " + num1 + ", num2 = " + num2);
	}

}
