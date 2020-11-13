package lista4;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado1 = new Scanner(System.in);
		
		final int l=10 ;
		int lan[] = new int[l],s=0,m=0,c=0;
		
		
		for (int x=0;x<l;x++)
		{
			lan[x] = ((int) ((Math.random() * (6)) + 1));
			System.out.print( "\nValor na posição "+ (x+1)+"º é : "+ lan[x]);
			s = s+lan[x];
			if (lan[x]>m)
			{
				m = lan[x];
				c = 0;
			}
			if (m==lan[x])
			{
				c++;
			}
		}
		System.out.print( "\nSoma de todos os lançamentos: "+ s);
		System.out.print( "\nA media aritmética dos lançamentos é: "+s/l);
		System.out.print( "\nO maior valor é: "+ m+" e foi repetido "+c+" vezes.");

	}

}
