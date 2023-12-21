package day10;

import java.util.Scanner;

public class day10BoardMain{
		private static Scanner scan = new Scanner(System.in);
		private static Board [] boardList = new Board[5]; // 게시글 목록
		private static int boardNum = 1; // 추가될 게시글 번호
		private static int count = 0; // 현재 등록된 게시글 갯수
		/* 게시판에서 게시글 관리를 위한 콘솔 프로그램 작성하세요.
		 * - 제한사항 정리
		 *   - 게시판은 1개
		 *   - 로그인, 회원가입 구현 X => 게시글 작성 시 아이디를 입력
		 *   - 게시글 제목과 내용은 한 줄만 가능
		 *   - 작성일을 입력
		 * 1. 필요한 기능을 정리해서 메뉴로 출력
		 * 메뉴
		 *   1. 게시글 목록 조회
		 *   2. 게시글 등록
		 *   3. 프로그램 종료
		 *   메뉴 선택 : 1
		 * 게시글 목록
		 *   2. 가입인사 2023-12-20 asd 1
		 *   1. 공지 2023-12-19 admin 3
		 * 메뉴
		 * 	 1. 게시글 상세 조회
		 *   2. 게시글 수정
		 *   3. 게시글 삭제
		 *   4. 뒤로가기
		 *   메뉴 선택 : 1
		 *   조회할 게시글 번호 : 2
		 *   번호 : 2
		 *   제목 : 가입인사
		 *   내용 : 안녕하세요.
		 *   일자 : 2023-12-20
		 *   작성자: asd
		 *   조회수: 2
		 * 게시글 목록
		 *   2. 가입인사 2023-12-20 asd 1
		 *   1. 공지 2023-12-19 admin 3
		 * 메뉴
		 * 	 1. 게시글 상세 조회
		 *   2. 게시글 수정
		 *   3. 게시글 삭제
		 *   4. 뒤로가기
		 *   메뉴 선택 : 2
		 *   수정할 게시글 번호 : 2
		 *   제목 : 가입인사입니다.
		 *   내용 : 만나서 반갑습니다.
		 *   수정이 완료됐습니다.
		 * 게시글 목록
		 *   2. 가입인사입니다. 2023-12-20 asd 2
		 *   1. 공지 2023-12-19 admin 3
		 * 메뉴
		 * 	 1. 게시글 상세 조회
		 *   2. 게시글 수정
		 *   3. 게시글 삭제
		 *   4. 뒤로가기
		 *   메뉴 선택 : 3
		 *   삭제할 게시글 번호 : 1
		 *   게시글이 삭제됐습니다.
		 * 게시글 목록
		 *   2. 가입인사 2023-12-20 asd 1
		 * 메뉴
		 * 	 1. 게시글 상세 조회
		 *   2. 게시글 수정
		 *   3. 게시글 삭제
		 *   4. 뒤로가기
		 *   메뉴 선택 : 4
		 * 메뉴
		 *   1. 게시글 목록 조회
		 *   2. 게시글 등록
		 *   3. 프로그램 종료
		 *   메뉴 선택 :2
		 *   제목 : 테스트
		 *   내용 : 테스트
		 *   일자 : 2023-12-20
		 *   아이디: qwe
		 *   등록이 완료됐습니다.
		 * 메뉴
		 *   1. 게시글 목록 조회
		 *   2. 게시글 등록
		 *   3. 프로그램 종료
		 *   메뉴 선택 : 1
		 * 게시글 목록
		 *   3. 테스트 2023-12-20 qwe 0
		 *   2. 가입인사입니다. 2023-12-20 asd 2
		 * 메뉴
		 * 	 1. 게시글 상세 조회
		 *   2. 게시글 수정
		 *   3. 게시글 삭제
		 *   4. 뒤로가기
		 *   메뉴 선택 : 
		 * 2. 기능을 구현
		 * */

