package com.observer.v0;

public class ScrollBar extends Observer {
	
	public void moveScroll() {
		System.out.println("Move ScrollBar");
	}

	@Override
	void update() {
		moveScroll();
	}

}
