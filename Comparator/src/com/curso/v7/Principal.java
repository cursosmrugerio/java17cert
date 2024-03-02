package com.curso.v7;
import java.util.Arrays;
import java.util.Comparator;

class Principal {
	
	public static void main(String[] args) {
						
		System.out.println("V7");
		Empleado e1 = new Empleado("Patrobas",20,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",18,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
			
		Empleado[] empleados = {e1,e2,e3,e4};
		
		System.out.println("*** ORDENAR POR EDAD ***");
		Arrays.sort(empleados, 
						new Comparator<>() {
							@Override
							public int compare(Empleado o1, Empleado o2) {
								return o2.edad - o1.edad;
							}
						}
				);
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		System.out.println("*** ORDENAR POR SUELDO ***");
		Arrays.sort(empleados, 		
						new Comparator<>() {
							@Override
							public int compare(Empleado o1, Empleado o2) {
								return (int)(o2.sueldo - o1.sueldo);
							}
						}		
		);
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		System.out.println("*** ORDENAR POR NOMBRE ***");
		Arrays.sort(empleados, 
						new Comparator<>() {
							@Override
							public int compare(Empleado o1, Empleado o2) {
								return o1.nombre.compareTo(o2.nombre);
							}
						}		
		);
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		
	}

}
