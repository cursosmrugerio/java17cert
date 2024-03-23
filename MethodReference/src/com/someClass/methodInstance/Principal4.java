package com.someClass.methodInstance;

public class Principal4 {

	public static void main(String[] args) {

		String resultado;
		
		String cadena1 = "Hola Mundo ";
		String cadena2 = "Java Reactive";
				
		resultado = Utils.transforma(cadena1,
				cadena2, String::concat);
		
		System.out.println(resultado);
		

	}

}
