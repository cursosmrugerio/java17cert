package com.curso.v0;
import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		String name1 = "Patrobas";
		String name2 = "Andronico";
		String name3 = "Tercio";
		String name4 = "Epeneto";
		String name5 = "888";
		String name6 = "epeneto";

		//String[] names = new String[4];
		//names[0] = name1;
		
		String[] names = {name1,name2,name3,name4,name5,name6};
		
		Arrays.sort(names);
		
		for (String name:names)
			System.out.println(name);
		
	}

}
