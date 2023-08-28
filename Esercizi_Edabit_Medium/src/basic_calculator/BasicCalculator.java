package basic_calculator;

public class BasicCalculator {
	
	public static Object basicCalculator(int a, Object o, int b) {
		if(o == "+") {
			return a + b;
		} 
		if(o == "-") {
			return a - b;
		} 
		if(o == "*") {
			return a * b;
		}
		if(o == "/") {
			return (a==0 || b==0)? null : a / b; 	
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(basicCalculator(0, "/", 3));
	}

}
