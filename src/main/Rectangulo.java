package main;

public class Rectangulo extends Geometria {

	private float ancho;
	private float alto;
	
	public Rectangulo(float ancho, float alto) {
		super();
		this.ancho=ancho;
		this.alto=alto;
		this.setLados(4);
	}
	
	
	@Override
	public float getArea(){
		return ancho*alto;		
	}

	@Override
	public float getPerimetro() {				
		return (ancho*2) + (alto*2);
	}

	public float getAncho() {
		return ancho;
	}

	public void setAncho(float ancho) {
		this.ancho = ancho;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

}
