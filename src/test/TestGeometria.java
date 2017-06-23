package test;

import org.junit.Assert;
import org.junit.Test;

import main.Circulo;
import main.ETriangulo;
import main.Elipse;
import main.Geometria;
import main.ListGeometria;
import main.RTriangulo;
import main.Triangulo;

public class TestGeometria {
	
	//@Test
	public void testAdd(){
		ListGeometria listGeo = new ListGeometria();		
		
		listGeo.add(new RTriangulo(4, 3));
		listGeo.add(new ETriangulo(15));
		listGeo.add(new Circulo(2));
		listGeo.add(new Elipse(2,4));
		listGeo.add(new RTriangulo(100, 4));
		
		Assert.assertEquals(5, listGeo.size());
		
		Assert.assertEquals(RTriangulo.class, listGeo.get(0).getClass()); 
		Assert.assertEquals(ETriangulo.class, listGeo.get(1).getClass()); 
		Assert.assertEquals(Circulo.class, listGeo.get(2).getClass()); 
		Assert.assertEquals(Elipse.class, listGeo.get(3).getClass());
		Assert.assertEquals(RTriangulo.class, listGeo.get(4).getClass());
	}
	
	
	//@Test
	public void testSort(){
				
		//Creo el array esperado
		Geometria[] expecteds = new Geometria[3]; 		
		
		expecteds[0] = new RTriangulo(4, 3); 
		expecteds[1] = new ETriangulo(15); 
		expecteds[2] = new Circulo(2); 
				
		//agregar valores en desorden
		ListGeometria listGeo = new ListGeometria();		
		listGeo.add(expecteds[2]);
		listGeo.add(expecteds[0]);
		listGeo.add(expecteds[1]);
		
		Geometria[] result = listGeo.sortByLados(); 
		
		Assert.assertArrayEquals(expecteds,result);
			
	}
	
	
	
	//@Test
	public void testRemove(){
				
		//Expected
		Geometria[] expecteds = new Geometria[3]; 		
		expecteds[0] = new RTriangulo(4, 3);
		expecteds[1] = new ETriangulo(15);
		//Elimine el 2
		//expected[2] = new Circulo(2);
		expecteds[2] = new Elipse(2,4);
						
		//agregar valores
		ListGeometria listGeo = new ListGeometria();		
		listGeo.add(expecteds[0]);
		listGeo.add(expecteds[1]);
		//Envio el elemento a eliminar que seria el #2
		listGeo.add(new Circulo(2));
		listGeo.add(expecteds[2]);
		
		listGeo.remove(listGeo.get(2));
		
		Assert.assertEquals(3, listGeo.size());
		//busco los valores actuales
		Geometria[] actuals = new Geometria[listGeo.size()];
		for(int i=0; i<listGeo.size(); i++){
			actuals[i] = listGeo.get(i);
		}
		
		Assert.assertEquals(RTriangulo.class, listGeo.get(0).getClass());
		
		Assert.assertEquals(6, listGeo.get(0).getArea(),0.1);
		Assert.assertEquals(12, listGeo.get(0).getPerimetro(),0.1);
				
		Assert.assertArrayEquals(expecteds, actuals);			
	}
	
	
	@Test
	public void testGet() {

		// Expected
		Geometria[] expecteds = new Geometria[3];
		expecteds[0] = new RTriangulo(4, 3);
		expecteds[1] = new ETriangulo(15);
		expecteds[2] = new Elipse(2, 4);

		// agregar valores
		ListGeometria listGeo = new ListGeometria();
		listGeo.add(expecteds[0]);
		listGeo.add(expecteds[1]);
		listGeo.add(expecteds[2]);

		// busco los valores actuales
		Geometria[] actuals = new Geometria[listGeo.size()];
		for (int i = 0; i < listGeo.size(); i++) {
			actuals[i] = listGeo.get(i);
		}
		
		Assert.assertEquals(RTriangulo.class, listGeo.get(0).getClass());
		
		Assert.assertArrayEquals(expecteds, actuals);
	}
	
}
