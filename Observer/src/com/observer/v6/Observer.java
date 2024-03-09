package com.observer.v6;

public abstract class Observer {
				
	public Observer(Subject subject) {
		subject.attach(this);
	}

	abstract void update();

}
