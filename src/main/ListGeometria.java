package main;

public class ListGeometria {

	private Geometria[] arrayGeometria;
	
	
	public ListGeometria(){
		arrayGeometria = new Geometria[0];
	}
	
	
	/**
	 * Obtiene el objeto que tiene el index i 
	 * @param i
	 * @return
	 */
	public Geometria get(int index) {
		return arrayGeometria[index];
	}
	
	/**
	 * Agrega un obejto al Array Lista
	 * @param geometria Objeto agregar
	 */
	public void add(Geometria geometria){
		Geometria[] copyArray = new Geometria[arrayGeometria.length+1];	
		for(int i=0;i<arrayGeometria.length;i++){
			copyArray[i]=arrayGeometria[i];
		}
		copyArray[arrayGeometria.length]=geometria;		
		
		arrayGeometria = copyArray;
		
	}
	

	
	/**
	 * Retorna el index del objeto
	 * @param geometria 
	 * @return
	 */
	public int indexOf(Geometria geometria){
		int index = -1; 
		for(int i=0; i<arrayGeometria.length; i++){
			if(arrayGeometria[i].equals(geometria)){
				index = i;
				break; 
			}
		}	
		return index; 
	}
	
	
	/**
	 * Elimina una objeto del la lista
	 * @param geometria
	 */
	public void remove(Geometria geometria) {
		remove(indexOf(geometria));		
	}
		
	public void remove(int index){
		if(index<0 || index>=arrayGeometria.length)
			return;
				
		Geometria[] removeContac = new Geometria[arrayGeometria.length-1];
		
		for(int i=0; i<removeContac.length;i++){
			if(i>=index){
				removeContac[i]=arrayGeometria[i+1]; 
			}else{
				removeContac[i]=arrayGeometria[i];
			}
		}
		arrayGeometria = removeContac;	
	}


	/**
	 * Obtiene el tamaño de la lista de objetos
	 * @return
	 */
	public int size() {
		return arrayGeometria.length;
	}
		
	
	/**
	 * Ordena los objetos de Mayor a Menor
	 * @return
	 */
	public Geometria[] sortByLados(){		
		Geometria[] arrayNew = new Geometria[arrayGeometria.length];		
		Geometria menor;
		
		//lleno el arreglo nuevo
		for(int i=0; i<arrayGeometria.length;i++){
			arrayNew[i]=arrayGeometria[i];
		}		
		
		//Recorro el arreglo nuevo verificando el 
		for(int i=0; i<arrayNew.length; i++){			
			for(int j=0; j<arrayNew.length; j++){
				if(arrayNew[i].getLados()<arrayNew[j].getLados()){
					menor=arrayNew[i];
					arrayNew[i]= arrayNew[j];
					arrayNew[j]=menor;
				}
			}
		}
		return arrayNew;
	}
	
	
	
}
