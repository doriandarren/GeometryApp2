package main;

public class Circulo extends Geometria {

	private float radio;
	
	public Circulo(float radio) {
		super();
		this.radio = radio;
		this.setLados(Integer.MAX_VALUE);
	}
	
	
	@Override
	public float getArea(){
		return (float) (Math.PI*Math.pow(radio,2));		
	}
	
	@Override
	public float getPerimetro() {			
		return (float) ((2f*Math.PI)*radio);
	}
	
	
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}
	
}
