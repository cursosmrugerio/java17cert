package com.sinObserver;

public class Texto {
	
	String texto; //HAS-A

	public Texto(String texto) {
		this.texto = texto;
	}

	public void showTexto() {
		System.out.println("Texto: "+texto);
	}

}
