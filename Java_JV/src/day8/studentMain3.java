package day8;

public class studentMain3 {

	public static void main(String[] args) {
		// student2 생성자를 이용한 예제
		// 기본생성자가 없어서 에러 발생
		//Student2 std = new Student2();
		
		Student2 std = new Student2(1, 1, 1, "홍길동");
		std.printScore();
	}

}
