package com.interfaces.functional;



 public class Driver   {
  
	public static void main(String args[]) {
	
	CarDetails car = ( model, engine) -> {
	
	return "model: " + model +"," + " Engine: "+ engine;
		
	};
	
	System.out.println(car.details("BMW M4", "V8"));
	
}

}
