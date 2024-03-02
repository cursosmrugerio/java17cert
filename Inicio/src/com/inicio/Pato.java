package com.inicio;

public class Pato {

	
	public static void main(String[] args) {
		
		String nombre = "Andronico";
		for(int i=0; i<1_0; i++ )
			System.out.println(nombre.concat(""+i));
		
		StringBuilder name = new StringBuilder("Patrobas");
		for(int i=0; i<1_0; i++ )
			System.out.println(name.append(i));
		
		StringBuilder sb1 = new StringBuilder("Anitalavalatina");
		
		System.out.println(sb1.reverse());
		
		String cadena = name.toString();
		
	}
	
	
}
