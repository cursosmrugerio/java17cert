package com.observer.v2;

public class Image implements Observer {
	
	String img;

	public Image(String img) {
		this.img = img;
	}

	public void showImage() {
		System.out.println("Image: "+img);
	}

	@Override
	public void update() {
		showImage();
	}

}
