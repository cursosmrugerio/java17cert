package com.observer.v7;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version 7 Final");

		Mouse mouse = new Mouse();
		
		new Texto("Hello",mouse);
		new Image("Duck",mouse);
		new ScrollBar(mouse);		
		new Gif("Coffee",45.0,mouse);
		mouse.click();
		
		System.out.println("******");
		
		mouse.detach(new Texto("Hello",mouse));
		mouse.detach(new Image("Duck",mouse));
		mouse.click();
		
		System.out.println("******");
		
		new Texto("Hola",mouse);
		mouse.detach(new Gif("Coffee",45.0,mouse));
		mouse.click();

	}

}
