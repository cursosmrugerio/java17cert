package com.someClass.methodInstance;

import java.util.function.BiConsumer;

public class Principal {

	public static void main(String[] args) {

		Mecanico insMecanico = new Mecanico();
		Carro insCarro = new Carro(99,"Blue");
				
		//Definición lambda
		//BiConsumer<Mecanico,Carro> biconsumer = (m,c) -> m.arreglar(c);
		BiConsumer<Mecanico,Carro> biconsumer = Mecanico::arreglar;
		
		biconsumer.accept(insMecanico,insCarro);
				
	}

}

class Carro{
	int id;
	String color;
	
	public Carro(int id, String color) {
		this.id = id;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Carro [id=" + id + ", color=" + color + "]";
	}
	
}

class Mecanico{
	void arreglar(Carro c) {
		System.out.println("Reparando carro: "+c);
	}
}
