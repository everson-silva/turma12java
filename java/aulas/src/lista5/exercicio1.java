package lista5;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner teclado1 = new Scanner(System.in);
		
		
		double valor,vTotal;
		int pag;
		System.out.print( "Entre com o valor do produto: ");
		valor = teclado1.nextDouble();
		System.out.print( "Qual sera a forma de pagamento? \n1 - A vista em dinheiro ou cheque: \n2 - A vista no cartao de credito: \n3 - Em duas vezes: \n4 - Em tres vezes: \n");
		pag = teclado1.nextInt();
		while (pag<1 || pag>4)
		{
			System.out.print( "ERROR!Entre com um numero inteiro de 1 a 4!\n");
			pag = teclado1.nextInt();
		}
		if (pag==1)
		{
			vTotal = valor*0.8;
		}
		else if (pag==2)
		{
			vTotal = valor*0.85;
		}
		else if (pag==3)
		{
			vTotal = valor;
		}
		else 
		{
			vTotal = valor*1.1;
		}
		System.out.print( "\nValor total da compra: R$ "+vTotal);


	}

}
