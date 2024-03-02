package com.curso.v8;
import java.util.Arrays;
import java.util.Comparator;

class Principal {
	
	public static void main(String[] args) {
		
		Comparator<Empleado> comparatorEdad = (x,y) -> x.edad - y.edad;
		
		Comparator<Empleado> comparatorSueldo = (o1,o2) -> (int)(o1.sueldo - o2.sueldo);
		
		Comparator<Empleado> comparatorNombre = (t, v) -> v.nombre.compareTo(t.nombre);

						
		System.out.println("V8");
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
