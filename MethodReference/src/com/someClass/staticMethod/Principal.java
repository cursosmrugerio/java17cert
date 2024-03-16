package com.someClass.staticMethod;

import java.util.function.*;

public class Principal {

	public static void main(String[] args) {
		
		BiPredicate<Integer,Integer> bp;
		//bp = (x,y)->Numero.sumaMayor10(x,y);
		bp = Numero::sumaMayor10;	
		System.out.println(bp.test(13, 5));
		
		//Function<String,String> f;
		UnaryOperator<String> uo;
		//uo = z -> Util.hacerExcitante(z);
		uo = Util::hacerExcitante;
		System.out.println(uo.apply("Hola"));
		
		Function<Integer,String> f = Principal::hacerRico;
		System.out.println(f.apply(2_000));
		
		BiFunction<Integer,String,String> bf = Principal::hacerRico;
		System.out.println(bf.apply(2_000,"Cadena"));
		
		TriFunction<Integer,String,Double,String> tf = Principal::hacerRico;
		System.out.println(tf.apply(2_000,"Cadena",4.0));

	}
	
	static String hacerRico(int i) {
		return i + "$$";
	}
	
	static String hacerRico(int i, String s) {
		return i + s.length() + "$$";
	}
	
	static String hacerRico(int i, String s, double d) {
		return i + d + s.length() + "$$";
	}
	
	static double elevarPotencia(double s1, double s2) {
		return Math.pow(s1, s2);
	}
	
	static String getParadigma() {
		return "Java Funcional";
	}

}
