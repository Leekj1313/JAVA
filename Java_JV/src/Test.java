
import java.util.Scanner;

public class Test {

	public void printNum() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1~10 사이의 정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		
		if(num >= 1 || num <= 10) {	
			for(int i = 1; i <= 10; i+=2) {// 조건식에서 홀수를 판별식 오류
				System.out.print(i + " ");
			}
		}else {
			System.out.println("1과 10 사이의 숫자가 아닙니다");
		}
	}
}
