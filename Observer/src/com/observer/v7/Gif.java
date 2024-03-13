package com.observer.v7;

import java.util.Objects;

public class Gif extends Observer {

	String gif;
	double angulo;
	
	public Gif(String gif, double angulo, Subject sub) {
		super(sub);
		this.gif = gif;
		this.angulo = angulo;
	}
	
	void generateGif() {
		System.out.println("Gif: "+gif+", Angulo: "+angulo);
	}

	@Override
	void update() {
		generateGif();
	}

	@Override
	public int hashCode() {
		return Objects.hash(angulo, gif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gif other = (Gif) obj;
		return Double.doubleToLongBits(angulo) == Double.doubleToLongBits(other.angulo)
				&& Objects.equals(gif, other.gif);
	}

}
