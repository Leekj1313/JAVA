package day06;

public class ScoreEx1 {

	public static void main(String[] args) {
		/* 다음 기능을 가진 성적관리 프로그램을 작성하시오
		 * 한 반의 성적을 관리
		 * 인수 = 최대 30명
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
		
		//------------------------------------------------
		
		// class 1의 최대인원수 상정
		
		// 각 인원의 번호를 부여
		
		// 종목은 kor, eng, math
		
		// 콘솔에 메뉴 소개 출력-1.성적수정 2.성적조회 3.프로그램 종료
		
		// 유저의 메뉴선택 풀력 
		// Scanner scan = new Sanner(System.in());
		
		// 메뉴 1번의 선댁 시 if() {
		// 수정할 과목을 콘솔에 기입 후
		// 선택 과목에 대한 수정할 성적 기입
		
		// 성적을 수정하였다면 성적조회 - 과목별 조회 , - 학생별 조회
		
		// 성적을 조회 
		// 조회할 학생을 선택 후 알아볼 성적을 기입-조회
		
		//------------------------------------------------
		int menu;
		int sub;
		int stu;
		int score;
		int maxStu = 30;
		int [] kor 		= new int[maxStu], 
			   eng 		= new int[maxStu], 
			   math 	= new int[maxStu];
		int submenu;
		Scanner scan = new Scanner(System.in);
		// 반복문 - 선택한 메뉴가 프로그램 종류가 아닐 때까지 반복
		do {
			// 메인 메뉴출력
				System.out.print("--메뉴--");
				System.out.print("1.성적수정");
				System.out.print("2.성적조회");
				System.out.print("3.프로그램 종료");
				System.out.print("메뉴선택 : ");
		
			// 메인 메튜를 선택
			menu = scan.nextInt();
			// 선택한 메인메뉴에 따른 기능을 실행
			switch(menu) {
			case 1 :
				//서브메뉴를 출력
				System.out.println("---성적수정---");
				System.out.println("1.국어");
				System.out.println("2.영어");
				System.out.println("3.수학");
				System.out.println("과목선택 : ");
				//과목 선택
				sub = scan.nextInt();
				//학생 선택 
				System.out.println("학생선택 : ");
				stu = scan.nextInt();
				//성적 입력
				System.out.println("성적입력 : ");
				score = scan.nextInt();
				//성적을 저장
				switch(sub) {
				case 1 : kor  [stu-1] = score; break;
				case 2 : eng  [stu-1] = score; break;
				case 3 : math [stu-1] = score; break;
				}
				break;
			case 2 :
				//서브메뉴를 출력
				System.out.println("---성적조회---"); 
				System.out.println("1.과목별 조회");
				System.out.println("2.학생별 조회");
				//서브메뉴 선택
				System.out.println("선택 : ");
				submenu = scan.nextInt();
				//서브메뉴에 따른 기능 실행
			switch(submenu) {
			case 1 :
				// 과목 선택 메뉴 출력
				System.out.println("---과목별조회---"); 
				System.out.println("1.국어");
				System.out.println("2.영어");
				System.out.println("3.수학");
				System.out.println("조회할 과목 선택 : ");
				// 과목 선택
				sub = scan.nextInt();
				//선택한 과목의 성적을 출력
				int []selectedsub = null;
			switch(sub) {
				case 1 : selectedsub = kor; break;
				case 2 : selectedsub = eng; break;
				case 3 : selectedsub = math; break;
				default : 
					System.out.println("잘못 선택된 과목입니다.");
				}
				if(selectedsub != null) {
					for(int i= 0; i<selectedsub.length;i++) {
						System.out.println((i+1) + "번 : " + selectedsub[i] + "점");
					}
				}
				break;
			case 2:
				System.out.println("---학생별조회---"); 
				System.out.println("조회할 학생 선택 : ");
				// 학생 선택
				stu = scan.nextInt();
				// 선택한 학생의 성적을 출력
				System.out.println("국어 : " + kor[stu-1]); 
				System.out.println("국어 : " + eng[stu-1]); 
				System.out.println("국어 : " + math[stu-1]); 
				break;
				default : 
					System.out.println("잘못 선택된 학생입니다.");
				}
				break;	
			case 3 :
				System.out.println("프로그램 종료합니다.");
				break;
				default : 
				System.out.println("잘못된 메뉴 입니다.");
			
			
			 scan.closs();
	
			}

}
	
	
