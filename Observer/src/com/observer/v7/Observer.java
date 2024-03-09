package com.observer.v7;

import java.util.List;

public abstract class Observer {
				
	public Observer(Subject subject) {
		
		List<Observer> lista = subject.listaObserver;
		
		for (Observer o: lista) {
			System.out.println(o);
			if (o instanceof Texto) {
				Texto tx = (Texto) o;
				if (tx.equals(this))
					System.out.println("IGUAL");
			}
		}
			
		subject.attach(this);
	}

	abstract void update();

}
