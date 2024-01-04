package day18.student;

public class StudentMain {

	public static void main(String[] args) {
		/* 학생 관리 프로그램을 구현하세요
		 * - 기능
		 * 	- 학생 등록
		 * 	- 학생 목록 조회
		 * 	- 종료
		 * - Student 클래스를 생성해서 구현
		 * 	- 학년, 반, 번호, 이름
		 * - 소켓 통신을 이용하여 학생 정보를 서버에 저장, 불러와서 조회
		 */
		
		// 등록 - 클래스 총 4개 = 클라이언트 2개(학생의 정보를 입력 보냄), 서버 1개(학생의 정보를 받음 저장)
		//		   		   = 입력된 학생 정보를 저장할 리스트 클래스
		// StudentMain => 서버역할, StrServer, StrClient, strClient, List
		// 조회 - 클래스 서버에서 저장된 학생 정보를 클라이언트로 보냄
		
		// 메뉴 - 저장되어 있는 메뉴를 클라이언트로 사출 => 클라이언트는 사출된 메뉴에서 선택
		// 클라이언트에서 선택된 메뉴를 실행 => 실행된 값을 서버에 보냄
		
		// 기능메뉴에서 실행된 값을 서버 클래스에 저장
		
		// 저장된 값을 보관할 저장소... 리스트에 저장 후 서버에서 불러오기
		StudentProgram sp = new StudentProgram();
		sp.run();
			
	}	

}
