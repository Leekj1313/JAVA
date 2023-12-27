package Day13.Object;

import day8.Student;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

public class ObjectEx1 {
	
	@AllArgsConstructor
	class Studenrt{
		int grade, classNum, num;
		String name;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.toString());
		
		Student std1 = new Student(1,1,1, "홍길동");
		Student std2 = new Student(1,1,2, "임꺽정");
		if(std1.equals(std2)) {
			System.out.println("학년, 반, 번호가 같습니다.");{
			}else {
				System.out.println("학년, 반, 번호가 다릅니다.");
			}
			A a1 = new A();
			a1.num1 = 20;
			System.out.println(a1);
			A a2 = a1;
			a2.num1 = 30;
			// a2의 num1 을 수정 후 a1 을 출력 : 공유하기 때문에 변경됨
			System.out.println(a1);
			A a3 = a1.clone();
			a3.num2 = 40;
			// a3 의 num2 를 수정한 후 a1 을 출력
			System.out.println(a1);
		}
	

}
@AllArgsConstructor
class Studenrt{
	int grade, classNum, num;
	String name;
	@Override
//@ToString // 객체정보를 문자열로 반환
@EqualsAndHashCode
class A implements Cloneable{
	int num1 = 10;
	int num2 = 3;
	String name = "테스트";
	@Override
	public String toString() {
		return "A [num1=" + num1 + ", num2=" + num2 + ", name=" + name + "]";
	}
	@Override
	public A clone() throws CloneNotSupportedException{
		return (A)super.clone();	
	}
	
}
}