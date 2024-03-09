package com.curso.consumer;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.function.BiFunction;

import com.curso.pojo.Empleado;

public class Principal {
	
	public static void main(String... args) {
		
		Empleado e1 = new Empleado("Patrobas",15,45.5);
		
		//DEFINICION DE LAMBDA
		Consumer<Empleado> sup1 = x -> System.out.println(x);
		
		//EJUECUCION DE LAMBDA
		sup1.accept(e1);
		
		//UnaryOperator
		UnaryOperator<Double> uo1 = z -> Math.pow(z, 2);
		double r = uo1.apply(11.0);
		System.out.println(r);
		
		BiFunction<String,Integer,Empleado> bf1 = 
				(s,i) -> new Empleado(s,i);
				
		Empleado e2 = bf1.apply("Epeneto", 20);
		
		System.out.println(e2);
		
	
	}

}
