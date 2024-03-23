package com.someClass.methodInstance;

import java.util.function.BiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.BiPredicate;

public class Principal2 {
	
	public static void main(String[] args) {
		Principal2 pri2 = new Principal2();
		
		//BiFunction<Principal2,String,Integer> bf = 
		//		(p,s) -> p.getCantidadLetras(s);
				
		BiFunction<Principal2,String,Integer> bf = 
				Principal2::getCantidadLetras;
				
		System.out.println(bf.apply(pri2,"JAVA FUNCTIONAL"));
		
		//ToIntBiFunction<Principal2,String> tibf = (p,s) -> p.getCantidadLetras(s);
		
		ToIntBiFunction<Principal2,String> tibf = Principal2::getCantidadLetras;
		System.out.println(tibf.applyAsInt(pri2,"JAVA REACTIVE TTT"));
//		
//		System.out.println("****************");
//		
//		BiPredicate<Integer,Integer> bp = pri2::sumaMayor10;
//		System.out.println(bp.test(4, 5));
//		System.out.println(bp.test(6, 5));

		
	}
	
	
	int getCantidadLetras(String s) {
		return s.length();
	}
	
	boolean sumaMayor10(int x,int y) {
		return (x+y) > 10;
	}

}
