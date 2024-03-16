package com.curso.v4;

@FunctionalInterface
public interface Predicado<T> {

	boolean probar(T t);
	
	default Predicado<T> negate(){
		return x -> !this.probar(x);
	}

	default Predicado<T> and(Predicado<T> pre) {
		return x -> (this.probar(x) && pre.probar(x));
	}
	
	default Predicado<T> or(Predicado<T> pre) {
		return x -> (pre.probar(x) || this.probar(x));
	}
}
