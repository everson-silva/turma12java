package desafio;

import java.util.Scanner;

public class desafiolistadetarefa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia;
		String dias[][]= new String [5][31];
		String tarefa;
		
		System.out.println("Entre com o dia que deseja cadastrar uma tarefa:");
		dia = leia.nextInt();
		
		
		
		for (int x=0; x<5; x++) 
		{
			System.out.print("Entre com a "+ (x+1) + "º tarefa do dia: ");
			dias[x][dia-1] = leia.nextLine();
		}
		
		System.out.println("Tarefas do dia "+dia+ "º: ");
		for (int x=0; x<5; x++) 
		{
			System.out.println(dias[x][dia-1]);
		}

	}

}
