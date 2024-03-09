package com.observer.v5;

public class ScrollBar extends Observer {
	
	ScrollBar(Subject sub){
		super(sub);
	}
	
	public void moveScroll() {
		System.out.println("Move ScrollBar");
	}

	@Override
	void update() {
		moveScroll();
	}

}
