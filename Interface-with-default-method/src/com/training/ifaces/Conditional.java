package com.training.ifaces;

@FunctionalInterface
public interface Conditional<T> {
	
	public boolean test(T t);
	
	// using default key  we can more methods in functionalInterface and interface class
	
	
	default boolean negate(Double value) {
		return value<=80.0;
	}
	
	public static String getmessage() {
		return "Staic Method is interface -yes Its real";
	}
}
