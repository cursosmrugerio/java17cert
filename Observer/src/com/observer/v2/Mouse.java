package com.observer.v2;

import java.util.ArrayList;
import java.util.List;

public class Mouse implements Subject {

	// HAS-A
	List<Observer> listaObserver;

	Mouse() {
		listaObserver = new ArrayList<>();
	}

	@Override
	public void attach(Observer o) {
		listaObserver.add(o);
	}

	@Override
	public void detach(Observer o) {
		listaObserver.remove(o);
	}

	@Override
	public void notificar() {
		for (Observer o : listaObserver)
			o.update();
	}

	public void click() {
		notificar();
	}

}
