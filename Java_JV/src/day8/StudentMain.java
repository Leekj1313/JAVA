package day8;

public class StudentMain {

	public static void main(String[] args) {
		// 학생 한명의 정보를 저장하는 인스턴스를 생성하시오
		// 1학년 1반 1번 홍길동
		
		Student std = new Student();
		std.grade = 1;
		std.classNum = 1;
		std.num = 1;
		std.name = "홍길동";
		std.printInfo();
		// 국어 : 90, 영어 : 100, 수학 : 80 으로 수정하시오
		std.setKor(90); // std.kor = 90; 과 동일
		std.setEng(100);
		std.setMath(80);
		std.printScore();
	}

}
