package modeladoSinAbstractFactory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int seleccion = 0;
		Scanner sc = new Scanner(System.in);
		seleccion = sc.nextInt();
		
		if(seleccion == 1) {
			Square cuadrado = new Square();
			cuadrado.draw();
			System.out.print(" " + cuadrado.tipo);
		}
		else if(seleccion == 2) {
			Rectangle rectangulo = new Rectangle();
			rectangulo.draw();
			System.out.print(" " + rectangulo.tipo);
		}
		else if(seleccion == 3) {
			RoundedRectangle elipse = new RoundedRectangle();
			elipse.draw();
			System.out.print(" " + elipse.tipo);
		}
		else if(seleccion == 4) {
			RoundedSquare circulo = new RoundedSquare();
			circulo.draw();
			System.out.print(" " + circulo.tipo);
		}
	}

}
