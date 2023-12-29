package Day15;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {
	
	static Scanner scan = new Scanner(System.in);
	private static int menu;
	static Map<String, String>map = new HashMap<String, String>();
	public static void main(String[] args) {
		/* 회원을 관리하는 프로그램을 작성하세요
		 * 메뉴
		 * 1. 회원가입
		 * 		- 아이디와 비번만 입력
		 * 		- 이미 가입된 회원인지 체크(containsKey)
		 * 2. 회원검색
		 * 		- 아이디를 입력해서 회원 정보를 조회
		 * 3. 종료
		 */
		
		int menu = 0;
		
		do {
			
			printMenu();
			try {
			menu = scan.nextInt();
			
			runMenu();
			}catch (InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				scan.nextLine(); // 잘못 입력된 값을 문자열로 가져와서 버림
			}
			
		}while(menu != 3);
			
	}

	private static void printMenu() {
		System.out.println("---------------------");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 프로그램 종료");
		System.out.println("---------------------");
		System.out.println("메뉴 선택 : ");
	}

	private static void runMenu() {
		switch(menu) {
		case 1:
			insertMember();
			break;
		case 2:
			searchMember();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			break;
			default:
				throw new InputMismatchException();
		
		
		
		}
		
	}

	private static void insertMember() {
		// 아이디와 비번 입력
		System.out.println("아이디 : ");
		String id = scan.next();
		// map에 아이디 있는지 확인
		if(map.containsKey(id)) { // if(map.get(id) != null
			System.out.println("이미 가입된 아이디 입니다");
			return;
		}
		// 없으면 비번 입력
		System.out.println("비밀번호 : ");
		String pw = scan.next();
		// map에 추가
		map.put(id, pw);
	}

	private static void searchMember() {
		// 이아디 입력
		System.out.println("아이디 : ");
		String id = scan.next();
		// 아이디, 비번을 출력
		String pw = map.get(id);
		
		// 가져온 비번이 null 이면 없는 회원으로 출력
		if(pw == null) {
			System.out.println("등뢱되지 않은 아이디 입니다");
			return;
		}
		// 아니면 아이디, 비번을 출력
		System.out.println(" 아이디 : " + id + " 비번 : " + pw);
	}
}
			
			
			
			
		