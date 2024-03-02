package com.inicio;

public class Principal6 {

	public static void main(String... args) {
		
		int i = 5;
		String s = "Hello";
		//s = null;
		StringBuilder sb = new StringBuilder("Hola");
		
		s = change(i,s,sb);
		
		System.out.println("i: "+i); //5
		System.out.println("String: "+s); // Hello World
		System.out.println("StringBulder: "+sb); // Hola Mundo

	}

	private static String change(int i, String s, StringBuilder sb) {
		
		i = 10;
		//s = s.concat(" World");
		sb.append(" Mundo");
		
		return s.concat(" World 2");
		
	}

}
