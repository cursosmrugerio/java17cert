package com.someClass.new_;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.*;

public class Principal {

	public static void main(String[] args) {
		
//		Persona per1 = new Persona();
//		System.out.println(per1.toString());
		
		Persona persona;
		
		//Supplier<Persona> sup = () -> new Persona();
		Supplier<Persona> sup = Persona::new;
		persona = sup.get();
		System.out.println(persona);
		
		//Function<Integer,Persona> fun = x -> new Persona(x);
		Function<Integer,Persona> fun = Persona::new;
		persona = fun.apply(10);
		System.out.println(persona);
		
		BiFunction<Integer,String,Persona> bf = Persona::new;
		persona = bf.apply(20,"Filologo");
		System.out.println(persona);
		
		TriFunction<Integer,String,Persona, Boolean> tf = Persona::new;
		persona = tf.apply(30,"Epeneto",true);
		System.out.println(persona+"***");

		Supplier<List<Double>> supLista = 
				ArrayList<Double>::new;
		List<Double> lista = supLista.get();
		System.out.println(lista);
		
		//Integer integer = new Integer("3");
		Function<String,Integer> fun1 = Integer::new;
		System.out.println(fun1.apply("3"));
		
		BiFunction<String,String,Locale> locBi = Locale::new;
		Locale loc = locBi.apply("en","UK");
		System.out.println(loc);

	}

}
