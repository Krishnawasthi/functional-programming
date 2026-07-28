package com.lambdaexpression.sum;

public class Driver {

	public static void main(String[] args) {
		
		MyInterface myInterface = (i , j) -> {
			
			int sum = i + j;
			
			return sum;
		
		};
		//so functional interface has only one method and 
		//  we don't need to write the signature of method,
		//writing lambda expression
		
		//sum
     	int result = myInterface.doCalc(4, 10);
         System.out.println(result);
		
		//subdstraction
		 myInterface = (i , j) -> i - j;
		 result = myInterface.doCalc(4, 10);
		 System.out.println(result);
	}

}
 