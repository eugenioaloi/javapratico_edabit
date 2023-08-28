package countLetters;

public class CountLetters {
	
	public static int letterCounter(char[][] arr, char c) {
		int count = 0;
		for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==c) {
                	count++;
                }
            }
        }
		return count;
	}

	public static void main(String[] args) {
		char [][] arr = {{'D', 'E', 'Y', 'H', 'A', 'D'},
				{'C', 'B', 'Z', 'Y', 'J', 'K'},
				{'D', 'B', 'C', 'A', 'M', 'N'},
				{'F', 'G', 'G', 'R', 'S', 'R'},
				{'V', 'X', 'H', 'A', 'S', 'S'}};
		System.out.println(letterCounter(arr, 'D'));	
	}
}
