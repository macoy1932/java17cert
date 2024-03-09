package com.observer.v5;

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

}
