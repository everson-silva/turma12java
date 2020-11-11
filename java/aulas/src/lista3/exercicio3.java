package lista3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado1 = new Scanner(System.in);
		
		double c=0.0,tS=0.0,m=0.0;
		int vL=0;
		while (c>=0)
		{
			System.out.print( "Entre com um numero positivo. Para parar coloque um numero negativo: ");
			c = teclado1.nextDouble();
			if (c>=0)
			{
				vL++;
				tS = tS+c;
				m = tS/vL;
			}
			
		}
		System.out.print( "Total do somatario: "+ tS+"\nMedia: "+ m+"\nTotal de valores lidos: "+ vL);
	

	}

}
