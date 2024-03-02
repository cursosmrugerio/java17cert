package com.curso.v0;

import com.curso.lambda.Predicado;
import com.curso.pojo.Empleado;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V0");
		Empleado e1 = new Empleado("Patrobas",15,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",17,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
		
		Predicado mayorEdad = new Predicado() {
			@Override
			public boolean probar(Empleado e) {
				return e.edad >= 18;
			}
		};
			
		boolean r = mayorEdad.probar(e1);
		System.out.println(e1.nombre+ ": "+r);
		
		
		
	}

}
