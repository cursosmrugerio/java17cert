package com.observer.v7;

import java.util.*;

public abstract class Subject {

	// HAS-A
	List<Observer> listaObserver;

	Subject() {
		listaObserver = new ArrayList<>();
	}

	void attach(Observer o) {
		listaObserver.add(o);
	}

	void detach(Observer o) {
		listaObserver.removeIf(obs -> obs.equals(o));
	}

	void notificar() {
		for (Observer o : listaObserver)
			o.update();
	}

}
