package basic_calculator;

public class BasicCalculator {
	
	public static Integer basicCalculator(int a, String o, int b) {
		Integer result = 0;
		if(o != "+"||o != "-"||o != "/"||o != "*"||o != "*"||b==0) {
			result = null;
		}
		if(o == "+") {
			result = a + b;
		} 
		if(o == "-") {
			result =  a - b;
		} 
		if(o == "/") {
			
		}
			
			result =  a / b;
		if(o == "*") result =  a * b;
		return result;
	}
	
	public static void main(String[] args) {
		int n= basicCalculator(2, "+", 3);
		System.out.println(n);
	}

}
