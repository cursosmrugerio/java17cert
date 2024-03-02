package com.curso.v0;

public class Empleado implements Comparable<Empleado> {
	
	String nombre;
	int edad;
	double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int compareTo(Empleado o) {
		if (this.edad > o.edad)
			return 1;
		else if (this.edad < o.edad)
			return -1;
		else
			return 0;
	}
	
}
