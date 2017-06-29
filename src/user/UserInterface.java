package user;

import main.Geometria;
import main.RTriangulo;
import util.Input;

public class UserInterface {
	
	public static void clearScreen(){		
		for(int i=0; i<50;i++){
			System.out.println();
		}
	}
	
	public static String menuScreem(){
		final String menuDescripcion[] = {"[1] Circulo", "[2] Elipse", "[3] Rectangulo", "[4] Triangulo Eq",
				"[5] Triangulo Rec","[7] Mostrar todos","(9) Exit"};		
		
		System.out.println("\n********************************************************************************************************");
		System.out.println("Hola! Calculo de  ");
		System.out.println("\t\t\t\t ***  Menú de Selección  ***");
		for(int i=0; i<menuDescripcion.length;i++){
			System.out.print(menuDescripcion[i]+"  ");
		}
		System.out.println("\n\n********************************************************************************************************");
		String opc = Input.scanLineSecure("Escriba su opción: ", 4,false);		
		return opc;
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
