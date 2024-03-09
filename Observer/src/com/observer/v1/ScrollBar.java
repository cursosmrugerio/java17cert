package com.observer.v1;

public class ScrollBar extends Observer {
	
	public void moveScroll() {
		System.out.println("Move ScrollBar");
	}

	@Override
	void update() {
		moveScroll();
	}

}
