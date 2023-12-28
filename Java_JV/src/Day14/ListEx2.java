package Day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {

	public static void main(String[] args) {
		// 정수를 5개 입력받아 입력받은 정수를 리스트에 저장하고 출력하는 코드를 작성하시오
		
		// 정수배열 리스트를 생성한다 => 정수를 여러개 저장하기 위해 ArrayList 인스턴스를 생성
		//					  => 정수이기 때문에 Integer를 추가. int가 안되는 이유는 재네릭은 클래스만 올 수 있다				
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 입력에 사용될 스캐너를 생성 => 콘솔창에서 다양한 값을 입력받기 위한 Scanner 인스턴스를 생성
		//					   => 콘솔창에서 입력받아야 하기 때문에 표준 입력인 System.in 인스턴스를 전달 
		Scanner scan = new Scanner(System.in);
		// 입력받은 정수를 5개로 제한한다 
		int count = 5;
		// => System 에 있는 out 인스턴스에서 제공하는 print 매서드를 이용하여 콘솔창에 문자열을 출력
		// 정수 입력 안내문구 출력
		System.out.println("정수를 입력하세요 : ");
		// 정수 배열에 저장될 정수 5개를 입력 받는다
		// => 5번 반복하기 위해 반복문을 작성
		// => i는 0부터 4까지 5번 반복
		for(int i = 0; i<count; i++) {
			// => scan.nextInt() 를 통해 입력 버퍼에 있는 값 중 정수 값을 가져옴
			// => 만약 입력 버퍼에 정수가 아닌 문자나 문자열이 있으면 예외가 발생
			// => 가져온 정수를 tmp 에 저장
			int tmp = scan.nextInt();
			// 리스트에 추가한다 => collection 에서 제공하는 add 매서드를 이용하여 리스트에 정수값을 추가
			// int 인 tmp 가 Integer 로 박싱이 되면서 리스트에 추가
			list.add(tmp);
		}
		// => 입력받은 정수 5개의 리스트를 출력한다
		// => 리스트에 있는 정수들을 반복문으로 가져와서 tmp 에 저장
		// => 가져온 Integer 의 인스턴스를 int 형으로 언박싱을 함
		for(int tmp : list) {
			// => 표준 출력에 정수를 출력
			System.out.println(tmp);
		}
	}

}
