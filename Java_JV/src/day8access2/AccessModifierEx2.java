package day8access2;

import day8access1.Student;

public class AccessModifierEx2 {

	public static void main(String[] args) {
		Student std = new Student();
		//std.grade = 1; // grade의 접근제어자가 private이여서 같은 패키지에 있는 클래스에서 사용 불가
		//std.classNum = 1; // classNum으ㅏ 접근제어자가 default여서 같은 다른 패키지에 있는 클래스에서 사용 불가
		std.gnum = 1; // num의 접근제어자가 pubilc이여서 사용 가능
	}

}
