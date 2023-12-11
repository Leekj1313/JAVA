package day02;

public class IfEx1 {
	
	//if문 예제
	public static void main(String[] args) {
		/*...이면 ~이다 : 저건문
		 *... : 조건식
		 * ~ : 실행문
		 * if (조건식){
		 실행문;
		 }
		 */
		//정수가 0(이면) 0이라고 출력하고, 정수가 0이 (아니면)아닙니다라고 출력하는 예제
		
		int num = 10; 
		
		//정수가 0 일때,
		if (num == 0) {
			System.out.println("0 입니다."); 
		}
		//정수가 0 이 아닐때,	
		if (num != 0) {
				System.out.println("num + 0이 아닙니다."); 
		}
	}
}

