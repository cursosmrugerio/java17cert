package com.observer.v7;

import java.util.Objects;

public class Texto extends Observer {
	
	String texto; 

	public Texto(String texto, Subject sub) {
		super(sub);
		this.texto = texto;
	}

	public void showTexto() {
		System.out.println("Texto: "+texto);
	}

	@Override
	void update() {
		showTexto();
	}
	
	@Override
	public boolean equals(Object obj) {
		Texto other = (Texto) obj;
		return Objects.equals(texto, other.texto);
	}
	
}
