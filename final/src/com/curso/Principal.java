package com.curso;

public class Principal {

	public static void main(String[] args) {

		final int x = 5;
		//x = 10; //NO SE PUEDE
		
		final StringBuilder sb = new StringBuilder("Hello");
		
		//System.out.println(sb.hashCode());
		
		sb.append(" World 2");
		
		//sb = new StringBuilder("Hola");
		//sb = null;
		
		System.out.println(sb);
		
		//System.out.println(sb.hashCode());

		
		
	}

}
