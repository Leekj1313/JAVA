package day10;

public class SingleToneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTone s = SingleTone.getInstence();
		System.out.println(s.getstr());
		s.setstr("abc");
		System.out.println(s.getstr());
		
		SingleTone s2 = SingleTone.getInstence();
		System.out.println(s2.getstr());
		// 싱글톤 클래스의 인스턴스 s와 s2는 같은 인스턴스를 공유
		s2.setstr("def");
		System.out.println(s.getstr());
	}

	}
	class SingleTone{
		// 본인 클래스의 인스턴스를 static으로 선언
		private static SingleTone SingleTone = new SingleTone();
		private String str;
		// 생성자의 전근제어자가 private
		private SingleTone() {
			str = "Hi";
		}
		public static SingleTone getInstence() {
			return SingleTone;
		}
		public String getstr() {
			return str;
		}
		public void setstr(String str) {
			this.str = str;
		}
}