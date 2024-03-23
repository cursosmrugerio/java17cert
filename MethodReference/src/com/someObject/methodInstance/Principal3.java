package com.someObject.methodInstance;

public class Principal3 {

	public static void main(String[] args) {

		String resultado;
		
		String cadena1 = "Hello ";
		String cadena2 = "Java Reactive";
		
		//resultado = cadena1.concat(cadena2);
		
		resultado = Utils.transforma(
				cadena2, z -> cadena1.concat(z));
		
		System.out.println(resultado);
		
		resultado = Utils.transforma(
				cadena2, z -> z);
		
		System.out.println(resultado);
		
		resultado = Utils.transforma(
				cadena2, z -> z.toUpperCase().replace('C', 'X'));
		
		System.out.println(resultado);

		
	}

}
