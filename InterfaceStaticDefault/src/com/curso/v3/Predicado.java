package com.curso.v3;

@FunctionalInterface
public interface Predicado<T> {

	boolean probar(T t);
	
	static <T> Predicado<T> negate(Predicado<T> p){
		return x -> !p.probar(x);
	}

	static <T> Predicado<T> and(Predicado<T> pre1, Predicado<T> pre2) {
		return x -> (pre1.probar(x) && pre2.probar(x));
	}
	
	static <T> Predicado<T> or(Predicado<T> pre1, Predicado<T> pre2) {
		return x -> (pre1.probar(x) || pre2.probar(x));
	}
}
