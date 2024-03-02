package com.inicio;

public class Principal5 {

	public static void main(String... args) {
		
		int i = 5;
		String s = "Hello";
		//s = null;
		StringBuilder sb = new StringBuilder("Hola");
		
		change(i,s,sb);
		
		System.out.println("i: "+i); //5
		System.out.println("String: "+s); // Hello
		System.out.println("StringBulder: "+sb); // Hola Mundo

	}

	private static void change(int i, String s, StringBuilder sb) {
		
		i = 10;
		s = s.concat(" World");
		sb.append(" Mundo");
		
	}

}
