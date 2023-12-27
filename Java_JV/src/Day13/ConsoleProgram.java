package Day13;

import java.util.Scanner;

import lombok.Builder.Default;

public class ConsoleProgram {
	
		// program 인터페이스를 구현한 구현 클래스
		public class ConsoleProgram2 implements Program{
			private Scanner scan = new Scanner(System.in);
			@Override
			public void printMenu() {
				System.out.println("---------메뉴--------");
				System.out.println("1. 가능1");
				System.out.println("1. 가능2");
				System.out.println("1. 가능3");
				System.out.println("4. 종료");
				System.out.println("--------------------");
				System.out.print("메뉴 선택 :");
				
			}

			@Override
			public void runMenu() {
				switch(menu) {
			case 1:
				System.out.println("기능1이 실행 중입니다.");
				break;
			case 2:
				System.out.println("기능2이 실행 중입니다.");
				break;
			case 3:
				System.out.println("기능3이 실행 중입니다.");
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
					// 메뉴 출력
					printMenu();
					// 메뉴 입력
					menu = scan.nextInt();
					// 메뉴 실행
					runMenu(menu);
				}while(menu != 4);
				printExit();
			}
			
		}
	}
