package Day13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class LombokEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test(1, 2);
		t.print();
		t.setNum1(10);
		System.out.println(t.getNum1());
		System.out.println(t);
	}

}
@Getter
@Setter
@AllArgsConstructor // 모든 멤버들이 매개변수로 들어간 생성자를 생성
@NoArgsConstructor	// 기본생성자 추가
class Test{
	private int num1;
	private int num2;
	
	public void print() {
		System.out.println(num1);
		System.out.println(num2);
	}
}