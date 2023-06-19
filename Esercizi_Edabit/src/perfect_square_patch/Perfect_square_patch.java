package perfect_square_patch;

import java.util.Arrays;

public class Perfect_square_patch {
	
	private static void perfectSquare(int n) {
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n;
		}
		if(n==0) {
			System.out.println("[]");
		}
		for(int i=0;i<n;i++) {
			System.out.println(Arrays.toString(arr));
		}
		
	}
	
	public static void main(String[] args) {
		perfectSquare(0);
	}

}
