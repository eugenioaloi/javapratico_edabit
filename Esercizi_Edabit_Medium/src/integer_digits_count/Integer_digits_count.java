package integer_digits_count;

public class Integer_digits_count {
	
	private static int count(int n) {
		int size = 0;
		if(n<10) {
			size = 1;
		}else if(n<100) {
			size = 2;
		}else if(n<1_000) {
			size = 3;
		}else if(n<10_000) {
			size = 4;
		}else if(n<100_000) {
			size = 5;
		}else if(n<1_000_000) {
			size = 6;
		}
		return size;
	}

	public static void main(String[] args) {
		System.out.println(count(203105));
	}
}
