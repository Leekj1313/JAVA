package Day14;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import lombok.EqualsAndHashCode;

public class ListEx5 {

	public static void main(String[] args) {
		/* contains 와 indexOf 는 A 크래스의 equals 를 이용하여 두 인스턴스가 같은지 다른지를 비교
		 * 일반적으로 클래스에 equals 를 오버라이딩 하는 것이 좋다
		 */
		List<A>list = new ArrayList<A>();
		list.add(new A(1));
		list.add(new A(10));
		
		System.out.println(list.indexOf(new A(1)));
		
	}

}

@EqualsAndHashCode
class A{
	private int num;
	
	public void print() {
		System.out.println(num);
	}
	public A(int num) {
		this.num = num;
	}
}