package com.observer.v6;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Version 6");

		Mouse mouse = new Mouse();
		
		Observer ob1 = new Texto("Hello",mouse);
		new Image("Duck",mouse);
		new ScrollBar(mouse);		
		new Gif("Coffee",45.0,mouse);

		mouse.click();
		
		System.out.println("******");
		
		mouse.detach(ob1);
		
		mouse.click();

		
		
		
		
	}

}
