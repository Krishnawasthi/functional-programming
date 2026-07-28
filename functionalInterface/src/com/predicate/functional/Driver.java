package com.predicate.functional;

import java.util.function.Predicate;

public class Driver {
public static void main(String[] args) {
	
	Predicate <Integer> predicate = (a) -> a < 100;
	System.out.println(predicate.test(80));
	System.out.println(predicate.test(143));

 }

}
