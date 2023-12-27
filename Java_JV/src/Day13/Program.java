package Day13;

public interface Program {
	//int num1 = 10; // 변수 앞에 final static 이 자동으로 추가
	//final static int num2 = 20;
	// method 알에 public abstract 가 자동으로 추가
	void printMenu();
	public void runMenu();
	public abstract void printExit(); 
	void run();
}

abstract class TestA{
	// final static 을 생략하면 멤버변수, 붙여주면 상수
	int num1 = 10;
	final static int num2 = 20;
	// 클래스에서는 추상 method 에 abtract 가 자동으로 추가되지 않음
	public abstract void printMenu();
}
