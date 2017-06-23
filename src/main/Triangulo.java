package main;

public class Triangulo extends Geometria {

	private static final int LADOS = 3;
	private float base;
	private float altura;
	
	public Triangulo(float base, float altura) {
		//super();
		this.base = base;
		this.altura = altura;
		this.setLados(LADOS);
	}
	
	
	@Override
	public float getArea(){
		return (base*altura)/2;				
	}
	
	@Override
	public float getPerimetro() {
		return 0;			
	}

	
	
	
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
