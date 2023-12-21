package day10;

public class ThisEx1 {

	public static void main(String[] args) {
		// 점을 나타내는 point 클래스
		Point pt1 = new Point();
		pt1.print();
		Point pt2 = new Point(1,2);
		pt2.print();
	}

}
class Point {
	private int x, y;

	public int getX() {
		// 여기서의 this는 생략가능
		// x가 다른변수와 착각할 일이 없다.
		return x;
	}

	public void setX(int x) {
		// 여기서는 this를 반드시 사용함
		// 멤버변수 x와 매개변수 x를 구별하기 위함.
		this.x = x;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("매개변수 2개 생성자");
	}
	public Point() {
		// this 앞에 다른 실행문 = X
		// System.out.println("기본 생성자");
		this(0,0); // x=0, y=0 으로 초기화 하기 위해 위레 있는 생성자를 호출, this 앞에 다른 생성자 X
		System.out.println("기본 생성자");
	}
	public Point(int x) {
		// this(x) this 를 오용하면 객체 초기화가 완료되지 않아 새용할 때 주의해야 한다
		// this() = 0;
		this.x = x;
	}
	public void print() {
		System.out.println("("+x+" + "+y+")");
	}
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
		

}