package Programas;

import java.util.Scanner;

import Classes.ContaCorrente;
import Classes.ContaEspecial;

public class CadConta {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		char opcao, pergunta;
		double valor;
		int menuOpcao, contador=0;
		
		 
		//iniciar programa
		
		

		
		//tela inicial
		System.out.print("==================================");   
        System.out.print("  Bem vindo ao banco G3!  ");
        System.out.print("==================================");
        //leitura menu principal
        System.out.print("\n1 - Conta Corrente.");
        System.out.print("\n2 - Conta Poupança.");
        System.out.print("\n3 - Conta Especial");
        System.out.print("\n4 - Conta Empresarial");
        System.out.print("\nSelecione o número da opção desejada: ");
        menuOpcao = leia.nextInt();
        
        if(menuOpcao==1)
        { 
           
        }
            
        else if(menuOpcao==2)
        { 
           
        }
        
        
        else if(menuOpcao==3)
        {
                int numeroConta;
                double limite=3000, valor2;
                
                //iniciando Conta Especial
                System.out.print("\nBoa tarde você está em conta especial!");
                System.out.println("Entre com o numero da conta: ");
        		numeroConta= leia.nextInt();
        		        		
        		ContaEspecial ce1= new ContaEspecial(numeroConta, limite);
        	do
            {
            contador++;	
            	
            	//movimentando
        		System.out.print(contador+"ª movimentação de 5 para o dia.");
        		System.out.println("Olá cliente: "+numeroConta);
        		System.out.print("\nSeu SALDO : R$ "+ce1.getSaldo()+"\tSeu LIMITE: R$ "+ce1.getLimite());
                
                //tipo de movimentação
                System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
                pergunta= leia.next().toUpperCase().charAt(0);
                
                while ((pergunta!='C') & (pergunta!='D'))
                {
                    System.out.println("ERROR!!! Entre coma letra correta.");
                    System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
                    pergunta=leia.next().toUpperCase().charAt(0);
                }
                
                if (pergunta=='C')
                {
        			System.out.println("Qual o valor de Credito?: ");
        			valor= leia.nextDouble();
        			ce1.creditar(valor);
        		}
                else
        		{
        			//parte debito
        			System.out.println("Qual o valor de Dedito?: ");
        			valor= leia.nextDouble();
        			if (valor<=ce1.getSaldo())
        			{
        			ce1.debitar(valor);
        			} 
        			//aqui começa o game!
        			else if (valor>ce1.getSaldo() && valor<=ce1.getLimite()) 
        			{
        				System.out.println("Seu saldo está abaixo do valor solicitado, deseja acionar o limite? ");
        				System.err.println("N - Não; T - Retirar todo limite;  A - Abater somente o valor que falta;  M - Retirar manualmente.");
                        pergunta=leia.next().toUpperCase().charAt(0);
                        while ((pergunta!='M') & (pergunta!='A') & (pergunta!='T') & (pergunta!='N'))
                        {
                            System.out.println("ERROR!!! Entre coma letra correta.");
                            System.out.println("O que deseja fazer? N - Não; T - Retirar todo limite, A - Abater somente o valor que falta, M - Retirar manualmente.");
                            pergunta=leia.next().toUpperCase().charAt(0);
                        }  
                        if (pergunta=='T')
                        {
                        	ce1.usarLmite(ce1.getLimite());
                        }
                        else if (pergunta=='M')
                        {
                            System.out.println("Quanto deseja retirar do seu limite? Limite = R$"+ce1.getLimite()+" Valor necessario para o debito = R$"+(valor-ce1.getSaldo()));
                            valor2=leia.nextDouble();
                            while (valor2>ce1.getLimite() || valor2<(valor-ce1.getSaldo()))
                            {
                                System.out.println("ERROR!!! Valor solicitado acima do limite ou não cobre o valor necessario para o debito.");
                                System.out.println("Quanto deseja retirar do seu limite? Limite = R$"+ce1.getLimite()+" Valor necessario para o debito = R$"+(valor-ce1.getSaldo()));
                                valor2=leia.nextDouble();                                
                            }
                            //ce1.setLimite(ce1.getLimite()-valor2);
                            ce1.usarLmite(valor2); 
                        }
                        else if (pergunta=='A')
                        {
                        	ce1.usarLmite(valor);
                        }
                    ce1.debitar(valor);
        			}
        		}
                
                System.out.print("\nSeu SALDO : R$ "+ce1.getSaldo()+"\tSeu LIMITE: R$ "+ce1.getLimite());
                //continuar a movimentar
                System.out.println("DESEJA FAZER OUTRA MOVIMENTAÇÃO? ");
                pergunta=  leia.next().toUpperCase().charAt(0);
                if(contador==5)
                {
                    System.out.println("Você atingiu o limite de 5 movimentações diarias!");
                }
            }while(contador<5 & pergunta=='S');
            System.out.println("Fim de programa!");
        }
        
        
        else if(menuOpcao==4)
        {   
            
        }

        
	}

}