	public static void main(String[] args) {	
		//day9board.board board = new Board(1, "공지", "테스트", "admin", "2023-12-20");
		//board.printInfo();
		//board.update("공지-수정", "테스트-수정");
		//board.printIntoDetail();
		
	
		// 반복문
	
		int menu;
		int sub;
		do {
			// 메뉴출력
			printMenu();
			menu = scan.nextInt();
			// 메뉴선택
			runMenu(menu);
		
			}while(menu != 4);

			// menu가 주어지면 menu에 맞는 기능을 실행하는 매서드
		 	// @progrem menu 실행할 메뉴의 번호
	}
	private static void runMenu(int menu) {
		switch(menu) {
		case 1: 
			// 게시글 목록을 출력 번호가 높은 순으로
			// 향상된 for문 사용 X 한번만 반복되기 위해
			for(int i = count-1; i >= 0; i--) {
				// A는 초기값 		: count-1
				// B는 비교연산자	: >=
				// C는 값			: 0번지
				// D는 증감연산식	: i--
			boardList[i].printLnfo();
			}
			// 서브메뉴를 출력
			
			printSubMenu();
			int sub = scan.nextInt();
			// 서브메뉴 선택
			runSubMenu(sub);
			// 서브메뉴에 맞는 기능 실행
			
			break;
		case 2: 
			// 게시글 등록기능
			insertBoard();
			break;
		case 3:
			System.out.print("프로그램 종료");
			break;
			default:
			System.out.print("잘못된 메뉴");
		}
	}	
	private static void runSubMenu(int submenu) {
		switch(submenu) { 
		case 1 : 
			// 게시글 상세조회
			printBoardDetail();
		case 2 : 
			// 게시글 수정
			
			// 수정할 게시글 번호와 제목, 내용을 입력
			updateBoard();
		case 3 : 
			// 게시글 삭제
			// 삭제할 게시글 번호를 입력
			deleteBoardList();
		case 4 : 
			System.out.println("이전으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못된 메뉴입니다.");
			}
	}
	/* 게시글 정보를 입력받아 게시글을 등록하는 메소드
	 */
	private static void insertBoard( ) {
		
		scan.nextLine();
		System.out.print("제목 : ");
		String title = scan.nextLine();
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		System.out.print("일자 : ");
		String date = scan.nextLine();
		System.out.print("작성자 : ");
		String writer = scan.nextLine();
		// 입력받은 정보들을 이용하여 게시글 인스턴스를 생성
		Board board = new Board(boardNum++,title,contents, writer, date);
		++boardNum; // 추가될 게시글 번호 1증가
		// 생성된 인스턴스 배열에 저장(몇번지)
		boardList[count] = board;
		++count; // 저장된 개수를 1증가
		if(count < boardList.length) {
			return;
		}
		// 배열이 꽉 차면 늘려줌
		// 기존 배열보다 큰 배열 생성
		Board[] tmpList = new Board[boardList.length + 5];
		// 새로 생성된 배열애 기존 배열을 복사
		System.arraycopy(board, 0, tmpList, count, count);
		// 새로 생성된 배열을 boardList에 연결
		boardList = tmpList;
	}
	private static void printMenu() {	
		System.out.println("메뉴");
		System.out.println("1.게시글 목록 조회");
		System.out.println("2.게시글 등록");
		System.out.println("3.게시글 수정");
		System.out.println("4.프로그램 종료");
		System.out.println("메뉴선택 :");
	}
	// 게시글 목록 조회시 나타나는 서브메뉴을 출력라는 매소드
	private static void printSubMenu() {
		System.out.println("서브메뉴");
		System.out.println("1.게시글 상세 조회");
		System.out.println("2.게시글 수정");
		System.out.println("3.게시글 삭제");
		System.out.println("4.뒤로가기");
		System.out.println("메뉴선택 :");
	}
	private static void printBoardDetail() {
	// 조회할 개시글 번호를 입력
		System.out.println("조회할 게시글 번호 :");
		int num = scan.nextInt();
	//빈복문  : 등록된 게시글 전체, 배열 전체 X
	// 입력한 번호와 같은 번호를 가진 게시글을 찾고
		for(int i = 0;i<count;i++) 
			if(num == boardList[i].getNum() ) {
				// 해당 게시글의 printInfpDetail 호출
				boardList[i].printIntoDetail();
				return;
			}
	}
	private static void updateBoard() {
		int num = scan.nextInt();
			System.out.print("수정할 게시글 번호 :");
			scan.nextInt(); // 엔터처리
			System.out.print("수정할 게시글 제목 :");
			String title = scan.nextLine();
			System.out.print("수정할 게시글 내용 :");
			String contents = scan.nextLine();
			// 한줄로 요약해서 검색 = 배열로 변경
			// 반복문 : 게시글 목록 전체
			for(int i = 0;i<count;i++) {
				// 입력한 게시글 번호와 일치하는 게시글이 있으면
				if(num == boardList[i].getNum() ) {	
					// 해당 게시글의 제목과 내용을 수정하고 메소드 종료
					boardList[i].update(title, contents);
					return;
				}
			System.out.print("일치하는 게시글이 없습니다.");
		}
	}
	private static void deleteBoardList() {
	
		System.out.print("삭제할 게시글 번호 :");
			int num1 = scan.nextInt();
			// 반복문 : 게시글 목록 전체
			int index = -1;
			for(int i1 = 0; i1<count;i1++) {
				if(num1 == boardList[i1].getNum()) {
					index = i1;
					break;
				}
			}// 입력한 번호와 일치하는 게시글을 찾아 번지를 저장
			if(index == -1) {
				System.out.println("일치하는 게시글이 없습니다.");
				return;
			}
			count--;
			
			if(index == count) {
				return;
			}
			// 찾은 번지 다음부터 한칸씩 당겨옴
			// 기존 배열의 크기가 같은 새 배열을 상성
			Board []tmpList = new Board[boardList.length];
			// 새 배열에 기존 배열을 복사
			System.arraycopy(tmpList, index+1, boardList, index, count - index);
			// 기존 배열에서 찾은 번지 다음부터 나머지 개수를 복사해서
			// 새 배열에 찾은 번지부터 덮어씀
			System.arraycopy(tmpList, index+1, boardList, index, count - index);
			}

}






	
	
	