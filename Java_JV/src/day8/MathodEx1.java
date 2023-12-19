package day8;

public class MathodEx1 {

	public static void main(String[] args) {
		// 재귀매소드를 이용하여 스택 오버플로우가 발생하는 예제
		int num; // 지역변수, 매개변수
		recutsive();
	}
	public static void recutsive() {
		System.out.println("재귀매소드 입니다.");
		recutsive();
		
	}

}
