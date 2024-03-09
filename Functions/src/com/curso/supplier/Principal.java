package com.curso.supplier;

import java.util.function.Supplier;

import com.curso.pojo.Empleado;

public class Principal {
	
	public static void main(String... args) {
		
		//DEFINICION DE LAMBDA
		Supplier<Empleado> sup1 = () -> new Empleado();
		Supplier<Empleado> sup2 = () -> new Empleado("Patrobas",15);
		Supplier<Empleado> sup3 = () -> new Empleado("Epeneto",60,99.9);
		
		//EJUECUCION DE LAMBDA
		Empleado e1 = sup1.get();
		Empleado e2 = sup2.get();
		Empleado e3 = sup2.get();
		
		Supplier<String> sup4 = () -> "Epeneto";
		
		
//		Empleado e1 = new Empleado("Patrobas",15,45.5);
//		Empleado e2 = new Empleado("Andronico",30,15.5);
//		Empleado e3 = new Empleado("Tercio",17,80.8);
//		Empleado e4 = new Empleado("Epeneto",60,99.9);
	}

}
