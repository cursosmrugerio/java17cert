package com.curso.v2;

import com.curso.pojo.Empleado;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V1");
		Empleado e1 = new Empleado("Patrobas",15,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",17,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
		
		
		Predicado<Empleado> pre01 = x -> false;
		
		pre01.probarDefault();
		
		
	}

}
