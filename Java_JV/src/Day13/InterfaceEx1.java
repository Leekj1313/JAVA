package Day13;

public class InterfaceEx1 {

	public static void main(String[] args) {
		System.out.println(kiaCar.brand);

	}

}
class kiaCar{
	public static String brand = "기아";
		
	}
 interface printer{
	 // static 이 붙은 매서드는 반드시 구현해야 함
	 static void print() {
		 System.out.println("프린트 입니다.");
	 }
	 // static 이 안 붙은 매서드는 추상매서드로 만들어서 구현하지 않거나
	 void test();
	 // default 매서드로 만들어서 구현
	 default void test2() {}
}