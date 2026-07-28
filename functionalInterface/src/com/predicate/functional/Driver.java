package com.predicate.functional;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Driver {
public static void main(String[] args) {
	
	Predicate <Integer> predicate = (a) -> a < 100;
	
	System.out.println(predicate.test(80)); //true 
	System.out.println(predicate.test(143)); //false
	
	
	Supplier<String> supplier = () -> "Banglore"; 
    System.out.println(supplier.get());
    
    //otp generator
    
    Supplier<Integer> supplier3 = () -> 100000 + new Random().nextInt(900000);
    System.out.println("Your otp is : " + supplier3.get());
  }

}
