package com.payment.discount;

@FunctionalInterface  //SAM
interface IDiscount{
 
	int apply(int amount, int disc);

}
@FunctionalInterface //SAM 
interface IShoping extends IDiscount
{ 
	
	int apply(int amount, int disc);
	//int calc(int amount, int disc);  2 abstract methods so no Functional interface
}


public class Driver {

	public static void main(String[] args) {
	
		IDiscount discount = (amt, dsc) -> 
		{
			int disc = amt*dsc/100;
			
			return disc;
		};
		
		int result = discount.apply(1000, 20);
		System.out.println(result);
		
		
	}

}

