package com.observer.v4;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version 4");

		Mouse mouse = new Mouse();

		new Texto("Hello",mouse);
		new Image("Duck",mouse);
		new ScrollBar(mouse);
		
		mouse.click();

		System.out.println("*******");
		
		new Gif("Coffee",45.0,mouse);

		mouse.click();
		
		
	}

}
