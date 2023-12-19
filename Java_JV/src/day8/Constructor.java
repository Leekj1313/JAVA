package day8;

public class Constructor {

	public static void main(String[] args) {
		// 생성자 예제
		//A a = new A(); // 기본 생성자를 호출 => new라는 연산자를 이용하여 초기화릏 할 때 호출, 생성자가 하나도 없을 경우
					     //			    => A클래스에 생성자가 있어서 기본 생성자가 자동으로 추가가 안됨 = 에러발생 

		A a = new A(2);
		System.out.println(a.num);
		A a1 = new A(1.3);
		System.out.println(a1.num);
		A a2 = new A(1.3);
		System.out.println(a2.num);
	}

}


class A{
	int num;
	
	public A(int num2) {
		num = num2;
	}
	public A(double num2) {
		num = (int)num2;
	}
	public A(A a) {
		num = a.num;
	}
}
