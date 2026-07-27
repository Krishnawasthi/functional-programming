package com.interfaces.functional;

@FunctionalInterface
public interface CarDetails {
	
     public abstract String details(String model, String engine);
}
@FunctionalInterface
interface CarParts extends CarDetails {
	
	public abstract String details(String battery, String type);
	
	
	//. What is meaning of functional programming? Very high level, I'm saying.
		//	you're interested, in what to do. Instead of… how  it will… Happened.

	
}
