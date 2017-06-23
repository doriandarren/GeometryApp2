package user;

import main.Geometria;
import main.RTriangulo;

public class UserInterface {
	
	public static void clearScreen(){		
		for(int i=0; i<50;i++){
			System.out.println();
		}
	}	
		
	
	// Imprimir lista de registros
	public static void printListContacts(Geometria[] arrayObj) {
		System.out.println("Listar Todos");
		
		for(int i=0; i<arrayObj.length;i++){			
			if(arrayObj[i].getClass().isAssignableFrom(RTriangulo.class)){
				//RTriangulo canido = (RTriangulo) arrayGeo[i];
				System.out.println("RTriangulo: "
						+ "\nLados: " +arrayObj[i].getLados()
						+"\nArea: " + arrayObj[i].getArea()
						+ "\nPerimetro: " + arrayObj[i].getPerimetro());	
			}
			
		}

	}

	// Imprimir un solo registro
	public static void printContact(Geometria obj) {
		System.out.println("Detalle: ");		
			System.out.println("Clase: " + obj.getClass()
					+ "\nLados: " +obj.getLados()
					+"\nArea: " + obj.getArea()
					+ "\nPerimetro: " + obj.getPerimetro());
			System.out.println(" ");
		
	}

}
