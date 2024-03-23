package com.curso.v2;

@FunctionalInterface
public interface Predicado<T> {
	
	//abstract , sin comportamiento 
	//static , con comportamiento V8
	//default , con comportamiento V8
	//private , con comportamiento V9
	//private static , con comportamiento V9
	
	boolean probar(T t);
	
	static void probarStatic() {
		System.out.println("Probar static");
	}
	
	private static void probarStaticOtro() {
		System.out.println("Probar static private");
	}
	
	default void probarDefault() {
		System.out.println("Probar default");
		probarStaticOtro();
		probarDefaultOtro();
	}
	
	private void probarDefaultOtro() {
		System.out.println("Probar default private");
	}
	
	static <T> Predicado<T> returnPredicate() {
		return x -> true; //Funciones de orden superior
	}
	
}
