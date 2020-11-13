package desafio;

import java.util.Scanner;

public class contaBank {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
				
		final double numeroConta; 
		//final double agencia;
		double saldo=0.0, saldoLimite=3000.0, pergunta2, auxiliar; 
		String cpf;
		char movimentacao,  pergunta;
		String cnpj; 
		double mov[] = new double[10];
		int contador = 0;
		
		do
		{
			contador++;
			System.out.println("Movimentação "+contador+"º de 10 para o dia.");
			System.out.println("Nesse momento o saldo de sua conta é de R$:"+saldo);
			System.out.println("E o limite especial de sua conta é de R$:"+saldoLimite);

			
			System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
			movimentacao= read.next().toUpperCase().charAt(0);
			
			while ((movimentacao!='C' | movimentacao!='D'))
			{
				System.out.println("ERROR!!! Entre coma letra correta.");
				System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
				movimentacao=read.next().toUpperCase().charAt(0);
			}
			
			if (movimentacao=='C')
			{
				System.out.println("Entre com o valor que deseja depositar: ");
				mov[contador-1]= read.nextDouble();
				saldo=saldo+mov[contador-1];
			}
			else
			{
				System.out.println("Entre com o valor que deseja retirar: ");
				mov[contador-1]= read.nextDouble();
				if(mov[contador-1]>saldo)
				{
					if(mov[contador-1]<=(saldo+saldoLimite))
					{
						System.out.println("Saldo da conta abaixo do valor solicitado. Deseja usar seu limite especial?: ");
						pergunta=read.next().toUpperCase().charAt(0);
						
						if (pergunta=='S')
						{
							System.out.println("O que deseja fazer? T - Retirar todo limite, A - Abater somente o valor que falta, M - Retirar manualmente.");
							pergunta=read.next().toUpperCase().charAt(0);
							
							while ((pergunta!='M') | (pergunta!='A') | (pergunta!='T'))
							{
								System.out.println("ERROR!!! Entre coma letra correta.");
								System.out.println("O que deseja fazer? T - Retirar todo limite, A - Abater somente o valor que falta, M - Retirar manualmente.");
								pergunta=read.next().toUpperCase().charAt(0);
							}	
							
							if (pergunta=='T')
							{
								saldo=(saldo+saldoLimite);
								saldo=(saldo-mov[contador-1]);
								saldoLimite=(saldoLimite-saldoLimite);
							}
							else if (pergunta=='M')
							{
								System.out.println("Quanto deseja retirar do seu limite? Limite = R$"+saldoLimite+" Valor necessario para o debito = R$"+((mov[contador-1]-saldo)));
								pergunta2=read.nextDouble();
								while (pergunta2>saldoLimite || pergunta2<(mov[contador-1]+saldo))
								{
									System.out.println("ERROR!!! Valor solicitado acima do limite ou não cobre o valor necessario para o debito.");
									System.out.println("Quanto deseja retirar do seu limite? Limite = R$"+saldoLimite+" Valor necessario para o debito = R$"+((mov[contador-1]-saldo)));
									pergunta2=read.nextDouble();
									
								}			
								saldo= ((saldo+pergunta2)-mov[contador-1]);	
								saldoLimite=(saldoLimite-pergunta2);
							}
							else 
							{
								saldoLimite=(saldoLimite-(mov[contador-1]+saldo));
								saldo=0;
							}
						}
					}
					else
					{
						System.out.println("Você não tem saldo suficiente e seu limite não cobre essa operação!");
					}
				}
				else
				{
					saldo=(saldo-mov[contador-1]);
				}
			}			
			
			System.out.println("DESEJA FAZER OUTRA MOVIMENTAÇÃO? ");
			pergunta=  read.next().toUpperCase().charAt(0);
		}while(contador<10 & pergunta=='S');

	}

}
