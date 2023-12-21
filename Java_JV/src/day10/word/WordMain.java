package day10.word;

import java.util.Scanner;

public class WordMain2 {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static Word[] list = new Word[10];//단어장
	private static int count = 0; // 저장된 단어 개수
	/*1. 기능정리
	 * 단어는 영어단어와 한글 뜻으로 구성
	 * 영어 단어는 영어이고, 공백이 없는 단어
	 * 한글 뜻은 한글이고, 한 문장으로 되어있다
	 * 한 단어에 뜻이 한개만 있다고 가정
	 * 1. 기능
	 * - 단어등록
	 * - 단어검색
	 * - 단어수정
	 * - 단어삭제
	 * wordClass 필요
	 * 	 word : 영단어
	 *   meaning : 뜻
	 * - 단어출력, 수정기능
	 * - 단어확인(주어진 문자열과 같은 단어인지 확인)
	 * 2. 틀 작성
	 * */
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
	
		switch(menu) { // 단어등록 기능 구현
		case 1:
			insertWord(); 
			break;
		case 2:
			printSearchWord();
			break;
		case 3:
			updateWord();
			break;
		case 4:
			deleteWordList();
			break;
		case 5:
			System.out.println("종료");
			break;
		default:
		}
	}
	
	private static void insertWord() {
		// 단어오 뜻 입력
		System.out.print("단어 :");
		String word = scan.next();
		
		System.out.print("의미 :");
		scan.nextLine(); // 엔터처리
		String meaning = scan.nextLine();
		// 단어와 뜻을 이용하여 Word의 인스턴스를 생성
		Word tmp = new Word(word, meaning);
		
		// 위에서 생성한 인스턴스 단어장에 저장
		list[count] = tmp;
		
		// 저장된 단어의 개수를 1개 증가
		count++;
		// 테스트용 단어장으로 출력
		//for(int i =0; i<count; i++) {
			//list[i].prinnt();
		//}
		// 단어장이 꽉차면 단어장 크기를 늘림
		if(count == list.length) {
			ExpandWordList();
		}
	}
	private static void ExpandWordList() {
		// 기존 단어장 보다 큰 단어장 생성
		Word[] tmpList = new word[list.length + 10];
		// 새 단어장에 기존 단어장 복붙
		System.arraycopy(list, 0, tmpList, 0, count);
		// 새 단어장을 내 단어장이라 선언
		list = tmpList;
	}
	public static void printSearchWord() {
		// 검색할 단어 입력
		System.out.print("검색단어 :");
		String word = scan.next();
		// 단어장에 검색해서 결과를 출력
		
		// 반복문 : 저장된 개수 만큼
		for(int i =0; i<count; i++) {
			// 단어장에 단어가 주어진 잔더와 일치하면
			if(list[i].equals(word)) {
				list[i].print();
				return;
			}
		}
		System.out.print("일치하는 단어가 없습니다."); //출력후 종료
		}
	private static void updateWord() {
		// 수정할 단어 입력
		System.out.print("수정할 단어 :");
		String word = scan.next();
		scan.next();
		System.out.print("수정할 의미 :");
		String meaning = scan.nextLine();
			
			for(int i = 0;i<count;i++) {
				if(list[i].equals(word)) {
					// 뜻을 수정하고 종료
					list[i].Update(meaning);
					System.out.print("단어가 수정되었습니다.");
					return;
					}
				}
				System.out.print("일치하는 단어가 없습니다.");
	}
	private static void deleteWordList() {
		// 삭제할 단어 입력
		System.out.print("삭제할 단어 :");
		String word = scan.nextLine();
			// 단어장에서 단어를 삭제
			// 삭제할 위치를 찾음
			// 반복문 : 저장된 개수만큼
			int index = -1; //음수로 초기화. 배열의 번지는 0이상
			for(int i = 0; i<count; i++) { 
				//입력한 단어와 같으면
				if(list[i].equals(word)) {
				// 현재 위치를 index 에 저장
					index = i;
					break;
					
				}
			}
			if(index == -1) {
				System.out.print(true);
			}
			if(index == count) {
				return;
			}
			Word[] tmpList = new Word[list.length];
			
			System.arraycopy(list, 0, tmpList, 0, list.length);
			
			System.arraycopy(tmpList, index+1, list, index, count-index);
		
					// 현재 위치를 index 에 저장
				
				// 일치하는 단어가 없으면
		
					// 안내문구 출력 후 종료
			
			// 저장된 단어의 개수를 1 줄임
		
			// 일치하는 단어가 마지막이면 종료
		
		// 마지막이 아니라면 앞으로 한 칸씩 당김
		
		// 현재 배열과 같은 크기의 새 배열을 생성
		
		// 새 배열에 현재 배열을 복붙
		
		// 현재배열에서 index+1 번지부터 단어가 있는 마지막 번지
		// 복사해서 새 배열에 index 번지부터 복붙
		*/
		
				
			}
			
			
			
}
