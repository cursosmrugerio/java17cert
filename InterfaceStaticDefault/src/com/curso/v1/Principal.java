package com.curso.v1;

import com.curso.pojo.Empleado;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V1");
		Empleado e1 = new Empleado("Patrobas",15,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",17,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
		
		Predicado.probarStatic();
		
		Predicado<String> pre01 = new Predicado<>() {
			@Override
			public boolean probar(String t) {
				return true;
			}
		};
		
		Predicado<Empleado> pre02 = x -> false;
		
		pre01.probarDefault();
		
		pre02.probarDefaultOtro();
		
		Predicado<String> pre03 = Predicado.returnPredicate();
		
		
		
	}

}
