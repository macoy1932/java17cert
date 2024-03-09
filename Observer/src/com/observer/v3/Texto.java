package com.observer.v3;

public class Texto extends Observer {
	
	String texto; //HAS-A

	public Texto(String texto, Subject sub) {
		super(sub);
		this.texto = texto;
	}

	public void showTexto() {
		System.out.println("Texto: "+texto);
	}

	@Override
	void update() {
		showTexto();
	}

}
