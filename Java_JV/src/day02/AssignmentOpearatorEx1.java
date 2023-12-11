package day02;

public class AssignmentOpearatorEx1 {
	//대인 연산자 에제
	public static void main(String[] args) {
		int num1 = 1, num2 = 2;
		num1 = 10; 
		//리터럴 10을 num1 값으로 변경할 수 없기 때문에 에러가 발생
		//10 = num1; 불가 
		System.out.println(num1);
		
		int num3;
		num3 = num1 + num2;
		//num1 + num2 = num3; 불가 왼쪽에는 식이 올 수 없다
		System.out.println(num3);
		
		
	}

}
