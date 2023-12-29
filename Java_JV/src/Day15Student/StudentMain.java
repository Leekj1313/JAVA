package Day15Student;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SrudentProgram implements Program {
	private static final Object[] list = null;
	private Scanner scan = new Scanner(System.in);
	private final int EXIT = 4;
	
	@Override
	public void run() {
		int menu = 0;
		
	// 반복
		do {
		// 메뉴 출력
		printMenu();
		try {
			// 메뉴 선택
			menu = scan.nextInt();
			// 메뉴 실행
			runMenu(menu);
		}catch(InputMismatchException e) {
			System.out.println("잘못된 메뉴 입니다.");
			scan.nextLine();
		}
		}while (menu != EXIT);
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case 1: 
			// 학년 반, 번호, 이름을 입력
			
			// 입력받은 정보로 인스턴스를 생성 std
			
			// std 가 리스트에 있는지 확인해서 없으면 추가
			
			// 잇으면 이미 등록했다고 알림
			studentManagemont();
			break;
		case 2:
			subjectManagemont();
			break;

		case 3:
			//System.out.println(조회);
			break;

		case 4:
			System.out.println("프로그램 종료");
			break;
		default:
			throw new InputMismatchException();
		}

	}
	private void subjectManagemont() {
		printSunjectMenu();
		System.out.println("--------성적관리---------");
		System.out.println("1. 성적 수정");
		System.out.println("2. 성적 삭제");
		System.out.println("----------------------");
		System.out.print("메뉴 선택 : ");
	}

	private void printSunjectMenu() {
		System.out.println();
	}

	private void studentManagemont() {
		// 학생관리에 포함되어 있는 기능
		// 학생관리 기능에 따른 메뉴출력
		printSubMenu();
		
		// 서브메뉴선택
		int menu = scan.nextInt();
		// 서브메뉴실행
		runSubMenu(menu);
		// 학생 삭제
		
	}

	public void runSubMenu(int menu) {
		String stu;
		switch(menu) {
		case 1:  
			System.out.println("학생 추가 :");
			// 학생을 입력받는다 3명
			// 이미 등록된 학생은 추가하지 않음
			Scanner scan = new Scanner(System.in);
			int count = 3;
			stu = scan.nextLine();
			if(!stu.equals(-1)) {
				list.add(stu);
			}
			break;
		
		case 2:
			System.out.println("학생 수정");
			studentUpdate();
			break;

		case 3:
			System.out.println("학생 삭제");
			studentDelete();
			break;
			
		default:
			System.out.println("뒤로 돌아갑니다");
			return;
			}		
	}
	private void studentDelete() {
		System.out.print("삭제할 학생 : ");
		String stu = scan.nextLine();
		
	}

	private void studentUpdate() {
		System.out.print("수정할 학생 : ");
		String stu = scan.nextLine();
		for(String i = 0; i<count; i++) {
			if(list[i].equals(stu)) {
				list[i].Update(stu);
		System.out.print("학생의 정보가 변경되었습니다");
			}
		}
		
	}

	private void printSubMenu() {
		System.out.println("--------학생관리---------");
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("----------------------");
		System.out.print("메뉴 선택 : ");
		
	}

	@Override
	public void printMenu() {
		System.out.println("----------메뉴----------");
		System.out.println("1. 학생 관리");
		System.out.println("2. 성적 관리");
		System.out.println("3. 조회");
		System.out.println("4. 프로그램 종료");
		System.out.println("----------------------");
		System.out.print("메뉴 선택 : ");

	}

	
}


