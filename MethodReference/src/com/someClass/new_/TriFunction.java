package com.someClass.new_;

@FunctionalInterface
public interface TriFunction<T, U, V, Z> {
	
	V apply(T t, U u, Z z);

}
