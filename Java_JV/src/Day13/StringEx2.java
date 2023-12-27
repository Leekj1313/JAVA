package Day13;

import java.util.Scanner;

import lombok.Builder.Default;

public class StringEx2 {

	static Scanner scan = new Scanner(Syetem.in);
	static String [] list = new String[30];
	static int count = 0;
	
	public static void main(String[] args) {
		/* 문장들을 입력받아 배열에 저장하고, 특정단어가 들어가 있는 문장들을 
		 * 출력하는 프로그램을 작성하시오
		 * 메뉴
		 * 1. 문장 추가
		 * 2. 검색
		 * 3. 종료
		 */
		
		/* 안녕하세요.
		 * 테스트 
		 * 만나서 반갑습니다.
		 * 나는 홍길동 입니다.
		 * 
		 * 나로 검색
		 * 
		 * 만나서 반갑습니다.
		 * 나는 홍길동 입니다.
		 */
		
		// 메인메뉴를 생성
		public class ConsoleProgram {
			public class ConsoleProgram implements Program{
				private Scanner scan = new Scanner(System.in);
				@Override
				public void printMenu() {
					System.out.println("---------메뉴--------");
					System.out.println("1. 문장 추가");
					System.out.println("2. 문장 검색");
					System.out.println("3. 프로그램 종료");
					System.out.println("--------------------");
					System.out.print("메뉴 선택 :");
		}
		// 메뉴 선택을 하여 기능 실행
				@Override
				public void runMenu() {
					switch(menu) {
				case 1:
					System.out.println("문장을 추가합니다.");
					break;
				case 2:
					System.out.println("문장을 검색합니다.");
					break;
					}Default
					System.out.println("잘못된 메뉴 입니다.");		
				}
				@Override
				public void printExit() {
					System.out.println("---------------------------");
					System.out.println("프로그램을 종료합니다.");
					System.out.println("---------------------------");	
				}
				@Override
				public void run() {
					System.out.println("---------------------------");
					System.out.println("프로그램을 실행합니다.");
					System.out.println("---------------------------");
					int menu;
					do {
						inesrtword();
						printMenu();
						// 메뉴 입력
						menu = scan.nextInt();
						// 메뉴 실행
						runMenu(menu);
					}while(menu != 3);
					printExit();
				}
				public static void printmenu() {
					System.out.println("---------메뉴--------");
					System.out.println("1. 문장 추가");
					System.out.println("2. 문장 검색");
					System.out.println("3. 프로그램 종료");
					System.out.println("--------------------");
					System.out.print("메뉴 선택 :");
				}
				public static void runMenu(int menu) {
					switch(menu) {
					case 1:
						inesrtString();
						break;
					case 2:
						searchString();
						break;
					case 3:
						ystem.out.println("프로그램을 종료합니다.");
						break;
						default:
							System.out.println("잘못된 메뉴입니다.");
					}
				}
				public static void inesrtString() {
					System.out.print("문장을 입력합니다. :");
					scan.nextLine(); // 엔터처리
					String word = scan.nextLine();
					// 문장을 추가
					list[count] = str;
					count++;
				}
				public static void searchString() {
					// 단어입력
					System.out.print("단어를 입력합니다. :");
					String str = scan.next();
					//검색
					for(String tmp : list ) {
						if(tmp != null && tmp.contains(str)) {
							System.out.println(tmp);
					}
						if(tmp != null && tmp.indexof(str) >= 0) {
							System.out.println(tmp);
					}
				}
		// 문장을 입력하여 추가
			// 안녕하세요
			// 만나서 반갑습니다
			// 나는 홍길동 입니다
		
		// 메뉴 2번 선택
			// 나 로 검색
		
				// 만나서 반갑습니다
				// 나는 홍길동 입니다
			// 를 출력
		
		//프로그램 종료
		

	}

}
