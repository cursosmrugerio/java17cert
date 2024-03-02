package com.curso.v1;

import com.curso.lambda.Predicado;
import com.curso.pojo.Empleado;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V1");
		Empleado e1 = new Empleado("Patrobas",15,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",17,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
		
		//DEFINICIONES DE LAMBDAS
		Predicado pre1 = emp -> emp.edad >= 18;
		Predicado pre2 = pato -> false;
		Predicado pre3 = x -> x.nombre.isEmpty();
		Predicado pre4 = w -> w.sueldo > 50;
			
		//EJECUTANDO LA LAMBDA
		boolean r = pre3.probar(e4);
		System.out.println(e4.nombre+ ": "+r);
		
		
		
	}

}
