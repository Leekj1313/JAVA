package day10;

public class staticEx2 {

	public static void main(String[] args) {
		System.out.println(sum1(1,2));
		//System.out.println(sum2(1,2));
		staticEx2 ex = new staticEx2();
		System.out.println(ex.sum2(1,2));
		

	}
	public static int sum1(int num1, int num2) {
		return num1 + num2;
	}
	public int sum2(int num1, int num2) {
		return num1 + num2; // 인스턴스가 반드시 필요함
	}
	public void test() {
		System.out.println(sum1(1,2));
		System.out.println(sum2(1,2));
}
}
