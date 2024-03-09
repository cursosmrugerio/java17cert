package com.observer.v1;

public class Texto extends Observer {
	
	String texto; //HAS-A

	public Texto(String texto) {
		this.texto = texto;
	}

	public void showTexto() {
		System.out.println("Texto: "+texto);
	}

	@Override
	void update() {
		showTexto();
	}

}
