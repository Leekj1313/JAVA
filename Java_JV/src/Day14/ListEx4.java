package Day14;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListEx4 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(10);
		list.add(1);
		list.add(5);
		
		System.out.println(list);
		/*
		 */
		System.out.println(list.indexOf(10));
		/* indexOf(A) : A 와 일치하는 요소가 몇번지에 있는지 알려주는 매서드, 없으면 -1
		 */
		System.out.println(list.contains(2));
		/* contains(A) : A 와 일치하는 요소가 있는지 없는지를 알려주는 매서드
		 */
		Integer tmp = 10;
		list.remove(tmp);
		System.out.println(list);
		/* remove(A) : A 요소를 삭제 후 삭제 여부를 알려줌
		 * remove(index) : index 번지에 있는 요소를 삭제 후 index 번지에 있던 요소룰 반환
		 */
		
		list.sort(null);
		/* sort(Comparator<? super Integer > c : 비교 기준이 있는 매서드를 가진 Comparator
		 * 인터페이스를 구현한 구현 클래스의 인스턴스가 와야 함
		 */
		list.sort(new Comparator<Integer>() {
			
			@Override
			public int Compare(Integer 01, Integer 02) {
				return 01 - 02;
			}
		});
		System.out.ptintln(list);
	}

}
