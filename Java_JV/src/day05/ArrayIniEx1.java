package day05;

public class ArrayIniEx1 {

	public static void main(String[] args) {
		// arr1 배열에는 0번지 부터 5버지 까지 모ㅗ두 0으로 초기화 됨
		// char 는 \0, 실수는 0.0, boolean 는 false
		int arr1[] = new int[5];
		
		//arr2 는 0번지에1 1번지에 2 2번지에 3 으로 저장
		//arr2 는 총 5개의 크기를 가진 배열이 됨
		int arr2[] = new int[] {1,2,3,4,5,};
		arr2 = new int[] {3,4,5,6,7};
		//arr2 와 동일
		//arr3 와 같이 초기화 하는 경우 배열 선언과 동시에 초기화 하는 경우만 가능
		int arr3[] = new int[] {1,2,3,4,5,};
		//arr3[] = new int[] {1,2,3,4,5,}; => 애러 발생
	}

}
