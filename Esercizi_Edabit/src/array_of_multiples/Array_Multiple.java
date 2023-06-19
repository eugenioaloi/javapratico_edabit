package array_of_multiples;

import java.util.Arrays;

public class Array_Multiple {
	
	private static int[] arrayOfMultiples(int num, int length) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			int mult = i+1;
			arr[i] = num*mult;
		}
		return arr;   
	}
	
	public static void main(String[] args) {
		int[] arr = arrayOfMultiples(12,10);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
