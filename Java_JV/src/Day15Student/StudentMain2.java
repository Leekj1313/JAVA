package Day15Student;

import day8.StudentProgram;

public class StudentMain2 {
	/* 학생 국어, 영어, 수학 성적 관리 프로그램을 작성하세요
	 * - Program 인터페이스를 생성하여 활용
	 * - void run()
	 * - void printMenu()
	 * - voidrunMenu(int menu)
	 * - Program 인터페이스를 구현한 구현 클래스 StudentProgram을 생성하여 활용
	 * - 학생 정보를 Student 클래스를 생성하여 활용
	 * - 학년, 반, 번호, 이름, 국어, 영어, 수학
	 * - 리스트를 활용
	 * - 기능
	 * 	- 학생관리
	 * 		- 학생추가
	 *		- 학생수정
	 *		- 학생삭제
	 * - 성적관리
	 * 	- 성적수정
	 * 	- 성적삭제
	 * - 조회
	 * 	- 학생조회
	 * 		- 전체
	 * 		- 학년
	 * 		- 반
	 * 		- 학생(학년, 반, 번호)
	 * 	- 성적조회
	 * 		- 국어
	 * 		- 영어 
	 * 		- 수학 
	 */
	public static void main(String[] args) {
		StudentProgram sp = new StudentProgram();
		sp.run();
	
	}

}
