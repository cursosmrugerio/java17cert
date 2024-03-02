package com.curso.v4;
import java.util.Arrays;
import java.util.Comparator;

class Principal {
	
	//Class INNER CLASS
	private static class ComparatorEdad implements Comparator<Empleado> {
		@Override
		public int compare(Empleado o1, Empleado o2) {
			return o1.edad - o2.edad;
		}
	}
	
	private static class ComparatorSueldo implements Comparator<Empleado> {
		@Override
		public int compare(Empleado o1, Empleado o2) {
			return (int)(o2.sueldo - o1.sueldo);
		}
	}
	
	private static class ComparatorNombre implements Comparator<Empleado> {
		@Override
		public int compare(Empleado o1, Empleado o2) {
			return o1.nombre.compareTo(o2.nombre);
		}
	}

	public static void main(String[] args) {
						
		System.out.println("V4");
		Empleado e1 = new Empleado("Patrobas",20,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",18,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
			
		Empleado[] empleados = {e1,e2,e3,e4};
		
		System.out.println("*** ORDENAR POR EDAD ***");
		Arrays.sort(empleados, new ComparatorEdad());
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		System.out.println("*** ORDENAR POR SUELDO ***");
		Arrays.sort(empleados, new ComparatorSueldo());
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		System.out.println("*** ORDENAR POR NOMBRE ***");
		Arrays.sort(empleados, new ComparatorNombre());
		
		for (Empleado e:empleados)
			System.out.println(e);
		
		
	}

}
