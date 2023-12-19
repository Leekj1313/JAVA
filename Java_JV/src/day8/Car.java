package day8;

public class Car {
	//  정보 
		// - 단위 = ton, 랜드, 분류, 색상, 타이어, 차명, 연식
	double weight;
	String brand;
	String category; // 숫자로도 분류 가능
	// 정보의 표현방법
		//int color;
	String color;
	String [] tires; // 바퀴가 복수라서 배열사용
	String carName;
	int year;	
	boolean power; // 시동
	int speed; // 현재속력
	boolean leftlight;	// 좌측깜빡이
	boolean rightlight; // 우측깜빡이
	//  기능 : 매소드
		// - 가속, 감속, 시동
		// - 좌우측 깜빡이
	// 시동을 (꺼져있으면)켜는 기능 + (켜져있으면)끄는 기능
	//public 리턴타입 매소드명(매개변수-이미 알고 있으면 필요없음) {
	public void turn() {
		power = !power;
		if(power) {
			System.out.println("시동이 켜졌습니다.");
		}else {
			System.out.println("시동이 꺼졌습니다.");
		}
	}
	// 가속
	public void speedUp() {
		speed++;
	}
	// 감속
	public void speedDown() {
		speed--;
	}
	// 좌측 | 우측 깜빡이 켜기 | 끄기 , 위 : 우측1, 가운데 : 0 ,아래 : 좌측-1(내 정보를 변경만 하면 될 때 = void)
	public void turnLight(int direction) {
		switch(direction) {
		case	 1: rightlight = true;  leftlight = false; break;
		case	-1: rightlight = false; leftlight = false; break;
		case	 0: rightlight = false; leftlight = false; break;
		}
		
	}
	public void print() {
		System.out.println("----------------------------");
		System.out.println("시동 : " + power);
		System.out.println("속력 : " + speed);
		System.out.println("좌측 : " + leftlight);
		System.out.println("우측 : " + rightlight);
		System.out.println("----------------------------");
	}
	
}
