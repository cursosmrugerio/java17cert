package com.observer.v4;

import java.util.*;

public abstract class Subject {
	
	//HAS-A
	List<Observer> listaObserver;
	
	Subject(){
		listaObserver = new ArrayList<>();
	}
	
	void attach(Observer o) {
		listaObserver.add(o);
	}
	
	void detach(Observer o) {
		listaObserver.remove(o);
	}
	
	void notificar() {
		for (Observer o:listaObserver)
			o.update();
	}

}
