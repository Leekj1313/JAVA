package day8;

/* 학생의 국어, 영어, 수학 성적을 관리하기 위한 프로그램을 작성한다
 * 이 때 필요한 학생 클래스를 생성하시오
 */
public class Student {
	// 맴버변수	: 국어,영어,수학의 성적 | _학년_반 | 학생번호 | 이름
	int kor, eng, math;
	int grade, classNum, num;
	String  name;
	String menu;
	
	// 매소드 	: 학생정보 확인 | 성적확인 | 국어,영어,수학 성적의 수정
	/* 기능	: 학생정보(학년, 반, 번호, 이름)을 콘솔에 출력하는 매소드
	 * 매개변수	: 
	 * 리턴타입	: 알려줄 필요없음 = void
	 * 매소드명	: printInfo
	 */
	//public 리턴타입 매소드명(매개변수-이미 알고 있으면 필요없음) {
	public void printInfo() {
		System.out.println("-------------------------");
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classNum);
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);			
	}
	
	/* 기능	: 학생정보(학년, 반, 번호, 이름, 국어, 영어, 수학)을 콘솔에 출력하는 매소드
	 * 매개변수	:
	 * 리턴타입	: 알려줄 필요없음 = void
	 * 매소드명	: printScore
	 */
	public void printScore() {
		printInfo(); // 위의 내용과 중복이 되는 부분	
		System.out.println("국어 : " + kor);	
		System.out.println("영어 : " + eng);	
		System.out.println("수학 : " + math);	
	}
	/* 기능	: 국어성적을 수정하는 매소드
	 * 매개변수	: 수정하려는 국어성적
	 * 리턴타입	: 알려줄 필요없음 = void
	 * 매소드명	: setKor
	 */
	public void setKor(int korScore) {
		kor = korScore;		
	}
	/* 기능	: 영어성적을 수정하는 매소드
	 * 매개변수	: 수정하려는 영어성적
	 * 리턴타입	: 알려줄 필요없음 = void
	 * 매소드명	: setEng
	 */
	public void setEng(int engScore) {
		eng = engScore;		
	}
	/* 기능	: 수학성적을 수정하는 매소드
	 * 매개변수	: 수정하려는 수학성적
	 * 리턴타입	: 알려줄 필요없음 = void
	 * 매소드명	: setMath
	 */
	public void setMath(int mathScore) {
		math = mathScore;		
	}
	public void printMenu() {
		System.out.println("메뉴");
		System.out.println("1.성적수정");
		System.out.println("2.성적조회");
		System.out.println("3.프로그램 종료");
		System.out.println("메뉴선택 :");
	}
	public void printSubMenu() {
		System.out.println("메뉴");
		System.out.println("1.국어");
		System.out.println("2.영어");
		System.out.println("3.수학");
		System.out.println("과목선택 :");
	}
}
