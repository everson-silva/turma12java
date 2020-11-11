package lista3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner teclado1 = new Scanner(System.in);
		
		int n,soma=0,contador=0;
		System.out.print( "Digite um numero inteiro positivo: ");
		n = teclado1.nextInt();
		
		while (n<0)
		{
			System.out.print( "Error! Digite um numero inteiro positivo: ");
			n = teclado1.nextInt();
			
		}
		do
		{
			soma = soma+( 1*contador);
			contador++;
		} while (contador<=n);
		System.out.print( "A soma de todos os numeros de 1 até "+n+" = "+ soma);
	

	}

}
