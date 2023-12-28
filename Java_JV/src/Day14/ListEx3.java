package Day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

	private static int count;

	public static void main(String[] args) {
		// 속담을 입력받아 저장하고, 출력하는 코드를 작성하시오
		
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		String str;
		do {
			System.out.println("속담을 입력하세요 : ");
			str = scan.nextLine();
			if(!str.equals("-1")) {
				list.add(str);
				break;
			}
			list.add(str);		
		
			}
			for(String tmp : list) {
				System.out.println(tmp);
		}
	}
}

	


