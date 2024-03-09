package com.observer.v3;

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

}
