package war_numbers;

public class War_numbers {
	
	//return -1 if odd nums and even nums have the same result
	private static int warNumbers (int [] num) {
		int odd =0;
		int even =0;
		for(int n:num) {
			if(n%2==0) {
				even+=n;
			}else {
				odd += n;
			}
		}
		if(odd==even) {
			return -1;// odd and even are the same
		}
		return even>odd?even-odd:odd-even;
	}
	
	public static void main(String[] args) {
		int [] arr = {2, 10, 7, 5};
		int n = warNumbers(arr);
		System.out.println(n);
	}

}
