package bssic_Arithmetic_Operations;

public class Basic_Arithmetic_Operations {
	
	/*Basic Arithmetic Operations
Write a function that does the following for the given values: add, subtract, divide and multiply. These are simply referred to as the basic arithmetic operations. The variables have to be defined, but in this challenge they will be defined for you. All you have to do is check the variables, do some string to integer conversions, use some if conditions, and apply the arithmetic operation.

Examples
operation("1",  "2",  "add" ) ➞ 3

operation("4",  "5",  "subtract") ➞ -1

operation("6",  "3",  "divide") ➞ 2
Notes
The numbers and operation are given as strings and should result in an integer value.
If the operation results in an ArithmeticException, then return Integer.MIN_VALUE (e.g. division by zero).
Division results will be rounded down to its integral part.
	 * */
	
	 public static int operation(String a, String b, String op) {
		int res = 0;
	   	try{
	        int num1 = Integer.parseInt(a);
	        int num2 = Integer.parseInt(b);
	        if(op.equalsIgnoreCase("add")) {
	        	res = num1+ num2;
	        }
	        else if(op.equalsIgnoreCase("subtract")) {
	        	res = num1- num2;
	        }
	        else if(op.equalsIgnoreCase("multiply")) {
	        	res = num1* num2;
	        }
	        if(op.equalsIgnoreCase("divide")) {
	        	try {
					int div = num1/ num2;
					res = div;
				} catch (ArithmeticException e) {
					//	if the operation results in an ArithmeticException, then return Integer.MIN_VALUE (e.g. division by zero).
					return Integer.MIN_VALUE;
				}
	        }
	    }
	    catch (NumberFormatException ex){
	        ex.printStackTrace();
	    }
		return res;
	}
	 
	public static void main(String[] args) {
		int res = operation("2","3","mul");
		System.out.println(res);
	}
	
	 
	
}
