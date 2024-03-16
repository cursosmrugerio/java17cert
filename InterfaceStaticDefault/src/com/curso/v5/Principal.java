package com.curso.v5;

import com.curso.pojo.Empleado;
import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {

		boolean res;

		System.out.println("V4");
		Empleado e1 = new Empleado("Patrobas", 19, 55.5);
		Empleado e2 = new Empleado("Andronico", 10, 45.5);
		Empleado e3 = new Empleado("Tercio", 17, 80.8);
		Empleado e4 = new Empleado("Epeneto", 60, 59.9);

		Predicate<Empleado> pre1 = x -> x.getEdad() > 18;
		Predicate<Empleado> pre2 = z -> z.getSueldo() > 50;

		// NEGATE
		Predicate<Empleado> pre5 = pre2.negate();
		res = pre5.test(e4);
		System.out.println("negate: " + res);

		// AND
		Predicate<Empleado> pre3 = pre1.and(pre2);
		res = pre3.test(e2);
		System.out.println("and: " + res);

		// OR
		Predicate<Empleado> pre4 = pre2.or(pre1);
		res = pre4.test(e2);
		System.out.println("or: " + res);

	}

}
