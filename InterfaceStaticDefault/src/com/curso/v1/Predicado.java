package com.curso.v1;

@FunctionalInterface
public interface Predicado<T> {
	
	boolean probar(T t);
	
	static void probarStatic() {
		System.out.println("Probar static");
	}
	
	default void probarDefault() {
		System.out.println("Probar default");
	}
	
	default void probarDefaultOtro() {
		System.out.println("Probar Otro default");
	}
	
	static String returnPredicado() {
		return "Hello";
	}
	
	static <T> Predicado<T> returnPredicate() {
		return x -> true; //Funciones de orden superior
	}
	
}
