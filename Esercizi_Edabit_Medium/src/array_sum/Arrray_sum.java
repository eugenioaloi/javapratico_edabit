package array_sum;

public class Arrray_sum {
	
	private static int solution(int[] arr) {
		//sommare tute le istanze dell'array
		int num = 0;
		if(arr.length==0) {
			return num;
		}else {
			for(int n:arr) {
				num+=n;
			}
		}
		return num;
	}
	
	public static void main(String [] args) {
		int arr[] = {1,2,3,4};
		System.out.println(solution(arr));
	}

}
