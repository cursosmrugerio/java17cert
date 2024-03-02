package com.inicio;

public class Principal3 {

	public static void main(String... args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hello";
		String s4 = new String("Hello"); //1,2,4

		System.out.println(s1==s2); //true
		System.out.println(s1==s4); //false
		System.out.println(s1.equals(s4)); //true

		StringBuilder sb1 = new StringBuilder("Hola");
		StringBuilder sb2 = new StringBuilder("Hola");
		StringBuilder sb3 = new StringBuilder("Hola");

		sb3 = sb1;
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb3)); //false

	}

}
