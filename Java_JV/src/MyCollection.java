import java.util.ArrayList;

public class MyCollection {
	
	int[] test = new int[4];
	
	public void test() {
		
		int num = 100;
		
		ArrayList<Test> list = new ArrayList<Test>();
		list.add(new Test("자바", 93.5));
		list.add(new Test("디비", 74.1));
		list.add(new Test("서버", 82.7));
		
		list.add(num);
		
		for(int i = 0; i < list.size(); i++) { 
			System.out.println(list.get(i));
		}
	}
}