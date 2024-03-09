package com.sinObserver;

public class Mouse {
	
	//ALTO ACOPLAMIENTO
	Texto txt; //HAS-A
	Image img;
	ScrollBar sb;
	
	void click() {
		txt.showTexto();
		img.showImage();
		sb.moveScroll();
	}

}
