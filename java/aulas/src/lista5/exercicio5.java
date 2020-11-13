package lista5;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner teclado1 = new Scanner(System.in);
		double v[] = new double[5];
		int cod=0;
		for (int x=0;x<5;x++)
		{
			System.out.print( "Digite o valor para o vetor "+x+1+" : ");
			v[x] = teclado1.nextDouble();
		}
		System.out.print( "\nDigite um codigo 1 ou 2 ou 0: ");
		cod = teclado1.nextInt();
		while (cod<0 || cod>2)
		{
			System.out.print( "\nERROR!Digite um codigo 1 ou 2 ou 0: ");
			cod = teclado1.nextInt();
		}
		if (cod==0)
		{
			System.out.print( "Fim do programa!");
		}
		else if (cod==1)
		{
			System.out.print( "\nVetor= ");
			for (int x=0;x<5;x++)
			{
				System.out.print( "| "+v[x]+" ");
			}
			System.out.print( "|");
		}
		else 
		{
			System.out.print( "\nVetor= ");
			for (int x=4;x>=0;x--)
			{
				System.out.print( "| "+v[x]+" ");
			}
			System.out.print( "|");
		}
	}
}