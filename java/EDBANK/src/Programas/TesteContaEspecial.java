package Programas;

import java.util.Scanner;

import Classes.ContaEspecial2;

public class TesteContaEspecial {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int numeroConta, contador=0;
        double limite=3000, valor;
        char pergunta;
        
        //iniciando Conta Especial
        System.out.println("\nOl�, voc� est� em conta especial!");
        System.out.println("\nEntre com o numero da conta: ");
		numeroConta= leia.nextInt();
		        		
		ContaEspecial2 ce2= new ContaEspecial2(numeroConta, limite);
		do
        {
        contador++;	
        	
        	//movimentando
    		System.out.println(contador+"� movimenta��o de 5 para o dia.");
    		System.out.println("\nOl� cliente: "+numeroConta);
    		System.out.println("\nSeu SALDO : R$ "+ce2.getSaldo()+"\nSeu LIMITE: R$ "+ce2.getLimite());
            
            //tipo de movimenta��o
            System.out.println("Qual movimenta��o deseja fazer?\n C - Credito ou D - Debito.");
            pergunta= leia.next().toUpperCase().charAt(0);
            
            while ((pergunta!='C') & (pergunta!='D'))
            {
                System.err.println("\nERROR!!! Entre coma letra correta.");
                System.out.println("\nQual movimenta��o deseja fazer? C - Credito ou D - Debito.");
                pergunta=leia.next().toUpperCase().charAt(0);
            }
            
            if (pergunta=='C')
            {
    			System.out.println("Qual o valor de Credito?: ");
    			valor= leia.nextDouble();
    			ce2.creditar(valor);
    		}
            else
    		{
    			//parte debito
    			System.out.println("Qual o valor de Dedito?: ");
    			valor= leia.nextDouble();
    			if (valor<=ce2.getSaldo())
    			{
    			ce2.debitar(valor);
    			} 
    			//aqui come�a o game!
    			else if (valor>ce2.getSaldo() && valor<=ce2.getLimite()) 
    			{
    				System.out.println("Seu saldo est� abaixo do valor solicitado, deseja acionar o limite? [S/N]");
    				pergunta=leia.next().toUpperCase().charAt(0);
    				if(pergunta=='N') 
    				{
    					System.err.println("Movimenta��o CANCELADA!");
    					contador-=1;
    				}
    				else 
    				{
    					System.out.println("Deseja: T - Retirar todo limite;  A - Abater somente o valor que falta;  M - Retirar manualmente.");
    					pergunta=leia.next().toUpperCase().charAt(0);
    					while ((pergunta!='M') & (pergunta!='A') & (pergunta!='T'))
    					{
                        System.err.println("ERROR!!! Entre coma letra correta.");
                        System.out.println("O que deseja fazer? T - Retirar todo limite, A - Abater somente o valor que falta, M - Retirar manualmente.");
                        pergunta=leia.next().toUpperCase().charAt(0);
    					}  
    					ce2.usarLmite(pergunta, valor);
                    
    				}
    			}
    			else
    			{
    				System.err.println("ERROR!!! VOC� N�O TEM MAIS LIMITE DISPONIVEL E SEU SALDO N�O COBRE A MOVIMENTA��O!");
    			}
    			
    		}
            System.out.println("Restam-lhe "+(5-contador)+" movita��es para o dia.");
            System.out.println("\nSeu SALDO : R$ "+ce2.getSaldo()+"\tSeu LIMITE: R$ "+ce2.getLimite());
            //continuar a movimentar
            System.out.println("\nDESEJA FAZER OUTRA MOVIMENTA��O? ");
            pergunta=  leia.next().toUpperCase().charAt(0);
            if(contador==5)
            {
                System.err.println("\nVoc� atingiu o limite de 5 movimenta��es diarias!");
            }
        }while(contador<5 & pergunta=='S');
        System.out.println("\nFim de programa!");
	}

}
