package Day14;

import java.util.Iterator;
import java.util.List;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		Iterator<Integer> it = list.iterator();
		
		list.add(10);
		list.add(5);
		list.add(1);
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			Integer tmp = it.next();
			System.out.println(tmp);		
			
		}
	}

}
