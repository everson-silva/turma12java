package lista4;
import java.util.Random;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado1 = new Scanner(System.in);
		
		final int l=10 ;
		int lan[] = new int[l],s=0,m=0,c=0;
		Random random = new Random();
		
		
		for (int x=0;x<l;x++)
		{
			lan[x] = random.nextInt(9);
			System.out.print( "\nValor na posi��o "+ (x+1)+"� � : "+ lan[x]);
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
		System.out.print( "\nSoma de todos os lan�amentos: "+ s);
		System.out.print( "\nA media aritm�tica dos lan�amentos �: "+s/l);
		System.out.print( "\nO maior valor �: "+ m+" e foi repetido "+c+" vezes.");

	}

}
