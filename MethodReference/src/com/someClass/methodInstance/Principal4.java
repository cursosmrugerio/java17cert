package com.someClass.methodInstance;

public class Principal4 {

	public static void main(String[] args) {

		String resultado;
		
		String cadena1 = "Hola ";
		String cadena2 = "Java Reactive";
				
		resultado = Utils.transforma(
				cadena2, cadena1::concat);
		
		System.out.println(resultado);
		

	}

}
