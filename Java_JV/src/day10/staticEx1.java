package day10;

public class staticEx1 {

	public static void main(String[] args) {
		
		
		KiaCar C1 = new KiaCar("모닝");
		KiaCar C2 = new KiaCar("레이");
		KiaCar C3 = new KiaCar("K3");
		
		C1.brand = "기아";
		C2.brand = "기아";
		C3.brand = "기아";
		C1.point();
		C2.point();
		C3.point();	
		
		KiaCar2 C4;
		System.out.println(KiaCar2.brand);
		C4 = new KiaCar2("모닝");
		KiaCar2 C5 = new KiaCar2("레이");
		KiaCar2 C6 = new KiaCar2("K3");
		// KiaCar에서 brand는 static이 아니기 때문에 인스턴스마ㅏ다 brand를 수정해야 함
		// 인스턴스를 통해 접근이 가능하지만 static는 클래스명을 통해 접근해야 함
		//C4.brand = "기아";
		KiaCar2.brand = "기아";
		C4.print();
		C5.print();
		C6.print();
		
		System.out.println(false
				);
	}

}
class KiaCar{
	public static String brand = "KIA";
	public String name; // 차명
	
	public KiaCar(String name) {
		this.name = name;
	}
	public void point() {
		System.out.println(brand);
		System.out.println("차명 : " + name);
		
		
	}
	
	
}
	
