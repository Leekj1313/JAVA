package day05;

import java.util.Arrays;

public class ArraySortEx1 {

	public static void main(String[] args) {
		// 배열졍렬 방법
		int arr[] = new int[] {1,3,5,7,2,4,6,8};
		
		
		// 버블정렬
		/* 옆에 인접한 값을 비교하여 정렬하는 방식
		 * 1 3 5 7 2 4 6 8
		 * 내림차 순일 때 오른쪽으로 비교 시작
		 */
		for(int i = 0; i<arr.length - 1; i++) {
			for(int j = 0; j<arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) { 	// 변수를 추가하여 교환
					int tmp = arr[j];	// a = c
										// c = b
										// b = a
					arr[j]= arr[j+1];
					arr[j+1] = tmp;
			}
		}
	}
	for(int j = 0; j<arr.length - 1; j++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	
	int arr2[] = {1,3,5,7,9,2,4,6,8};
	//오름차순으로 정렬해줌 <sort> = 퀵정렬
	Arrays.sort(arr2);
	
	for(int j = 0; j<arr.length - 1; j++) {
		System.out.print(arr2[i] + " ");
	}
	System.out.println();
}
}
