package test;

import java.util.ArrayList;

public class test2 {
	public static void main(String[] args) {
	
		String Person[] pArr = new String Person[3]; // 배열의 선언이 안되어 있다 
	
		for(int i = 0; i <= pArr.length; i++) {
			System.out.println(pArr[i].getName);
			//pArr[i] = new Person();
			//pArr[i].printInfo();
		}
	}


//public class MyCollection {
	
	public void test() {
		
		public Fruit(String string, String string2);
		
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과", "빨강"));	// Fruit 에 대한 선언이 없어 오류가 발생
		list.add(new Fruit("메론", "초록"));	// Fruit 에 대한 선언이 없어 오류가 발생
		list.add(new Fruit("포도", "보라"));	// Fruit 에 대한 선언이 없어 오류가 발생
		list.add("맛있는 과일");
		
		for(int i = 0; i <= list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}