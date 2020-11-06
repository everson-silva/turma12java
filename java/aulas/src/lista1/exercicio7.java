package lista1;
import java.util.Scanner;
public class exercicio7 {
	static Scanner teclado1 = new Scanner(System.in);

	public static void main(String[] args) {
		double a,b,c,d,ee,f,x,y;
		System.out.print( "Escreva o coeficientes a: ");
		a = teclado1.nextDouble();
		System.out.print( "Escreva o coeficientes b: ");
		b = teclado1.nextDouble();
		System.out.print( "Escreva o coeficientes c: ");
		c = teclado1.nextDouble();
		System.out.print( "Escreva o coeficientes d: ");
		d = teclado1.nextDouble();
		System.out.print( "Escreva o coeficientes e: ");
		ee = teclado1.nextDouble();
		System.out.print( "Escreva o coeficientes f: ");
		f = teclado1.nextDouble();
		x= ( ( c*ee)- ( b*f))/ ( ( a*ee)- ( b*d));
		y= ( ( a*f)- ( c*d))/ ( ( a*ee)- ( b*d));
		System.out.print( "O valor de x = "+x+" e y = "+y);

	}

}
