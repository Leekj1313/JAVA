package day8access1;

public class AccessModifierEx1 {

	public static void main(String[] args) {
		Student std = new Student();
		//std.grade = 1; // grade의 접근제어자가 private이여서 같은 패키지에 있는 클래스에서 사용 불가
		std.classNum = 1; // classNum으ㅏ 접근제어자가 default여서 같은 패키지에 있는 클래스에서 사용가능
		std.gnum = 1; // num의 접근제어자가 pubilc이여서 사용 가능
		std.setGrade(1); // 
		System.out.print(std.getGrade() + "학년");
	}

}
