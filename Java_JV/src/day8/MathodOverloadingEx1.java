package day8;

public class MathodOverloadingEx1 {

	public static void main(String[] args) {
		//System.out.println(// 괄호 안에 ctrl + space); = 메소드 오버로드
		System.out.println(sum(1,2));
		System.out.println(sum(1.2, 2.3));
		System.out.println(sum(1,2,3));
	}
	// 두 정수의 합을 알려주는 메소드
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	// 두 실수의 합을 알려주는 메소드
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	// 아래 매소드는 1번 매소드와 매개변수의 개수도 같고 자료형도 같기 때문에 매소드 오버로딩이 안 됨
	/*
	public static double sum(int num1, int num2) {
		return num1 + num2;
	*/
	// 세 정수의 합
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
}
