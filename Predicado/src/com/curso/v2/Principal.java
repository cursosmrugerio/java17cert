package com.curso.v2;

import com.curso.pojo.Empleado;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V2");
		Empleado e1 = new Empleado("Patrobas",15,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",17,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
		
		//DEFINICIONES DE LAMBDAS
		Predicado<Empleado> pre1 = emp -> emp.edad >= 18;
		Predicado<Empleado> pre2 = pato -> false;
		Predicado<Empleado> pre3 = x -> x.nombre.isEmpty();
		Predicado<Empleado> pre4 = w -> w.sueldo > 50;
		
		//EJECUTANDO LA LAMBDA
		boolean r = pre3.probar(e4);
		System.out.println(e4.nombre+ ": "+r);
		
		Predicado<String> pre5 = z -> z.isEmpty();
		System.out.println( pre5.probar("PATO"));
		
		
		
	}

}
