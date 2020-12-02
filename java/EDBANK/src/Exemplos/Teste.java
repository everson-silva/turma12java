package Exemplos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int notas[]=new int[4];
		String nome;
		int qtde;
		
		try 
		{
			System.out.println("Sistema de notas");
			System.out.println("Digite o nome do aluno: ");
			nome = leia.nextLine();
			System.out.println("Digite a quantidade de notas");
			qtde=leia.nextInt();
			for (int x=0; x<qtde;x++)
			{
				System.out.println("Digite a nota "+(x+1)+ " : ");
				notas[x] = leia.nextInt();
			}
		} //fim do try
		catch (java.util.InputMismatchException erro)
		{
			System.out.println("Você não digitou um numero inteiro!");
		}
		catch (java.lang.ArrayIndexOutOfBoundsException erro)
		{
			System.out.println("Tamanho do vetor está errado.");
		}

		System.out.println("Todas as notas cadastradas!!!");
		System.out.println("Obrigado, fim de programa.");
	}

}
