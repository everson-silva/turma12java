package lista4;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado1 = new Scanner(System.in);
		
		int n[] = new int[5],m=0;
		for (int x=0;x<5;x++)
		{
			System.out.print( "Entre com a "+(x+1)+"º pontuação: ");
			n[x] = teclado1.nextInt();
		
			if (n[x]>m)
			{
				m = n[x];
			}
		}
		for (int x=0;x<5;x++)
		{
			System.out.print( "\nA "+(x+1)+"º pontuação é: "+n[x]);
		}
		System.out.print( "\n\nA maior pontuação é: "+ m+"\n");

	}

}
