package lista3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado1 = new Scanner(System.in);
		
		int n;
		System.out.print( "Digite um numero positivo maior que 0: ");
		n = teclado1.nextInt();
		
		while (n<=0)
		{
			System.out.print( "Error! Digite um numero positivo maior que 0: ");
			n = teclado1.nextInt();
			
		}
		System.out.print( n+" ");
		while (n<=100)
		{
			n = n*3;
			System.out.print( n+" ");

		}
		
	}

}
