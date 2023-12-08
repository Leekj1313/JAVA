package day01;

public class veriableex4 {

	//논리형 변수선언 해제
	public static void main(String[] arge) {
		boolean isEven = true;
		System.out.prontln(isEven);
		//아래 코드는 논리형 변수가 이런식으로 사용된다는걸 보여주기 위한 예제
		//아직은 알 필요 없음
		isEven = 3 % 2 == 0;
		System.out.prontln("3 is Even number?" + isEven);
	}
}
