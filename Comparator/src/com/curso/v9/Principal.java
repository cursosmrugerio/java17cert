package com.curso.v9;
import java.util.Arrays;
import java.util.Comparator;

class Principal {
	
	public static void main(String[] args) {
						
		System.out.println("V9#");
		Empleado e1 = new Empleado("Patrobas",20,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",18,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
			
		Empleado[] empleados = {e1,e2,e3,e4};
		
		System.out.println("*** ORDENAR POR EDAD ***");
		Arrays.sort(empleados, (x,y) -> x.edad - y.edad);
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		System.out.println("*** ORDENAR POR SUELDO ***");
		Arrays.sort(empleados, (o1,o2) -> (int)(o1.sueldo - o2.sueldo));
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		System.out.println("*** ORDENAR POR NOMBRE ***");
		Arrays.sort(empleados, (t, v) -> v.nombre.compareTo(t.nombre));
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		
	}

}
