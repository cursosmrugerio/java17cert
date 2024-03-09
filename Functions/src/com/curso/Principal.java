package com.curso;

import com.curso.pojo.Empleado;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		Empleado e1 = new Empleado("Patrobas",15,45.5);
		Empleado e2 = new Empleado("Andronico",30,15.5);
		Empleado e3 = new Empleado("Tercio",17,80.8);
		Empleado e4 = new Empleado("Epeneto",60,99.9);
		
		List<Empleado> listaEmpleados = new ArrayList();
		listaEmpleados.add(e1);
		listaEmpleados.add(e2);
		listaEmpleados.add(e3);
		listaEmpleados.add(e4);
		
		//listaEmpleados.forEach(t -> System.out.println(t));
		listaEmpleados.forEach(System.out::println);
		
		System.out.println("*********");
		
//		for (Empleado e: listaEmpleados)
//			System.out.println(e);

		
	}

}
