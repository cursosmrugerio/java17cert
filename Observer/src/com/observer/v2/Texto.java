package com.observer.v2;

public class Texto implements Observer {
	
	String texto; //HAS-A

	public Texto(String texto) {
		this.texto = texto;
	}

	public void showTexto() {
		System.out.println("Texto: "+texto);
	}

	@Override
	public void update() {
		showTexto();
	}

}
