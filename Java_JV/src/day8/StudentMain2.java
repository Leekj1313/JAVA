package day8;

public class StudentMain2 {

	public static void main(String[] args) {
		// 5명의 학생을 저장하기 위한 배열을 생성하시오
		
		Student [] stds = new Student[5];
		
		// 학생 5명의 학생 정보를 출력하는 코드를 작성아시오 
		for(int i = 0; i<stds.length; i++) {
			stds[i] = new Student(); // 객체 (stds[i] = new Student();) 없이는 오류발생, 객체가 필요하다
			stds[i].printInfo();
		}
		
		

	}

}
