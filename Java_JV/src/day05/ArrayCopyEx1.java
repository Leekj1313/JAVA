package day05;

public class ArrayCopyEx1 {

	public static void main(String[] args) {
		// 배열복사예제
		int arr1 [] = new int[] {1,2,3,4,5};
		int arr2 [] = arr1;
		int arr3 [] = new int[arr1. length];
		int arr4 [] = new int[arr1. length];
		for(int i = 0; i<arr1.length; i ++) {
			arr3[i] = arr1[i];
		}
		
		System.arraycopy(arr1, 0, arr4, 0, arr1.lenght);
		
		
		arr1[0] = 10;
		
		for(int i = 0; i<5; i++) {
			System.out.print(arr2[i]);
		}
			System.out.print("arr3 확인 : ");
		for(int i = 0; i<5; i++) {
			System.out.print(arr3[i] + " ");
			
			System.out.print("\narr4 확인 : ");
			
		for(int i = 0; i<5; i++) {
			System.out.print(arr4[i] + " ");
		int arr5[] = new int[arr1.length];
				
			System.arraycopy(arr1, 0, arr5, 0, 0,2);
			
			System.out.print("\narr5 확인 : ");
		for(int i = 0; i<5; i++) {
			System.out.print(arr5[i] + " ");
				
			
		}
	}

}
