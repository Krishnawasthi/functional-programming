package com.interfaces.functional;

import com.predicate.functional.Predicate;

public class Driver   {
  
	public static void main(String args[]) {
	Predicate<String > predicate = (a) -> a.equalsIgnoreCase("BMW M4");
	CarDetails car = ( model, engine) -> {
	
	return "model: " + model +"," + " Engine: "+ engine;
		
	};
	
	
	System.out.println(predicate.test("BMW M4"));
	System.out.println(car.details("BMW M4", "V8"));
	
}

}
