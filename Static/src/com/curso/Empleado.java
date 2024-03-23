package com.curso;

public class Empleado {
	
	String nombre;
	int edad;
	public static int contador;
	
	public Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		contador++;
	}
	
	public static int getContador() {
		return contador;
	}
	
	

}
