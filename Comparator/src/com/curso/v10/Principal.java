package com.curso.v10;
import java.util.Arrays;
import java.util.Comparator;

class Principal {
	
	public static void main(String[] args) {
						
		System.out.println("V10$");
		Empleado e1 = new Empleado("Patrobas",20,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",18,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
			
		Empleado[] empleados = {e1,e2,e3,e4};
		
		System.out.println("*** ORDENAR POR EDAD ***");
		show(empleados,(x,y) -> x.edad - y.edad);
		
		System.out.println("*** ORDENAR POR SUELDO ***");
		show(empleados,(o1,o2) -> (int)(o1.sueldo - o2.sueldo));
		
		System.out.println("*** ORDENAR POR NOMBRE ***");
		show(empleados,(t, v) -> v.nombre.compareTo(t.nombre));

	}
	
	static void show(Empleado[] empleados,Comparator<Empleado> comparador) {
		Arrays.sort(empleados,comparador);
		for (Empleado e:empleados)
			System.out.println(e);
	}

}
