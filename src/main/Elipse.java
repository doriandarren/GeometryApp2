package main;

public class Elipse extends Geometria {

	private float radioMayor;
	private float radioMenor;
		
	public Elipse(float radioMayor, float radioMenor) {
		super();
		this.radioMayor=radioMayor;
		this.radioMenor=radioMenor;
		this.setLados(Integer.MAX_VALUE);
	}
		
	@Override
	public float getArea(){		
		return (float) (Math.PI * radioMayor * radioMenor);
		
	}
	
	@Override
	public float getPerimetro() {		
		float raizInterna = (float) ((Math.pow(radioMayor,2) + Math.pow(radioMenor, 2))/2);	
		float res= (float) ((2 * Math.PI) * Math.sqrt(raizInterna));
		return res;
	}
	

	public float getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(float radioMayor) {
		this.radioMayor = radioMayor;
	}

	public float getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(float radioMenor) {
		this.radioMenor = radioMenor;
	}
	
}
