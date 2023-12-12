package day03;
import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12,1,2 : 겨울
		 * 그 외 : 잘못된 월
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요 : ");
		int month = scan.nextInt();
		System.out.println("월 입력(1~12) : ");
		
		//if(month < 1 || month > 12) {
		//System.out.println(month + " 월은 잘못 되었습니다.");
		//}
		//if(month == 3 || month == 4 || month == 5) {
		//System.out.println(month + "월 은 봄입니다.");
		//}
		//if(month == 6 || month == 7 || month == 8) {
		//System.out.println(month + "월 은 여름입니다.");
		//}
		//if(month == 9 || month == 10 || month == 11) {
		//System.out.println(month + "월 은 가을입니다.");
		//}
		//if(month == 12 || month == 1 || month == 2) {
		//System.out.println(month + "월 은 가을입니다.");
		//}
		
		
		// 
		switch(month) {
		case 1: case 2: case 12:
			System.out.println(month + "는 겨울");
			break;
		case 3: case 4: case 5:
			System.out.println(month + "는 봄");
			break;
		case 6: case 7: case 8:
			System.out.println(month + "는 여름");
			break;
		case 9: case 10: case 11:
			System.out.println(month + "는 가음");
			break;
		default:
			System.out.println(month + " 잘못된 월");
		
		scan.close();
		}
			}
}

