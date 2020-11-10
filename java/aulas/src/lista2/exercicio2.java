package lista2;
import java.util.Scanner;
public class exercicio2 {
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
		int c,n;
		final double s=10.00,salE=20.00 ;
		final int h=50 ;
		double sT=0.0,hEx,sEx=0.0;
		System.out.print( "Entre com o codigo do operario: ");
		c = teclado1.nextInt();
		System.out.print( "Entre com o numero de horas trabalhadas do operario: ");
		n = teclado1.nextInt();
		if (n<h){
			sT =  n*s;
			System.out.print( " O salario total do operario "+c+" = R$ "+sT+ " e o salario excedente = R$ "+ sEx);
		}
		else {
			hEx = n-h;
			sEx = hEx*salE;
			sT = h*s;
			System.out.print( " O salario total do operario "+c+" = R$ "+sT+ " e o salario excedente = R$ "+ sEx);
		}

	}

}
