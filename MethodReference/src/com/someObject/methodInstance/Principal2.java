package com.someObject.methodInstance;

import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.function.BiPredicate;

public class Principal2 {
	
	public static void main(String[] args) {
		Principal2 pri2 = new Principal2();
		//Function<String,Integer> f = s -> pri2.getCantidadLetras(s);
		Function<String,Integer> f = pri2::getCantidadLetras;
		System.out.println(f.apply("JAVA FUNCTIONAL"));
		
		//ToIntFunction<String> tif = s -> pri2.getCantidadLetras(s);
		ToIntFunction<String> tif = pri2::getCantidadLetras;
		System.out.println(tif.applyAsInt("JAVA REACTIVE"));
		
		System.out.println("****************");
		
		BiPredicate<Integer,Integer> bp = pri2::sumaMayor10;
		System.out.println(bp.test(4, 5));
		System.out.println(bp.test(6, 5));

		
	}
	
	
	int getCantidadLetras(String s) {
		return s.length();
	}
	
	boolean sumaMayor10(int x,int y) {
		return (x+y) > 10;
	}

}
