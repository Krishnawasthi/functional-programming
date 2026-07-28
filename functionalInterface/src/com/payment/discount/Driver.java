package com.payment.discount;

interface IDiscount{
 
	int apply(int amount, int disc);

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

