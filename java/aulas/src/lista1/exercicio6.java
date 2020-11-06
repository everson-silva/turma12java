package lista1;
import java.util.Scanner;
import java.lang.Math;
public class exercicio6 {
	static Scanner teclado1 = new Scanner(System.in);

	public static void main(String[] args) {
		double x1,x2,y1,y2,d;
		System.out.print( "A coordenada x do ponto 1: ");
		x1 = teclado1.nextDouble();
		System.out.print( "\nA coordenada y do ponto 1: ");
		y1 = teclado1.nextDouble();
		System.out.print( "\nA coordenada x do ponto 2: ");
		x2 = teclado1.nextDouble();
		System.out.print( "\nA coordenada y do ponto 2: ");
		y2 = teclado1.nextDouble();
		d = Math.sqrt( ( ( Math.pow ( ( x2-x1), 2.0)) + ( Math.pow ( ( y2-y1), 2.0))));
		System.out.print( "\nA distância entre esses dois pontos = "+d);

	}

}
