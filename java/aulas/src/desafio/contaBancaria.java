package desafio;

import java.io.InputStream;
import java.util.Scanner;

public class contaBancaria {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double numeroConta=0;
		//final double agencia;
		double saldo=0,saldoLimite=3000, pergunta2;
		String cpf,  resposta1;
		char movimentacao,pergunta;
		String cnpj;
		double mov[] = new double[10];
		int contador = 0;
		String nome;
		int menuOpcao;
		
		do
		{	
			System.out.println("Boa tarde, digite seu nome: ");
			nome = read.next();
			
			System.out.printf("Ol� Sr(a) %s, agora digite sua conta: ", nome);
			numeroConta = read.nextDouble();
			
			System.out.print("==================================");	
			System.out.print("  Bem vindo ao banco do ED!  ");
			System.out.print("==================================");
			//leitura menu principal
			System.out.print("\n1 - Conta Corrente.");
			System.out.print("\n2 - Conta Poupan�a.");
			System.out.print("\n3 - Conta Especial");
			System.out.print("\n4 - Conta Empresarial");
			System.out.print("\nSelecione o n�mero da op��o desejada: ");
			menuOpcao = read.nextInt();
			
			//Conta Corrente
			if(menuOpcao==1)
			{
				System.out.print("Boa tarde "+nome+" voc� est� em conta corrente!");
				System.out.print("Saldo at� o momento: "+saldo);
				
				do {
					contador++;
					System.out.println("Movimenta��o "+contador+"� de 10 para o dia.");
					
					System.out.println("Qual movimenta��o deseja fazer? C - Credito ou D - Debito.");
					movimentacao= read.next().toUpperCase().charAt(0);
					
					if (movimentacao=='C')
					{
						System.out.println("Entre com o valor que deseja depositar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo + mov[contador];
					}
					else if (movimentacao=='D')
					{
						System.out.println("Entre com o valor que deseja retirar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo - mov[contador];
					}
					else
					{
						System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
					}
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTA��O? ");
					resposta1= read.next();
				}while(contador<10 && resposta1=="SIM");
				
				
				
			}
			
			//Conta Poupan�a
			if(menuOpcao==2)
			{
				System.out.print("Boa tarde "+nome+" voc� est� em conta poupan�a!");
				System.out.print("Saldo at� o momento: "+saldo);
				
				do {
					contador++;
					System.out.println("Movimenta��o "+contador+"� de 10 para o dia.");
					
					System.out.println("Qual movimenta��o deseja fazer? C - Credito ou D - Debito.");
					movimentacao= read.next().toUpperCase().charAt(0);
					
					if (movimentacao=='C')
					{
						System.out.println("Entre com o valor que deseja depositar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo + mov[contador];
					}
					else if (movimentacao=='D')
					{
						System.out.println("Entre com o valor que deseja retirar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo - mov[contador];
					}
					else
					{
						System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
					}
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTA��O? ");
					resposta1= read.next();
				}while(contador<10 && resposta1=="SIM");
				
				
				
			}
			
			//Conta especial
			if(menuOpcao==3)
			{
				System.out.print("Boa tarde "+nome+" voc� est� em conta especial!");
				System.out.print("Saldo at� o momento: "+saldo);
				
				do
				{
					contador++;
					System.out.println("\nMovimenta��o "+contador+"� de 10 para o dia.");
					System.out.println("Nesse momento o saldo de sua conta � de R$:"+saldo);
					System.out.println("E o limite especial de sua conta � de R$:"+saldoLimite);

					
					System.out.println("Qual movimenta��o deseja fazer? C - Credito ou D - Debito.");
					movimentacao= read.next().toUpperCase().charAt(0);
					
					if (movimentacao=='C')
					{
						System.out.println("Entre com o valor que deseja depositar: ");
						mov[contador]= read.nextDouble();
						saldo=saldo+mov[contador];
					}
					else if (movimentacao=='D')
					{
						System.out.println("Entre com o valor que deseja retirar: ");
						mov[contador]= read.nextDouble();
						if(mov[contador]>saldo)
						{
							if(mov[contador]<=(saldo+saldoLimite))
							{
							System.out.println("Saldo da conta abaixo do valor solicitado. Deseja descontar do seu limite especial?: ");
							pergunta=read.next().toUpperCase().charAt(0);
								if (pergunta=='S')
								{
									System.out.println("Deseja retirar todo o seu limite?");
									pergunta=read.next().toUpperCase().charAt(0);
										if (pergunta=='S')
											{
												saldo=saldo+saldoLimite;
												saldo=saldo-mov[contador];
												saldoLimite=saldoLimite-saldoLimite;
											}
										else
										{
											System.out.println("Quanto deseja retirar do seu limite?");
											pergunta2=read.nextDouble();
											if (pergunta2<saldoLimite)
											{
												saldoLimite=saldoLimite-pergunta2;
												saldoLimite= saldoLimite-pergunta2;
											}
											else
											{
												System.out.println("ERROR!!! Valor solicitado acima do limite.");
											}
										}
								}
							}
							else
							{
								System.out.println("Voc� n�o tem saldo suficiente e seu limite n�o cobre essa opera��o!");
							}
							
						}
						
						
					}
					else
					{
						System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
						contador=contador-1;
					}
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTA��O? ");
					pergunta= read.next().toUpperCase().charAt(0);
				}while((contador<10) && (pergunta=='S'));
				
				
				
			}
			
			//Conta Empresarial
			if(menuOpcao==4)
			{
				System.out.print("Boa tarde "+nome+" voc� est� em conta empresarial!");
				System.out.print("Saldo at� o momento: "+saldo);
				
				do {
					
					System.out.println("Movimenta��o "+contador+"� de 10 para o dia.");
					
					System.out.println("Qual movimenta��o deseja fazer? C - Credito ou D - Debito.");
					movimentacao= read.next().toUpperCase().charAt(0);
					
					if (movimentacao=='C')
					{
						System.out.println("Entre com o valor que deseja depositar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo + mov[contador];
					}
					else if (movimentacao=='D')
					{
						System.out.println("Entre com o valor que deseja retirar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo - mov[contador];
					}
					else
					{
						System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
					}
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTA��O? ");
					resposta1= read.next();
					contador++;
				}while(contador<10 && resposta1=="SIM");
							
			}
			System.out.println("DESEJA FAZER MOVIMENTA��O EM OUTRA CONTA ? ");
			resposta1= read.next();
	contador++;
	}while(contador<10 && resposta1=="SIM");
	}
}
		