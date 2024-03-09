package com.curso.v3;

import com.curso.pojo.Empleado;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V3");
		Empleado e1 = new Empleado("Patrobas",15,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",17,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
		
		//DEFINICIONES DE LAMBDAS
		Predicate<Empleado> pre1 = emp -> emp.edad >= 18;
		Predicate<Empleado> pre2 = pato -> false;
		Predicate<Empleado> pre3 = x -> x.nombre.isEmpty();
		Predicate<Empleado> pre4 = w -> w.sueldo > 50;
		
		//EJECUTANDO LA LAMBDA
		boolean r = pre3.test(e4);
		System.out.println(e4.nombre+ ": "+r);
		
		Predicate<String> pre5 = z -> z.isEmpty();
		System.out.println( pre5.test(""));
		
		
		
	}

}
