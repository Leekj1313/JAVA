package day8;

import java.util.Scanner;

public class StudentProgram {
	
/* 다음 기능을 가진 성적관리 프로그램을 작성하시오
 * 한 반의 성적을 관리
 * 인수 = 최대 5명
 * 성적은 번호순으로 관리
 * 국어, 영어, 수학 성적을 관리
 * 메뉴 
 * 1. 성적수정
 * 2. 성적조회
 * 3. 프로그램 종료
 * 메뉴선택 : 
 * 
 * --성적수정--
 * 1.국어
 * 2.영어
 * 3.수학
 * 과목선택 : 
 * 
 * 학생선택 : 3 번호를 선택
 * 성적입력 : 100
 * 
 * --성적조회--
 * 1. 과목별 조회
 * 2. 학생별 조회
 * 선택 : 1
 * --과목별조회--
 * 1.국어
 * 2.영어
 * 3.수학
 * 과목선택 : 1
 * 1번 : 0점
 * 2번 : 0점
 * 3번 : 100점
 * ...
 *  30번 : 0점
 *  
 *  --성적조회--
 *  1. 과목별조회 
 *  2. 학생별조회
 *  선택 : 2
 *  학생선택 : 3
 *  국어 : 100점
 *  영어 : 0점
 *  수학 : 0점
 */
	public static void main(String[] args) {
		// 학년, 이름은 생략하고, 반은 1반으로 고정
		// 번호는 각각 1부터 5번으로 저장
		
		//5명의 학생 정보를 저장할 수 있는 배열생성
		Student [] stds = new Student[5];
		// 각 학생의 번호를 1번부터 5번까지 지정
		// 학생 객체를 생성
		for(int i = 0; i<stds.length; i++) {
			stds[i] = new Student();
			//stds[i].classNum = 1;
			//stds[i].num = i+1;
		}
		//학생번호를 수정
		int count = 1;
		/* 향상된 for 문을 이용하여 std를 다른 인스턴스로 교체하는 건 안되지만 
		 * std의 맨버변수를 변경하는 건 가능
		 */
		for(Student std : stds) {
			std = new Student();
			std.classNum = 1;
			std.num = count++;
			std.printInfo();
		}
		// 반복문 : 프로그램 종료를 선택하지 않으면 반복
		int menu = 0;
		int sub;
		int score;
		
		do {
			
			printMenu();
			
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			switch(menu) {
			case 1 :
				printScore(stds);
				
				System.out.print("성적 수정 기능 구현예정");
				break;
			case 2 :
				// 주어진 학생 정보를 조회하는 기능을 구현 : 매소드
				/* 기능	: 수학성적을 수정하는 매소드
				 * 매개변수	: 수정하려는 수학성적
				 * 리턴타입	: 알려줄 필요없음 = void
				 * 매소드명	: setMath
				 */
		
			//*학생 배열을 주고 조회를 하라고 시킴 => 메소드	
			case 3 :
				System.out.print("프로그램 종료");
				break;
			default:
				System.out.print("잘못된 메뉴선택");
			}
		
		}while(menu != 3); 
		 	System.out.print("프로그램 종료");
	}
		public static void updateScore(Student[] stds) {
				
				/* 기능	: 성적수정
				 * 매개변수	: Student[] stds
				 * 리턴타입	: void
				 * 매소드명	: updateScore
				 */
		Scanner scan = new Scanner(System.in);
			System.out.println("과목(국어 : 1, 영어 : 2, 수학 : 3) :");
			int subject = scan.nextInt();
			System.out.println("학생번호 :");
			int num = scan.nextInt();
			System.out.println("성적 :");
			int score = scan.nextInt();
			// 성적 입력
			
		//반복문 : 학생전체
			// 입력한 학생 번호롸 일치하는 학생정보를 찾아서 해당하는 과목에 맞는 성적을 수정
			
			// 과목 또는 학생 번호가 잘못되면 안내문구 출력
				for(Student std : stds) {
					if(std.num != num) {
						continue;
					}
				switch(subject) {
				case 1:
					std.setKor(score);
					return;
				case 2:
					std.setEng(score);
					return;
				case 3:
					std.setMath(score);
					return;
					}
				}
				System.out.print("과목 또는 학생번호가 잘못되었습니다.");	
			}
			
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1.성적수정");
		System.out.println("2.성적조회");
		System.out.println("3.프로그램 종료");
		System.out.println("메뉴선택 :");
		}		
	public static void printSubMenu() {
		System.out.println("------------------");
		System.out.println("성적조회");
		System.out.println("1.과목별");
		System.out.println("2.학생별");
		System.out.println("------------------");
		System.out.println("과목선택 :");
		}
		/* 기능	: 학생 배열이 주어지면 정보를 입력받아 학생 성적을 출력
		 * 매개변수	: Student []stds
		 * 리턴타입	: B = void
		 * 매소드명	: printScore
		 */
	public static void printScore(Student []stds) { // 수정할 점수 입력
		// 성적 조회를 위한 서브메뉴 출력
		printSubMenu();
		// 서브메뉴 선택
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
			// 선택한 서브 메뉴에 따른 기능 실행
			System.out.println("성적입력 :");
			int score = scan.nextInt();
			
			switch(menu) {
				case 1:
					// 서브메뉴가 1이면 과목별 조회
					// 학생 배열을 주고 학생 번호를 입력받아 번호에 맞는 학생 성적을 출력하라고 시킴
					printScoreByNum(stds);
					break;
				case 2:
					// 서브메뉴가 2이면 학생별 조회
					// 학생 배열을 주고 조회할 과목을 입력받아 과목에 맞는 성적을 출력
					printScoreBySubject(stds);
					break;	
				default : 
					System.out.println("없는 학생 입니다.");
				}
			}


	public static void printScoreByNum(Student []stds) {
		// 학생 번호를 입력
		System.out.println("학생입력 :");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		//반복문 : 학생 전체
			// 입력한 학생 번호와 일치하는 학생 성적을 출력
		for(Student std : stds) {
			if(std.num == num) {
				std.printScore();
				return;
			}
		}
			System.out.println("없는 학생 입니다.");
		// 없는 학생 번호라면 없는 학생이라고 출력
	}
	/* 기능	: 학생 배열이 주어지면 조회할 과목을 입력받아 과목에 맞는 성적을 출력
	 * 매개변수	: E
	 * 리턴타입	: F = void
	 * 매소드명	: printScoreBySubject
	 */
	public static void printScoreBySubject(Student []stds) {
		
		System.out.println("과목(국어: 1, 영어 : 2, 수학 : 3) :");
		Scanner scan = new Scanner(System.in);
		int subject = scan.nextInt();
		for(Student std : stds) {
			switch(subject) {
			case 1 :
				System.out.print("번호 : " + std.num + ", 국어 : " + std.kor);
				break;
			case 2 :
				System.out.print("번호 : " + std.num + ", 영어 : " + std.eng);
				break;
			case 3 :
				System.out.print("번호 : " + std.num + ", 수학 : " + std.math);
				break;
			default:
				System.out.println("없는 과목 입니다.");
			}
		}
	}
}

		
