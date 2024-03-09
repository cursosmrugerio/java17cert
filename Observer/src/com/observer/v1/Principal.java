package com.observer.v1;

public class Principal {

	public static void main(String[] args) {
		
		Observer obs1 = new Texto("Hello");
		Observer obs2 = new Image("Duck");
		Observer obs3 = new ScrollBar();
		Observer obs4 = new Gif("Coffee",45.0);

		Mouse mouse = new Mouse();
		mouse.attach(obs1);
		mouse.attach(obs2);
		mouse.attach(obs3);
		
		mouse.click();

		System.out.println("*******");
		mouse.detach(obs1);
		mouse.attach(obs4);
	
		mouse.click();
		
		
	}

}
