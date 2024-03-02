package com.curso.v6;
import java.util.Arrays;
import java.util.Comparator;

class Principal {
	
	public static void main(String[] args) {
		
		Comparator<Empleado> comparatorEdad = new Comparator<>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o2.edad - o1.edad;
			}
		};
		
		Comparator<Empleado> comparatorSueldo = new Comparator<>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return (int)(o2.sueldo - o1.sueldo);
			}
		};
		
		Comparator<Empleado> comparatorNombre = new Comparator<>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.nombre.compareTo(o2.nombre);
			}
		};
						
		System.out.println("V6");
		Empleado e1 = new Empleado("Patrobas",20,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",18,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
			
		Empleado[] empleados = {e1,e2,e3,e4};
		
		System.out.println("*** ORDENAR POR EDAD ***");
		Arrays.sort(empleados, comparatorEdad);
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		System.out.println("*** ORDENAR POR SUELDO ***");
		Arrays.sort(empleados, comparatorSueldo);
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		System.out.println("*** ORDENAR POR NOMBRE ***");
		Arrays.sort(empleados, comparatorNombre);
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		
	}

}
