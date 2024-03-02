package com.curso.v0;
import java.util.Arrays;

public class Principal2 {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Patrobas",20,45.5);
		Empleado e2 = new Empleado("Andronico",30,95.5);
		Empleado e3 = new Empleado("Tercio",18,20.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
			
		Empleado[] empleados = {e1,e2,e3,e4};
		
		Arrays.sort(empleados);
		
		for (Empleado e:empleados)
			System.out.println(e);
		
	}

}
