package com.curso.v3;

import com.curso.pojo.Empleado;

public class Principal {

	public static void main(String[] args) {
		
		boolean res;

		System.out.println("V1");
		Empleado e1 = new Empleado("Patrobas",19,55.5);
		Empleado e2 = new Empleado("Andronico",10,55.5);
		Empleado e3 = new Empleado("Tercio",17,80.8);
		Empleado e4 = new Empleado("Epeneto",60,49.9);
		
		Predicado<Empleado> pre1 = x -> x.getEdad()>18;
		Predicado<Empleado> pre2 = z -> z.getSueldo()>50;
		
		//AND
		Predicado<Empleado> pre3 = Predicado.and(pre1,pre2);
		//pre3 = w -> (w.getEdad()>18 && w.getSueldo()>50);
		
		res = pre3.probar(e1);
		System.out.println("and: "+res);
		
		//OR
		Predicado<Empleado> pre4 = Predicado.or(pre1,pre2);
		res = pre4.probar(e2);
		System.out.println("or: "+res);
		
		//NEGATE
		Predicado<Empleado> pre5 = Predicado.negate(pre2);
		res = pre5.probar(e4);
		System.out.println("negate: "+res);

		
		
	}

}
