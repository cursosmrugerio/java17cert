package com.observer.v2;

import java.util.ArrayList;
import java.util.List;

public class Mouse implements Subject {

	// HAS-A
	List<Observer> listaObserver;

	Mouse() {
		listaObserver = new ArrayList<>();
	}

	void attach(Observer o) {
		listaObserver.add(o);
	}

	void detach(Observer o) {
		listaObserver.remove(o);
	}

	void notificar() {
		for (Observer o : listaObserver)
			o.update();
	}

	void click() {
		notificar();
	}

}
