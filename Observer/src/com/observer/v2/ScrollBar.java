package com.observer.v2;

public class ScrollBar implements Observer {
	
	public void moveScroll() {
		System.out.println("Move ScrollBar");
	}

	@Override
	public void update() {
		moveScroll();
	}

}
