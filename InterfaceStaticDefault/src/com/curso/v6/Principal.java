package com.curso.v6;

import com.curso.pojo.Empleado;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("V6");
		Empleado e1 = new Empleado("Patrobas", 19, 55.5);

		Predicado<Empleado> pre1 = x -> x.getEdad() > 18;
		
		Predicado preNeg = Predicado.negateStatic(pre1);
		System.out.println("Resultado: "+preNeg.probar(e1));
		
		
	}

}
