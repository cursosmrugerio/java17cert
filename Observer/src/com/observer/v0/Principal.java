package com.observer.v0;

public class Principal {

	public static void main(String[] args) {
		
		Texto txt = new Texto("Hello");
		Image img = new Image("Duck");
		ScrollBar sb = new ScrollBar();

		Mouse mouse = new Mouse();
		mouse.attach(txt);
		mouse.attach(sb);
		mouse.attach(img);
		
		mouse.click();

		System.out.println("*******");
		mouse.detach(txt);
	
		mouse.click();
		
		
	}

}
