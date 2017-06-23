package main;

public class ETriangulo extends Triangulo {
	
	private final static double SQUARE_ROOT3 = Math.sqrt(3);	
	
	public ETriangulo(float lado) {
		super(lado, computerAlturaFromBase(lado));		
		
	}
		
	
	@Override
	public float getArea(){
		return super.getArea();
		//return getBase()*getAltura()/2;
	}
		
	
	@Override
	public float getPerimetro() {
		return 3*getBase();
	}
	
	
	private static float computerAlturaFromBase(float base){
		return (float) SQUARE_ROOT3*base/2;
	}
	
	
	
}
