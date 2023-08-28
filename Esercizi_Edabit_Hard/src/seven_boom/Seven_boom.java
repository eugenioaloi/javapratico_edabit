package seven_boom;

public class Seven_boom {
	public static String sevenBoom(int[] arr) {
		for(int n:arr) {
			String s = Integer.toString(n);
			if(s.contains("7")) {
				return "boom";
			}
		}
		return "nope";
	}
	
	public static void main(String [] args) {
		int [] arr = {54596,6,9};
		System.out.println(sevenBoom(arr));
		
	}

}
