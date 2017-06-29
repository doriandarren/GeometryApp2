package user;

import main.Circulo;
import main.ListGeometria;
import util.Input;

public class GeometryApp {

	public static void main(String[] args) {
		
		ListGeometria list = new ListGeometria();
		String opc = "";
		do {
			opc = UserInterface.menuScreem();

			switch (opc) {
			case "1":
				// Circulo
				float radio = Float.valueOf(Input.scanLineSecure("Ingrese el valor del radio: ", 4, false));
				System.out.println("El radio es: " + radio);
				Circulo circulo = new Circulo(radio);
				UserInterface.printContact(circulo);
				list.add(circulo);
				break;
			case "2":
				// Elipse
				break;
			case "3":
				// Rectangulo
				break;
			case "4":
				// Triangulo Eq
				break;
			case "5":
				// Triangulo Rec
				break;
			default:
				break;
			}
		} while (!opc.equals("9"));
		
	}

}
