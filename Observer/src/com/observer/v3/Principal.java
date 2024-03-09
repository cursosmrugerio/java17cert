package com.observer.v3;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version 3");

		Mouse mouse = new Mouse();

		Observer obs1 = new Texto("Hello",mouse);
		Observer obs2 = new Image("Duck",mouse);
		Observer obs3 = new ScrollBar(mouse);
		
		mouse.click();

		System.out.println("*******");
		
		mouse.detach(obs2);
		Observer obs4 = new Gif("Coffee",45.0,mouse);

	
		mouse.click();
		
		
	}

}
