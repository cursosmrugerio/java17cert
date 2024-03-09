package com.observer.v2;

public class Gif implements Observer {
	
	String gif;
	double angulo;
	
	public Gif(String gif, double angulo) {
		this.gif = gif;
		this.angulo = angulo;
	}
	
	void generateGif() {
		System.out.println("Gif: "+gif+", Angulo: "+angulo);
	}


	@Override
	public void update() {
		generateGif();
	}

}
