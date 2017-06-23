package main;

public abstract class Geometria {

	private int lados;
	
	
	public Geometria(){
		this.lados=0;
	}
	
	
	public float getArea(){
		return 0;
	}
	
	
	public abstract float getPerimetro();


	public int getLados() {
		return lados;
	}


	public void setLados(int lados) {
		this.lados = lados;
	}
	
	@Override
	public String toString(){
		return "Geometria numeros lados " + getLados() + " ";
	}
	
	
}
