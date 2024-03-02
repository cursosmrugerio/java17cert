package com.curso.v2;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		System.out.println("V2");
		Empleado e1 = new Empleado("Patrobas",20,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",18,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
			
		Empleado[] empleados = {e1,e2,e3,e4};
		
		Arrays.sort(empleados);
		
		//Ordenar por Nombre
		for (Empleado e:empleados)
			System.out.println(e);
		
		
	}

}
