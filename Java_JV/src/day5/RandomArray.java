package day5;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[3];
		int min = 1, max = 9;
		
		//arr[0] = (int)(Math.random()*(max-min+1) + min);
		//arr[1] = (int)(Math.random()*(max-min+1) + min);
		//arr[2] = (int)(Math.random()*(max-min+1) + min);
		
		for(int i = 0; i<arr.length; i++)	{
			arr[1] = (int)(Math.random()*(max-min+1) + min);
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
