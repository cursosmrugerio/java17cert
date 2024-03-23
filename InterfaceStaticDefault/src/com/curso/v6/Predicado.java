package com.curso.v6;

@FunctionalInterface
public interface Predicado<T> {

	boolean probar(T t);
	
	default Predicado<T> negateDefault(){
		return x -> !this.probar(x);
	}
	
	static <Z> Predicado<Z> negateStatic(Predicado<Z> p){
		return x -> !p.probar(x);
	}


}
