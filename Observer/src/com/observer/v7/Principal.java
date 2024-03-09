package com.observer.v7;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version 7");

		Mouse mouse = new Mouse();
		
		new Texto("Hello",mouse);
		new Image("Duck",mouse);
		new ScrollBar(mouse);		
		new Gif("Coffee",45.0,mouse);

		mouse.click();
		
		System.out.println("******");
		
		mouse.detach(new Texto("Hello",mouse));
		
		mouse.click();

		
		
		
		
	}

}
