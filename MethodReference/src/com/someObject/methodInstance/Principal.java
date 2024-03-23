package com.someObject.methodInstance;

import java.util.function.Consumer;

public class Principal {

	public static void main(String[] args) {

		Mecanico insMecanico = new Mecanico();
		Carro insCarro = new Carro(5,"Blue");
		
		//insMecanico.arreglar(insCarro); //OO
		
		//Definición lambda
		//Consumer<Carro> consumer = x -> insMecanico.arreglar(x);
		Consumer<Carro> consumer = insMecanico::arreglar;
		consumer.accept(insCarro);
		
		
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
