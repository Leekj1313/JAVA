package Day15;

import java.util.Scanner;

public class MapEx2 {

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
		
		// 메인메뉴를 생성
		static Scanner scan = new Scanner(System.in);
		int menu;
		int count;
		String[] list;
		
		public void printMenu() {
			System.out.println("메인메뉴");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원검색");
			System.out.println("3. 프로그램 종료");
			System.out.println("메뉴 선택 : ");
		}
		// 메인메뉴에서 기능 선택하여 기능실행
		public void runMenu() {
			switch(menu) {
			case 1:
				SignUp();
				break;
			case 2:
				System.out.println("회원검색");
				FindMember();
				break;
				
			}
		}
		private void FindMember() {
			System.out.print("회원검색 : ");
			String id = scan.nextLine();
			
			for(String tmp : list) {
				
			}
			
		}
		// 회원가입에 대한 메서드를 생성
		private void SignUp() {
			System.out.println("신규회원가입");
			System.out.print("아이디 입력 : ");
			String id = scan.nextLine();
			System.out.print("비밀번호 입력 : ");
			String pw = scan.nextLine();
			
			// 아이디, 비번 추가
			list[count] = id;
			list[count] = pw;
			count++;
		}
		

}
