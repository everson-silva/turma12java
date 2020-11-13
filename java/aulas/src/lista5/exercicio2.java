package lista5;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner teclado1 = new Scanner(System.in);
		double kg,al,imc;
		System.out.print( "Entrada com o peso em quilogramas (  ex 98.1): ");
		kg = teclado1.nextDouble();
		System.out.print( "Entrada com a altura em metros (  ex 1.90): ");
		al = teclado1.nextDouble();
		imc = kg/( al*al);
		System.out.print( "\nIMC = "+imc);
		if (imc>=18.5 && imc<=24.9)
		{
			System.out.print( "\nNo peso ideal");
		}
		else if (imc>24.9 && imc<=29.9)
		{
			System.out.print( "\nAcima do peso ideal. Procure ajuda medica e um nutricionista!");
		}
		else if (imc<18.5)
		{
			System.out.print( "\nAbaixo do peso ideal. Procure ajuda medica e um nutricionista!");
		}
		else 
		{
			System.out.print( "\nObesidade. Procure ajuda medica e um nutricionista!");
		}


	}

}
