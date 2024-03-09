package com.sinObserver;

public class Principal {

	public static void main(String[] args) {
		
		Texto txt = new Texto("Hello");
		Image img = new Image("Duck");
		ScrollBar sb = new ScrollBar();

		Mouse mouse = new Mouse();
		mouse.txt = txt;
		mouse.img = img;
		mouse.sb = sb;
		
		mouse.click();
		
		
	}

}
