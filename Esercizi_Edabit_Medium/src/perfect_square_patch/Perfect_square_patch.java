package perfect_square_patch;

import java.util.Arrays;

public class Perfect_square_patch {
	
	public static int[][] squarePatch(int n) {
		int [][] array = new int[n][n];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j]= n;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(squarePatch(3)));
	}

}
