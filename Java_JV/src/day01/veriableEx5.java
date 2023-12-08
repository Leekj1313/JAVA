package day01;

public class veriableEx5 {
	//String 선언 예제
	
	public static void main(String[] args) {
		String strl = null;
		System.out.println(strl);
		//기본형 변수에는 null을 저장할 수 없다.
		//num1 = null;
		String str2= "Hellow";
		System.out.println(str2);
		//String 클래스에 문자를 저장할 수 없다.
		//String str3 = 'A';
		String str4 = "A";
		System.out.println(str4);
		//String 클래스에 빈 문자열을 저장할 수 있다.
		String str5 = "";
		System.out.println(str5);
		//문자열 점수 도는 실수 또는 문자 또는 논리값을 더하면 문자열이 됨
		String str6 = "" + 'A';
		System.out.println(str6);
		//빈문자열 + 'A'는 "A"가 되어 저장가능

	}

}
