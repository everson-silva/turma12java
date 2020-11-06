package lista1;
import java.util.Scanner;
import java.lang.Math;
public class exercicio4 {
	static Scanner teclado1 = new Scanner(System.in);

	public static void main(String[] args) {
		double d,r,s;
		int a,b,c;
		System.out.print( "Entre com o valor de um numero inteiro positivo A: ");
		a = teclado1.nextInt();
		System.out.print( "\nEntre com o valor de um numero inteiro positivo B: ");
		b = teclado1.nextInt();
		System.out.print( "\nEntre com o valor de um numero inteiro positivo C: ");
		c = teclado1.nextInt();
		r = Math.pow( ( a+b), 2.0);
		s = Math.pow( ( b+c), 2.0);
		d = ( r+s)/2;
		System.out.print( "O valor de D = " +d );

	}

}
