package day03;

public class ContinueEx1 {

	public static void main(String[] args) {
		// continue을 이용하여 짝수 출력예제
		// 홀수이면 스킵 짝수이면 출력
		
		for(int i = 1; i<=10; i++) {
			if(i % 2 != 0) {
				continue; // 스킵
			}
			System.out.println(i);
		}

	}

}
