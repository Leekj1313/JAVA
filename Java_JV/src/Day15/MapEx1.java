package Day15;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, String>map=new HashMap<String, String>();
		
		map.put("abc123", "abc123!"); 
		map.put("abc456", "abc123!"); // 비번이 중복 => value 가 중복 => 가능
		map.put("abc123", "qwe123!"); // 아이디 중복 => key 가 중복 => 추가가 안됨, value 가 변경
		map.put("admin", "admin");
		map.put("def", "def");
		System.out.println(map.remove("abc123"));
		System.out.println(map);
		
		// ketSet을 이용한 반복문 예제
		Set<String> keySet = map.keySet();
		for(String tmp : keySet) {
			String value = map.get(tmp);
			System.out.println(value);
		}
		// entrySet을 이용한 반복문 예제
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		
		for(Map.Entry<String, String> tmp : entrySet) {
			System.out.println("[" + tmp.getKey() + ", " + tmp.getValue() + "]");
		}
		// 내부 클래스의 인스턴스를 생성하는 예제
		A a = new A();
		A.B b = a.new B();
	}

}

/*class Entry1<K,V> 
	K key;
	V value;
	*/

class A{
	public class B{
		int num;
	}
}

