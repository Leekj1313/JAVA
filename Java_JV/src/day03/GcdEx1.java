package day03;

public class GcdEx1 {

	public static void main(String[] args) {
		/* 정수의 약수를 출력하는 예제를 작성
		 * 약수는 나누어서 떨어지는 수
		 * 4의 약수 : 1, 2, 4
		 */
		
		int num = 4;
		System.out.println("4의 약수 : ");
		for(int i = 1; i <= num; i++) {
			if(num % 1 == 0) {
				System.out.println(i+ (i == num?"\n":", "));
		}

	}

}
}

	