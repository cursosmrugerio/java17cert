package com.observer.v7;

import java.util.Objects;

public class Image extends Observer {
	
	String img;

	public Image(String img, Subject sub) {
		super(sub);
		this.img = img;
	}

	public void showImage() {
		System.out.println("Image: "+img);
	}

	@Override
	void update() {
		showImage();
	}

	@Override
	public int hashCode() {
		return Objects.hash(img);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Image other = (Image) obj;
		return Objects.equals(img, other.img);
	}

}
