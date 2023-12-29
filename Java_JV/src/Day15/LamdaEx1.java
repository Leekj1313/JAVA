package Day15;

public class LamdaEx1 {

	public static void main(String[] args) {
		// 안터페이스의 인스턴스를 생성하기 위해 구현 클래스 ClassA 를 추가 후, ClassA 를 이용하여 인스턴스를 생성
		InterfaceA ia; = new ClassA();
		ia1.print();
	}
	// 익명 클래스를 추가해서 인스턴스를 생성
	InterfaceA ia2 = new InterfaceA() {
		@Override
		public void print() {
			System.out.println("안녕하세요");
			
		
	}

	};
	ia2.print();
	// 람다식을 이용하여 익명 클래스를 추가 후 인스턴스를 생성
	InterfaceA ia3 = ()->{
		System.out.println("dkssudgktody");
	};
	ia3.print();
	/* InterfaceA는 추상 매서드가 1개 이기 때문에 함수형 인터페이스이고,
	 * @FunctionalInterface
	 */
	@FunctionalInterface
	interface InterfaceA{
	
	void print();
}
class ClassA implements InterfaceA{
	
	@Override
	public void print() {
		System.out.println("안녕하세요");	
	}
}