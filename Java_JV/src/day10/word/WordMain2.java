package day10.word;

import java.util.Scanner;

public class WordMain2 {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static Word[] list = new Word[10];//단어장
	private static int count = 0; // 저장된 단어 개수
	/* 영어 단어장 프로그램을 만드시오
	 * 1. 기능정리
	 * 메뉴 출력
	 * 		1. 영어단어 입력 = 찾으려는 영어단어 입력
	 * 		2. 영어단어 조회 = 단어해석의 길이
	 * 		+ 최근 조회한 단어
	 * 		3. 프로그램 종료
	 * 		
	 * 		
	 * 2. 틀 정리
	 * 
	 * 3. 필요한 매소드 구현
	 * 
	 * 4. 제한
	 * 		1. 영어단어의 범위 
	 */
	
	public static void main(String[] args) {
		int menu;
		// 반복문
		do {
			// 메뉴출력
			printMenu();
			// 메뉴선택
			menu = scan.nextInt();
			// 선택한 메뉴에 맞는 기능실행
			runMenu(menu);
			
		}while(menu != 5);
	
	}
	private static void printMenu() {
		
		System.out.println("-----------------------");
		System.out.println("메뉴");
		System.out.println("1.단어등록");
		System.out.println("2.단어검색");
		System.out.println("3.단어수정");
		System.out.println("4.단어삭제");
		System.out.println("5.종료");
		System.out.println("-----------------------");
		System.out.println("메뉴선택 :");
		}
	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			// 단어등록 기능 구현
			insertWord();
			break;
		case 2:
			printWordSearch();
			System.out.println("단어 검색");
			break;
		case 3:
			updateWord();
			System.out.println("단어 수정");
			break;
		case 4:
			deleteWordList();
			System.out.println("단어 삭제");
			break;
		case 5:
			System.out.println("종료");
			break;
		default:
		}
	}
	private static void insertWord() { // 단어등록
		System.out.println("단어 등록");
		scan.nextLine();
		System.out.print("단어 :");
		String word = scan.nextLine();
		System.out.print("의미 :");
		String meaning = scan.nextLine();
		
		Word word  = new Word();
		}
	private static void printWordSearch() {
		//public boolean equals(String word) 
			return; 
			this.word.equals(word);
		
		System.out.print("검색단어 :");
		String word = scan.nextLine();
		for(int i = 0;i<count;i++) 
			if(word == List[i].getWord() ) {
				
				List[i].printIntoDetail();
				return;
				}
		
	}
	private static void updateWord() {
		// 수정할 단어 입력
		String word = scan.next();
			System.out.print("수정할 단어 :");
		String meaning = scan.nextLine();
			System.out.print("수정할 의미 :");
			for(int i = 0;i<count;i++) {
				if(word == list[i].getWord()) {	
					list[i].Update(word);
				}else if (word == list[i].getMeaning()) {
					list[i].Update(meaning);
					return;
					}
			}
	}
	private static void deleteWordList() {
		System.out.print("삭제할 단어 :");
		String word = scan.nextLine();
		}
	
	private static void ExpandWordList() {
		// 기존 단어장 보다 큰 단어장 생성
		Word[] tmpList = new word[list.length + 10];
		// 새 단어장에 기존 단어장 복붙
		System.arraycopy(list, 0, tmpList, 0, count);
		// 새 단어장을 내 단어장이라 선언
		list = tmpList;
	}
		
}