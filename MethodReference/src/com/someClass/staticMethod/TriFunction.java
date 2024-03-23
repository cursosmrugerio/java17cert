package com.someClass.staticMethod;

@FunctionalInterface
public interface TriFunction<T, U, V, Z> {
	
	Z apply(T t, U u, V v);

}
