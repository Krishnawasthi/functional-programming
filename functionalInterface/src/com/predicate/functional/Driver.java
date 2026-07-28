package com.predicate.functional;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class Driver {
public static void main(String[] args) {
	
	
	//predicate 
	Predicate <Integer> predicate = (a) -> a < 100;   //predicate returns only boolean
	
	System.out.println(predicate.test(80)); //true 
	System.out.println(predicate.test(143)); //false
	
	//suppplier
	Supplier<String> supplier = () -> "Banglore"; 
    System.out.println(supplier.get());
    
    //otp generator
    
    Supplier<Integer> supplier3 = () -> 100000 + new Random().nextInt(900000);
    System.out.println("Your otp is : " + supplier3.get());
    
    //consumer
    
    Consumer<String> consumer = (emailTo) -> System.out.println("Email has been sent : " + emailTo );
      consumer.accept("kmawasthi.com");
      
    //function
     Function<Integer, Integer> function = (amt) -> amt=amt-(amt*5/100);
    
     System.out.println(function.apply(1000));
      
}


}
