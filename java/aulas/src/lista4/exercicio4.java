package lista4;

import java.util.Random;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner teclado1 = new Scanner(System.in);
		
		final int T=3 ;
		int Mq[][] = new int[T][T],sd=0;
		Random random = new Random();
		
		for (int x=0;x<T;x++)//linha
		{
			for (int y=0;y<T;y++)//coluna
			{
				Mq[x][y] = random.nextInt(9);
				if (x==y)
				{
					sd = sd+Mq[x][y];
				}
				System.out.print( Mq[x][y]+ " ");
			}
			System.out.print( "\n");
		}
		System.out.print( "Soma das diagonais é: "+ sd);

	}

}
