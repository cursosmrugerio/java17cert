package com.curso.inicio;

import com.curso.Empleado;
//import static com.curso.Empleado.contador;
//import static com.curso.Empleado.getContador;
import static com.curso.Empleado.*;


public class Principal {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Patrobas",25);
		Empleado e2 = new Empleado("Filologo",15);
		Empleado e3 = new Empleado("Epeneto",35);
		
		System.out.println(contador);
		
		System.out.println(getContador());


	}

}
