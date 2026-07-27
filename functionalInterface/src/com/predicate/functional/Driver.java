package com.predicate.functional;

import java.awt.SystemTray;

public class Driver {
public static void main(String[] args) {
	
	Predicate <Integer> predicate = (a) -> a < 100;
}

Supplier<Integer> supplier2 = () -> 10000 + new Random().nextInt(90000000);
System.out.println("your otp is : "+ supplier2.get());

Consumer <String> consumer = (emailTo) -> System.out.println("email has bee sent : " + emailTo );

consumer.accept("kmawsthi@.com");
}
