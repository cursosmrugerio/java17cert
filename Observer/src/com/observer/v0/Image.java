package com.observer.v0;

public class Image extends Observer {
	
	String img;

	public Image(String img) {
		this.img = img;
	}

	public void showImage() {
		System.out.println("Image: "+img);
	}

	@Override
	void update() {
		showImage();
	}

}
