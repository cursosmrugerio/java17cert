package com.curso.v0;

import java.util.Comparator;

public class ComparatorEdad implements Comparator<Empleado> {

	@Override
	public int compare(Empleado x, Empleado y) {
		return x.edad - y.edad;
	}

}
