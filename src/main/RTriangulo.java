package main;

public class RTriangulo extends Triangulo {
	
	public RTriangulo(float base, float altura) {
		super(base,altura);
	}

	@Override
	public float getArea(){
		return super.getArea();
		//return getBase()*getAltura()/2;
	}
		
	
	@Override
	public float getPerimetro() {
		float a = getAltura();
		float b = getBase();
		double res = Math.pow(a, 2) + Math.pow(b, 2);
		float c = (float) Math.sqrt(res);
		return a+b+c;
	}
	
	
}
